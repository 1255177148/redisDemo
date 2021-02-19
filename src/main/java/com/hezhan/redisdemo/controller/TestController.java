package com.hezhan.redisdemo.controller;

import com.hezhan.redisdemo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Date 2021/2/19 17:52
 * @Author hezhan
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.test();
    }
}
