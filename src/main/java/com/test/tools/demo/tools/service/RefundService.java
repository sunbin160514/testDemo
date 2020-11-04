package com.test.tools.demo.tools.service;

import com.test.tools.demo.tools.request.RefundBodyReq;
import com.test.tools.demo.tools.response.RefundRes;
import com.test.tools.demo.tools.response.ServerResult;

import java.util.List;

public interface RefundService {
    ServerResult<List<RefundRes>> refund(String area, List<RefundBodyReq> refundBodyReqs);
}
