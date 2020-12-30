package com.test.tools.demo.tools.remote;

import com.test.tools.demo.tools.request.WorkOrderQueryReq;
import com.test.tools.demo.tools.request.WorkOrderSaveReq;
import com.test.tools.demo.tools.response.ServerResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "callcenter",url = "http://call-center-beta.speiyou.cn/call-center")
public interface CallCenterApi {
    /**
     * http://apidoc.speiyou.cn/api/view/5763#
     * @param userNumber
     * @param req
     * @return
     */
    @PostMapping(value = "/workorder/save")
    ServerResult<String> workOrderSave(@RequestHeader("userNumber")String userNumber, @RequestBody WorkOrderSaveReq req);

    /**
     * http://apidoc.speiyou.cn/api/view/5753#
     */
    @PostMapping(value = "workorder/query")
    ServerResult<String> workOrderQuery(@RequestHeader("emoNo")String emoNo, @RequestHeader("userNumber")String userNumber,
                                        @RequestBody WorkOrderQueryReq req);








}
