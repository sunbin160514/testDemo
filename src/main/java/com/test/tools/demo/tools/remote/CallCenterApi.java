package com.test.tools.demo.tools.remote;

import com.test.tools.demo.tools.response.ServerResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "callcenter",url = "http://call-center.speiyou.cn/call-center")
public interface CallCenterApi {


}
