package com.topband.springbootdemo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/testHello")
    @ResponseBody
    public String hello(){
        System.out.println("hello world");
        return "success";
    }


}
