package com.example.thymeleafdemo.entity;

import com.example.thymeleafdemo.action.DTOConvert;
import org.springframework.beans.BeanUtils;

public class UserInputDTOConvert implements DTOConvert {


    @Override
    public User convert(Object o) {
        User user = new User();
        BeanUtils.copyProperties(o,user);
        System.out.println(11);
        return user;
    }
}