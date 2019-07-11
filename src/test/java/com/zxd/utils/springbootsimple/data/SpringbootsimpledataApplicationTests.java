package com.zxd.utils.springbootsimple.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootsimpledataApplicationTests {

    @Autowired
    JavaMailSender javaMailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //邮件设置
        simpleMailMessage.setSubject("通知，今晚开会");
        simpleMailMessage.setText("今晚7：30开会");
        simpleMailMessage.setTo("pangdongz@126.com");
        simpleMailMessage.setFrom("953686317@qq.com");
        javaMailSender.send(simpleMailMessage);
    }

}
