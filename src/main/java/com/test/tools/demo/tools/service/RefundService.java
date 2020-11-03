package com.test.tools.demo.tools.service;

import com.test.tools.demo.tools.remote.RefundApi;
import com.test.tools.demo.tools.request.RefundBodyReq;
import com.test.tools.demo.tools.request.RefundReq;
import com.test.tools.demo.tools.response.RefundRes;
import com.test.tools.demo.tools.response.ServerResult;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class RefundService {
    private RefundApi refundApi;

    public  ServerResult<List<RefundRes>> refund(String area, List<RefundReq> refundBodyReqs){
        //构建参数
        List<RefundReq> reqs = new ArrayList<>();
        for (RefundReq params :refundBodyReqs){
            RefundReq req = buildRefundReq(params.getRegistId(),params.getStudentId());
            reqs.add(req);
        }
        ServerResult<List<RefundRes>> result =refundApi.toRefund(area,reqs);
        return result;
    }




    public RefundReq buildRefundReq(String registId, String studentId) {
        RefundReq req = new RefundReq();
        int cflat =0;
        String reasonId="";
        String reasonName="";
        String operatorId="";
        String serviceCenterId="";
        req.setCflat(cflat);
        req.setReasonId(reasonId);
        req.setReasonName(reasonName);
        req.setOperatorId(operatorId);
        req.setServiceCenterId(serviceCenterId);
        req.setRegistId(registId);
        req.setStudentId(studentId);
        return req;
    }
}
