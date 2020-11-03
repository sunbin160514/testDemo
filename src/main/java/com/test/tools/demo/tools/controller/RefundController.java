package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.request.RefundReq;
import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("demo")
public class RefundController {
    @Autowired
    private RefundService refundService;

    @GetMapping("/toRefund")
    public ServerResult toRefund(@RequestHeader("area") String area, @RequestParam("registId") String registId, @RequestParam("studentId") String studentId) {
//        for ()
        RefundReq req = refundService.buildRefundReq(registId,studentId);
        List<RefundReq> reqList = new ArrayList<>();
        reqList.add(req);
        return refundService.refund(area,reqList);
    }

}
