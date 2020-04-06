package com.laowang.sptest.controller;

import com.laowang.sptest.service.Test;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Slf4j
@EnableAutoConfiguration
@Controller
@Api(description = "测试controller.")
public class HelloController {

    @Autowired
    Test test;

    @RequestMapping(value="/",method = RequestMethod.POST)
    @ResponseBody
    public String getHello(){
        log.info("正常输出");
        return "hello";
    }
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "query", value = "查询", required = true, dataType = "String")
    })
    @RequestMapping(value="/test",method = RequestMethod.POST)
    @ResponseBody
    public void save(String query){
        test.save(query);
    }

}
