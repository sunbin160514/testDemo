package com.test.tools.demo.tools.remote;

import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.request.RegistByClassIdReq;
import com.test.tools.demo.tools.response.RegistByClassIdRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "registTrade", url = "http://test.regist.trade.speiyou.com/mplat-trade-regist")
public interface RegistTradeApi {
    /**
     * 根据班级id查询报名记录
     * http://apidoc.speiyou.cn/api/view/4773#
     * @param registByClassIdReq
     * @param area
     * @param stage
     * @return
     */
    @PostMapping(value = "regist/getRegistByClassId")
    ServerResult<RegistByClassIdRes> getRegistByClassId(@RequestBody RegistByClassIdReq registByClassIdReq, @RequestHeader("area") String area, @RequestHeader(value = "X-CA-Stage") String stage);
}
