package com.zxd.utils.springbootsimple.data.controller;

import com.zxd.utils.springbootsimple.data.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-simple-data
 * @description:
 * @author: Mr.Zhao
 * @create: 2019-07-11 21:52
 **/
@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;
    @GetMapping(value = "/hello")
    public String hello() throws InterruptedException {
        asyncService.hello();
        return "success";
    }
}
