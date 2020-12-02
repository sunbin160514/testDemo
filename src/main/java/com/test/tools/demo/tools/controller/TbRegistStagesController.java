package com.test.tools.demo.tools.controller;


import com.test.tools.demo.tools.domain.TbRegistStages;
import com.test.tools.demo.tools.service.TbRegistStagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 购课单表 前端控制器
 * </p>
 *
 * @author sunbin
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/tb-regist-stages")
public class TbRegistStagesController {

    @Autowired
    private TbRegistStagesService registStagesService;

    @GetMapping("/getParamsByRegistId")
    public List<TbRegistStages> getParamsByRegistId(String registId) {
//        return tbRegistStagesService.getById("2cb240c88cec444095e910ca58b111cc");
        return registStagesService.getParamsByRegistId(registId);
    }

//    @GetMapping("/getFixedParamsByRegistId")
//    public List<TbRegistStages> getScockIdByRegistId(String registId){
//        return registStagesService.getScockIdByRegistId(registId);
//    }


}
