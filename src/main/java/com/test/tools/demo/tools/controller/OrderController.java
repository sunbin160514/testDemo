package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.request.CreateOrderReqs;
import com.test.tools.demo.tools.response.CreateOrderResp;
import com.test.tools.demo.tools.response.DoSaveOrderResp;
import com.test.tools.demo.tools.service.OrderService;
import com.test.tools.demo.tools.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("demo")
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping("/toCreateOrder")
    public CreateOrderResp toCreateOrder(@RequestHeader("area") String area, @RequestBody List<CreateOrderReqs> reqs){
        return orderService.toCreateOrder(area,reqs);

    }

    /**
     * 对外提供的接口
     * @param area
     * @param reqs
     * @return
     */

    @PostMapping("/createOrder")
    public DoSaveOrderResp createOrder(@RequestHeader("area") String area, @RequestBody List<CreateOrderReqs> reqs){
        return orderService.createOrder(area,reqs);

    }




}
