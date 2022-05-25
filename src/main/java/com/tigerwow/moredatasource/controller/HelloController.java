package com.tigerwow.moredatasource.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanhu
 * @date 5/25/22 10:13 PM
 */
@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
