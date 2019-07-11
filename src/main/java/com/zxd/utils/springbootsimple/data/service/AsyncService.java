package com.zxd.utils.springbootsimple.data.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @program: spring-boot-simple-data
 * @description: 异步调用
 * @author: Mr.Zhao
 * @create: 2019-07-11 21:51
 **/
@Service
public class AsyncService {

    //告诉Spring 这是一个异步方法  入口记得加@EnableAsync
    @Async
    public void hello() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("处理数据ing");
    }
}
