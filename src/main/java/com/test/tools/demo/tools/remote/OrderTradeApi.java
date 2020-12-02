package com.test.tools.demo.tools.remote;


import com.test.tools.demo.tools.request.OrderReq;
import com.test.tools.demo.tools.response.OrderRes;
import com.test.tools.demo.tools.response.ServerResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "order",url = "http://test.order.trade.speiyou.com/mplat-trade-order")
public interface OrderTradeApi {
    @PostMapping(value = "fusionOrder/createOrder")
    ServerResult<OrderRes> createOrder(@RequestHeader("area") String area, @RequestHeader("cflat")String cflat,
                                       @RequestHeader("version")String version, @RequestBody OrderReq orderReq);


    @PostMapping(value = "fusionOrder/doSaveOrder")
    ServerResult<OrderRes> doSaveOrder(@RequestHeader("area") String area, @RequestHeader("cflat")String cflat,
                                             @RequestHeader("version")String version, @RequestBody OrderReq orderReq);

}
