package com.zxd.utils.springbootsimple.data.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @program: spring-boot-simple-data
 * @description: 推送定时打印日志
 * @author: Mr.Zhao
 * @create: 2019-07-11 22:01
 **/
@Service
public class ScheduledService {

    /**
     * second(秒) , minute(分), hour(时), day of month(日), month and day of week(周几).
     *  {@code "0 * * * * MON-FRI"}
     *  [0 0/5 14,18 * * ?]每天14点整和16点整，每隔5分钟执行一次
     *  [0 15 10 ? * 1-6]每个月的周一至周六10：15分执行一次
     *  [0 0 2 LW * ?] 每个月的最后一个工作日凌晨2点执行一次
     *  [0 0 2-4 ? *  1#1]每个月的第一个周一凌晨2点到4点期间,每个整点都执行一次
     */
    @Scheduled(cron = "0 * * * * MON-SAT")
    public void hello(){
        System.out.println("打印日志---");
    }
}
