package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.impl.RegistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo")
public class RegistTradeController {
    @Autowired
    private RegistServiceImpl registService;
    @GetMapping("/getRegistByClassId")
    public ServerResult getRegistById(@RequestHeader("area") String area, @RequestParam("classId") String classId){
//               return registService.registByClassId(classId, area);
        ServerResult result= new ServerResult();
        result.setData(registService.registByClassId(classId,area));
        return result;

    }



}
