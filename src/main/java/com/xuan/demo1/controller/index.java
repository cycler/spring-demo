package com.xuan.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/index")
public  class index {
    
    @GetMapping("/test1")
    public String test1(){
        return "hello test1";
    }

    @GetMapping("/test2")
    public String test2(){
        return "run test2";
    }
    
    @ResponseBody
    @PostMapping(value="post1")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        return "result: " + entity;
    }
    
    
}
