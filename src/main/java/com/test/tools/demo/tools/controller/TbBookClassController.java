package com.test.tools.demo.tools.controller;


import com.test.tools.demo.tools.domain.TbBookClass;
import com.test.tools.demo.tools.service.TbBookClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sunbin
 * @since 2020-11-18
 */
@RestController
@RequestMapping("/tb-book-class")
public class TbBookClassController {

    @Autowired
    private TbBookClassService bookClassService;

    @GetMapping("/getRegistByClassId")
    public String getRegistById(){
        TbBookClass bookClass = bookClassService.getById("01afb5b4d00c4ad68a008e84e90819ed");
        if (null != bookClass) {
            String classId = bookClass.getClassId();
        }
        return "111111111111111111111";
    }



}
