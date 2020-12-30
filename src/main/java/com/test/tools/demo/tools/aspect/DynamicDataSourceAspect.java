package com.test.tools.demo.tools.aspect;

import com.test.tools.demo.tools.annotation.DataSourceSign;
import com.test.tools.demo.tools.datasource.DataSourceContextHolder;
import com.test.tools.demo.tools.enums.ContextConst;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Order(-1)
@Aspect

public class DynamicDataSourceAspect {
    @Before("execution(* com.test.tools.demo.tools.service..*.*(..))")
    public void before(JoinPoint point) {
        try {
            DataSourceSign annotationOfClass = point.getTarget().getClass().getAnnotation(DataSourceSign.class);

            String methodName = point.getSignature().getName();

            Class[] parameterTypes = ((MethodSignature) point.getSignature()).getParameterTypes();

            Method method = point.getTarget().getClass().getMethod(methodName, parameterTypes);

            DataSourceSign methodAnnotation = method.getAnnotation(DataSourceSign.class);

            methodAnnotation = methodAnnotation == null ? annotationOfClass : methodAnnotation;

            ContextConst.DataSourceType dataSourceType = methodAnnotation != null &&
                    methodAnnotation.value() != null ? methodAnnotation.value() : ContextConst.DataSourceType.PRIMARY;
            DataSourceContextHolder.setDataSource(dataSourceType.name());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @After("execution(* com.test.tools.demo.tools.service..*.*(..))")
    public void after(JoinPoint point) {
        DataSourceContextHolder.clearDataSource();
    }
}
