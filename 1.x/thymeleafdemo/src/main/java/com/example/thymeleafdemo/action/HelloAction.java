package com.example.thymeleafdemo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

        return modelAndView;
    }
}
