package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.request.RefundBodyReq;
import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.impl.RefundServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("demo")
public class RefundController {
    @Autowired
    private RefundServiceImpl refundService;
    @PostMapping("/toRefund")
    public ServerResult toRefund(@RequestHeader("area") String area, @RequestBody List<RefundBodyReq>  refundBodyReqs) {
       return refundService.refund(area,refundBodyReqs);
    }

}
