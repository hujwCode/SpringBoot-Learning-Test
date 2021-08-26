package com.example.dao.impl;

import com.example.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @PackageName: com.example.dao.impl
 * @FileName: UserDaoImpl.java
 * @Descriptions:
 * @Author: 胡佳伟
 * @Date: 2021/8/25 16:33
 * @Updater:
 * @Content:
 * @Copyright: (C)2021 苏州百智通信息技术有限公司. All rights reserved.
 */
@Component
public class UserDaoImpl implements IUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * (更新)<br>
     *
     * @param name
     * @param age
     * @return int
     * @author 胡佳伟
     */
    @Override
    public int insert(String name, Integer age) {
        int update = jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
        return update;
    }

    /**
     * (删除)<br>
     *
     * @param name
     * @return int
     * @author 胡佳伟
     */
    @Override
    public int deleteByName(String name) {
        int update = jdbcTemplate.update("delete from USER where NAME = ?", name);

        return update;
    }

    @Override
    public int getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
//        return 0;
    }

    @Override
    public int deleteAllUsers() {
        return jdbcTemplate.update("delete from USER");
    }
}
