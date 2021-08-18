package com.example.demo.web;

import com.example.demo.Properties1;
import com.example.demo.Properties2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@RestController
public class HelloController {
    @Autowired
    private Properties1 properties1;
    @Autowired
    private Properties2 properties2;
    @RequestMapping("/hello")
    public String index() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(properties1.toString()).append(",").append(properties2.toString());

        return stringBuilder.toString();
    }

}