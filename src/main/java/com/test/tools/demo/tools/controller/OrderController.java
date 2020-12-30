package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.request.CreateOrderReqs;
import com.test.tools.demo.tools.response.CreateOrderResp;
import com.test.tools.demo.tools.response.DoSaveOrderResp;
import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("demo")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/toCreateOrder")
    public ServerResult<CreateOrderResp> toCreateOrder(@RequestHeader("area") String area, @RequestBody List<CreateOrderReqs> reqs) {
        ServerResult result = new ServerResult();
        CreateOrderResp resp= orderService.toCreateOrder(area, reqs);
        result.setData(resp);
        return result;

    }

    /**
     * 对外提供的接口
     *
     * @param area
     * @param reqs
     * @return
     */

    @PostMapping("/createOrder")
    public ServerResult<DoSaveOrderResp> createOrder(@RequestHeader("area") String area, @RequestBody List<CreateOrderReqs> reqs) {
        ServerResult result = new ServerResult();
        DoSaveOrderResp dosave = orderService.createOrder(area, reqs);
        result.setData(dosave);
        return result;

    }


}
