package com.example.service;

import com.example.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/17 下午6:44.
 * @blog http://blog.didispace.com
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private IUserDao userDao;

    @Override
    public void create(String name, Integer age) {
        userDao.insert(name, age);
    }

    @Override
    public void deleteByName(String name) {
        userDao.deleteByName(name);
    }

    @Override
    public Integer getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void deleteAllUsers() {
        userDao.deleteAllUsers();
    }
}
