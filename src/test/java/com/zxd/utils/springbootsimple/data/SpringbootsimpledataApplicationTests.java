package com.zxd.utils.springbootsimple.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

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

    @Test
    public void test02() throws MessagingException {
        //创建一个复杂的消息邮件
        MimeMessage message = javaMailSender.createMimeMessage();
        //使用MimeMessageHelper 来进行加附件
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message,true);

        mimeMessageHelper.setText("<b style = 'color:red'>今天7:30开会</b>");
        mimeMessageHelper.setTo("pangdongz@126.com");
        mimeMessageHelper.setFrom("953686317@qq.com");
        mimeMessageHelper.addAttachment("1.jpg",new File("C:\\Users\\Administrator\\Pictures\\Warframe\\1.jpg"));

        javaMailSender.send(message);
    }

}
