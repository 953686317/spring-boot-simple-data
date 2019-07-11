package com.zxd.utils.springbootsimple.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync //开启异步注解
@SpringBootApplication
public class SpringbootsimpledataApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootsimpledataApplication.class, args);
    }

}
