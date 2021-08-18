package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;



/**
 * @author : 胡佳伟
 * @version : 1.0.0
 * @date : 2021/8/17
 */
@Data
@Component
@ConfigurationProperties(prefix = "pro1")
public class Properties1 {
    private String name;
    private int age;
}
