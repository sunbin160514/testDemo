package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.service.ParmaryUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class DataController {
    @Autowired
    private ParmaryUserService parmaryUserService;

//    @RequestMapping("login")
//    public List<User> login(Integer type){
//        switch (type){
//            case 1:
//                return parmaryUserService.sellPrimary();
//            case 2:
//                return parmaryUserService.sellProd();
//            default:
//                return parmaryUserService.sellLocal();
//        }
//    }
}
