package com.example.thymeleafdemo.action;

import com.example.thymeleafdemo.entity.User;
import com.example.thymeleafdemo.entity.UserInputDTO;
import com.example.thymeleafdemo.entity.UserInputDTOConvert;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * @author : 胡佳伟
 * @version : 1.0.0
 * @date : 2021/8/19
 */
@Controller
public class HelloAction {

    @RequestMapping("/")
    public ModelAndView hello(ModelAndView modelAndView) {
//        modelAndView.addObject("name","hjw");
        modelAndView.setViewName("login");
        HashMap hashMap = new HashMap();
        return modelAndView;
    }


    @PostMapping("/user")
    @ResponseBody
    public User addUser(@RequestBody UserInputDTO userInputDTO){
        User user = new UserInputDTOConvert().convert(userInputDTO);
//        User user = new User();
        System.out.println(user.toString());
        return user;
    }
}
