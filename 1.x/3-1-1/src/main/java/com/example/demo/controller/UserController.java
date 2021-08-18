package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author : 胡佳伟
 * @version : 1.0.0
 * @date : 2021/8/17
 */
@RestController
@RequestMapping("/user")
public class UserController {
    static Map<Long, User> users = Collections.synchronizedMap(new ConcurrentHashMap<>());
    static List list = Collections.synchronizedList(new CopyOnWriteArrayList<>());

    /**
     * 查所有用户
     * @return
     */
    @GetMapping("/")
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>(users.values());
        return userList;
    }

    /**
     * 增加用户
     * @param user
     * @return
     */
    @PostMapping(value="/")
    public String postUser(@ModelAttribute User user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        users.put(user.getId(), user);
        return "success";
    }

    /**
     * 通过ID查用户
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {

        return users.get(id);
    }

    /**
     * 修改
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    public User putUser(@PathVariable Long id, @ModelAttribute User user) {
        User u = users.get(id);
        u.setId(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id,u);
        return users.get(id);
    }

    /**
     * 通过id删除
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String delUser(@PathVariable Long id){
        users.remove(id);
        return "success";
    }
}
