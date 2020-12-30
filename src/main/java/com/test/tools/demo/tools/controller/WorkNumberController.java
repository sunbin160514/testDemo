package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.service.impl.WorkNumberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class WorkNumberController {
    @Autowired
    private WorkNumberServiceImpl workNumberService;
    @GetMapping("/getById")
    public Object GetWorkNumber(int type){
        return  workNumberService.Sel(type);
    }

//    @GetMapping("/insert")
//    public void insertWorkNumber(WorkNumber workNumber){
//        studentId, classId;
//        结果 = regiseterClient.(参数);
//        掉自己service(结果);
//        生成订单：
//        组装写库方法的入参
//        workNumberService.insert(workNumber);
//    }


}
