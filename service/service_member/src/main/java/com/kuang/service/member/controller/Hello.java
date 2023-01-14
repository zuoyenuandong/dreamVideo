package com.kuang.service.member.controller;


import com.kuang.service.member.config.NacosConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    NacosConfig nacosConfig;

    @GetMapping("/hello")
    public String test(){
        return nacosConfig.getText();
    }
}
