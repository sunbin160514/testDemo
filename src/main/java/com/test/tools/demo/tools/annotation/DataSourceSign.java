package com.test.tools.demo.tools.annotation;

import com.test.tools.demo.tools.enums.ContextConst;

import java.lang.annotation.ElementType;
import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSourceSign {
    /**
     * 默认连接
     * @return PRIMARY
     */
    ContextConst.DataSourceType value() default ContextConst.DataSourceType.PRIMARY;
}
