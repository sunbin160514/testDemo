package com.test.tools.demo.tools;

import feign.RequestInterceptor;
import feign.RequestTemplate;


public class FeignInterceptor implements RequestInterceptor {

    public void apply(RequestTemplate template) {
        template.header("area", "010");
        System.out.println("thisjlljjljl");
    }
}
