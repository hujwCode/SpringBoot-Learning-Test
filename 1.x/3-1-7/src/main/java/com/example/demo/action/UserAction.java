package com.example.demo.action;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author : 胡佳伟
 * @version : 1.0.0
 * @date : 2021/8/18
 */
@RestController
@RequestMapping("/user")
public class UserAction {

    @PostMapping("/save")
    public User saveUser(User user) {
        LocalDateTime localDate = LocalDateTime.now();
        user.setBirthday(localDate);
        System.out.println(1212);
        // souttt
        return user;
    }
}
