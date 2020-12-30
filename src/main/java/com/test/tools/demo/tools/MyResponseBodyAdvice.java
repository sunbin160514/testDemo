//package com.test.tools.demo.tools;
//
//
//import com.test.tools.demo.tools.response.ServerResult;
//import org.springframework.core.MethodParameter;
//import org.springframework.http.MediaType;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
//@ControllerAdvice
//public class MyResponseBodyAdvice implements ResponseBodyAdvice {
//    @Override
//    public boolean supports(MethodParameter methodParameter, Class aClass) {
//        return true;
//    }
//
//    @Override
//    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
//        //如果body为空，返回默认信息
//        if (body == null) {
//            return new ServerResult<>();
//        }
//        //匹配ResponseResult
//        if (body instanceof ServerResult) {
//            return body;
//        }
//        /**
//         * 其他情况直接将返回的信息直接塞在data中
//         */
//        ServerResult<Object> result = new ServerResult();
//        result.setData(body);
//        return result;
//    }
//}
