package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo")
public class RegistTradeController {
    @Autowired
    private RegistService registService;

    @GetMapping("/getClassRegistCount")
    public ServerResult getClassRegistCount(@RequestHeader("area") String area, @RequestParam("classIds") String classIds){
        return registService.classRegistCount(area,classIds);
    }


    @GetMapping("/getRegistById")
    public ServerResult getRegistById(@RequestHeader("area") String area, @RequestParam("classId") String classId){
               return registService.registByClassId(classId, area);
    }



}
