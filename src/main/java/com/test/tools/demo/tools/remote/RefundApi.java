package com.test.tools.demo.tools.remote;

import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.request.RefundReq;
import com.test.tools.demo.tools.response.RefundRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "refund",url = "http://refund-trade.speiyou.com/mplat-trade-refund/refund")
public interface RefundApi {
    /**
     * http://apidoc.speiyou.cn/api/view/6431#
     * @param area
     * @param refundReqList
     * @return
     */
    @PostMapping(value = "employee/toRefund")
    ServerResult<List<RefundRes>> toRefund(@RequestHeader("area") String area, @RequestBody List<RefundReq> refundReqList);



}
