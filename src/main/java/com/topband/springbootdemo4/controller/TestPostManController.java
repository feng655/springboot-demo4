package com.topband.springbootdemo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestPostManController {

    /**
     * @param text
     * @return
     * 测试能接收全部类型的请求
     */
    @RequestMapping("/test")
    @ResponseBody
    public String testAll(String text) {
        System.out.println(text);
        return "hello world";
    }

    /**
     * @param text
     * @return
     *测试只能接收get类型的请求
     */
    @GetMapping("/test2")
    @ResponseBody
    public String testGet(String text){
        System.out.println(text);
        return text;
    }

    /**
     * @param text
     * @return
     * 测试只能只能接收post请求的方法
     */
    @PostMapping("/test3")
    @ResponseBody
    public String testPost(String text){
        System.out.println(text);
        return text;
    }
}
