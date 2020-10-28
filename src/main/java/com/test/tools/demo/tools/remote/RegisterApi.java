package com.test.tools.demo.tools.remote;



import com.test.tools.demo.tools.response.SelectClassListRes;
import com.test.tools.demo.tools.response.ServerResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "register",url = "http://register.api.speiyou.cn/stone-register")
public interface RegisterApi {
    @RequestMapping(value = "/selectedClass/querySelectedClassList",method = RequestMethod.GET)
    ServerResult<List<SelectClassListRes>> querySelectedClassList(@RequestHeader("area") String area, @RequestHeader("cflat") String cflat, @RequestParam("studentId") String studentId);




}
