package com.test.tools.demo.tools.handler;

import com.test.tools.demo.tools.response.ServerResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ServerResult globalException(HttpServletResponse response, Exception ex) {
        log.info("GlobalExceptionHandler...");
        log.info("错误代码：" + response.getStatus());
        ServerResult result = new ServerResult();
        result.setRlt(false);
        result.setCode("999999");
        result.setMessage(ex.getMessage());
        return result;
    }

}
