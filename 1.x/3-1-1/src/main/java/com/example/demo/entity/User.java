package com.example.demo.entity;

import lombok.Data;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @author : 胡佳伟
 * @version : 1.0.0
 * @date : 2021/8/17
 */
@Data
public class User {
    private Long id;
    private String name;
    private int age;
}
