package com.test.tools.demo.tools.service.impl;

import com.test.tools.demo.tools.remote.RefundApi;
import com.test.tools.demo.tools.request.RefundBodyReq;
import com.test.tools.demo.tools.request.RefundReq;
import com.test.tools.demo.tools.response.RefundRes;
import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;


import java.util.ArrayList;
import java.util.List;

@Service
public class RefundServiceImpl implements RefundService {
    @Autowired
    private RefundApi refundApi;

    public ServerResult<List<RefundRes>> refund(String area, List<RefundBodyReq> refundBodyReqs) {
        //构建参数
        ServerResult<List<RefundRes>> result = new ServerResult();
        List<RefundReq> reqs = new ArrayList<>();
        if(!CollectionUtils.isEmpty(refundBodyReqs)) {
            for (RefundBodyReq params : refundBodyReqs) {
                RefundReq req = buildRefundReq(params.getRegistId(), params.getStudentId());
                reqs.add(req);
            }
            result = refundApi.toRefund(area, reqs);
        }
        return result;

    }


    /**
     * 组装退费入参
     *
     * @param registId
     * @param studentId
     * @return
     */
    private RefundReq buildRefundReq(String registId, String studentId) {
        RefundReq req = new RefundReq();
        req.setRegistId(registId);
        req.setStudentId(studentId);
        req.setCflat(11);
        req.setReasonId("002004");
        req.setReasonName("学员自动退费");
        req.setOperatorId("trojan");
        req.setServiceCenterId("204B055EB978410E8F393527FAD80D74");
        req.setNoNeedDeductMaterials(1);
        return req;
    }

}
