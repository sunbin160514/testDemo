package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.domain.CallCenterWork;
import com.test.tools.demo.tools.remote.CallCenterApi;
import com.test.tools.demo.tools.request.WorkOrderSaveReq;
import com.test.tools.demo.tools.request.WorkOrderSaveReqs;
import com.test.tools.demo.tools.response.SaveWorkOrderRes;
import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.CallCenterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;


@Slf4j
@RestController
@RequestMapping("demo")
public class CallCenterController {

    @Autowired
    private CallCenterApi callCenterApi;
    @Autowired
    private CallCenterService callCenterService;


    @PostMapping("/workOrderSave")
    ServerResult<SaveWorkOrderRes> workOrderSave(@RequestBody WorkOrderSaveReqs req) throws Exception {
        SaveWorkOrderRes res = saveWorkOrder(req);
        CallCenterWork workParams = new CallCenterWork();
        workParams.setWorkNumber(res.getWorkNumber());
        workParams.setOneClassify(req.getBusinessType1());
        workParams.setTwoClassify(req.getBusinessType2());
        workParams.setThreeClassify(req.getBusinessType3());
        workParams.setType(req.getType());
        workParams.setCreator(req.getUserNumber());
        workParams.setCreateTime(res.getDateTime());
        callCenterService.workInsert(workParams);
        ServerResult result = new ServerResult();
        result.setData(res);
        return result;
    }

    @GetMapping("/queryWorkByType")
    ServerResult<List<CallCenterWork>> queryWorkInfoByType(int type) {
        ServerResult result = new ServerResult();
        result.setData(callCenterService.queryWorkByType(type));
        return result;

    }

    @GetMapping("/queryWorkByNumber")
    ServerResult<CallCenterWork> queryWorkInfoByNumber(String number) {
        ServerResult result = new ServerResult();
        result.setData(callCenterService.queryWorkByNumber(number));
        return result;

    }


    private SaveWorkOrderRes saveWorkOrder(@RequestBody WorkOrderSaveReqs req) throws Exception {
        SaveWorkOrderRes res = new SaveWorkOrderRes();
        WorkOrderSaveReq workOrderSaveReq = buildReq(req);
        if ("".equals(req.getUserNumber())) {
            throw new Exception("坐席号不能为空");
        }
        ServerResult<String> result = callCenterApi.workOrderSave(req.getUserNumber(), workOrderSaveReq);
        if (result.isRlt() && "000000".equals(result.getCode())) {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
            res.setId(result.getData());
            res.setWorkNumber(result.getData());
            res.setType(req.getType());
            res.setUserNumber(req.getUserNumber());
            res.setDateTime(dateFormat.format(date));
        } else {
            throw new Exception("参数错误，保存失败");
        }
        return res;
    }

    private WorkOrderSaveReq buildReq(WorkOrderSaveReqs reqs) throws Exception {
        WorkOrderSaveReq req = new WorkOrderSaveReq();
        if (null != reqs) {
            if (StringUtils.isEmpty(reqs.getBusinessType1()) || StringUtils.isEmpty(reqs.getBusinessType2()) || StringUtils.isEmpty(reqs.getBusinessType3())) {
                log.info("一二三级不能为空");
                throw new Exception("一二三级不能为空");
            }
            req.setStudentId("206010000190").setStudentName("材料费测试6").setAreaCode("010").setStudentGrade("4")
                    .setOldStudent(1).setIdentity(1).setPhoneNumber("15100000000").setChannel(1).setCallRemind("CBR2")
                    .setProcessResult(1).setProcessProgress(1).setCallbackPhone("15100000000").setCallbackTime("1638959499")
                    .setCreator("").setCallLogId("CTI_CALL_ID_0001");
            req.setBusinessType1(reqs.getBusinessType1());
            req.setBusinessType2(reqs.getBusinessType2());
            req.setBusinessType3(reqs.getBusinessType3());
            req.setType(reqs.getType());
            Set<Integer> typeSet = new HashSet();
            typeSet.add(1);
            typeSet.add(2);
            typeSet.add(3);
            if (typeSet.contains(reqs.getType())) {
                if (reqs.getType() == 2 || reqs.getType() == 3) {
                    req.setSubject("SS5");
                    req.setComplaintDept("010");
                    req.setEmergency("UT2");
                    req.setAnonymous(1);
                    req.setProductionType("SP1");
                }
            } else {
                log.info("类型错误，请重新输入！");
                throw new Exception("类型错误，请重新输入!");
            }
            List<WorkOrderSaveReq.ContentListBean> contentList = new ArrayList<>();
            WorkOrderSaveReq.ContentListBean contentListBeans = new WorkOrderSaveReq.ContentListBean();
            contentListBeans.setContent("接口自动创建工单");
            contentListBeans.setContentType(1);
            contentList.add(contentListBeans);
            req.setContentList(contentList);

        }
        return req;
    }


}
