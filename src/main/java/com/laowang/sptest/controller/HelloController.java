package com.laowang.sptest.controller;

import com.laowang.sptest.model.TbContent;
import com.laowang.sptest.model.query.Query;
import com.laowang.sptest.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class HelloController {
    private static Logger log= Logger.getLogger("HelloController.class");
    @Autowired
    Test test;
    @RequestMapping("/")
    @ResponseBody
    public String getHello(){
        log.info("正常输出");
        return "hello";
    }
    @RequestMapping(value="/test",method = RequestMethod.POST)
    public void save(String query){
        test.save(query);
    }

}
