package com.test.tools.demo.tools.remote;




import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name = "register",url = "http://register.api.speiyou.cn/stone-register")
public interface RegisterApi {




}
