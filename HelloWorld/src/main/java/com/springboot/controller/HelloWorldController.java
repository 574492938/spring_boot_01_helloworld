package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Hezx
 * @ClasName :HelloWorldController
 * @date :2019/3/22
 * TODO 测试 controller
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(@RequestParam String  name){
      return  "Hello World ! My Name is :"+name;
    }
}
