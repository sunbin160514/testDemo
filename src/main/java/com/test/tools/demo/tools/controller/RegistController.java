package com.test.tools.demo.tools.controller;

import com.test.tools.demo.tools.domain.QuerySelectedClassListDto;
import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("registerDemo")
public class RegistController {
    @Autowired
    private RegistService registService;

    @GetMapping("/querySelectedClassList")
    public ServerResult querySelectedClassList(@RequestHeader("area") String area, @RequestHeader("cflat") String cflat,
                                               @RequestParam("studentId") String studentId) {
        ServerResult serverResult = new ServerResult();
        List<QuerySelectedClassListDto> querySelectedClassListDtos = registService.selectedClassList(area, cflat, studentId);
        serverResult.setData(querySelectedClassListDtos);
        serverResult.setCode("00000");
        serverResult.setRlt(false);

        return serverResult;
    }

}
