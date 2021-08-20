package com.rick.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 胡佳伟
 * @version : 1.0.0
 * @date : 2021/8/19
 */
@Controller
public class ScheduleTasks {
    static final
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Scheduled(fixedDelay = 5000)
    public void getTime() {
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
