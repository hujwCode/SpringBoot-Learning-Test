package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : 胡佳伟
 * @version : 1.0.0
 * @date : 2021/8/17
 */
@Data
@Component
public class Properties2 {

    @Value("${pro2.name}")
    private String name;
    @Value("${pro2.age}")
    private int age;
}
