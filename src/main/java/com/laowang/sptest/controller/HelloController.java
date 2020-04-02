package com.laowang.sptest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class HelloController {
    private static Logger log= Logger.getLogger("HelloController.class");
    @RequestMapping("/")
    @ResponseBody
    public String getHello(){
        log.info("正常输出");
        return "hello";
    }
}
