package com.jks.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名：A
 * @描述：
 * @创建人 xlb
 * @创建时间 2018/11/12 16:18
 * @Version 1.0
 */
    @RestController
    public class HelloController {
        @RequestMapping("/hello")
        public String hello() {
            return "Hello Spring Boot xlb!";
        }

    @RequestMapping("/hello2")
    public String hello2() {
        return "Spring boot 中文测试开始13:36!";
    }
    }
