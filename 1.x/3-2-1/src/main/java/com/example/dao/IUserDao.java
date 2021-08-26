package com.example.dao;

/**
 * @PackageName: com.example.dao
 * @FileName: IUserDao.java
 * @Descriptions:
 * @Author: 胡佳伟
 * @Date: 2021/8/25 16:32
 * @Updater:
 * @Content:
 * @Copyright: (C)2021 苏州百智通信息技术有限公司. All rights reserved.
 */
public interface IUserDao {
    /**
     * (插入)<br>
     *
     * @param name
     * @param age
     * @return int
     * @author 胡佳伟
     */
    int insert(String name, Integer age);

    /**
     * (删除)<br>
     *
     * @param name
     * @return int
     * @author 胡佳伟
     */
    int deleteByName(String name);

    int getAllUsers();

    int deleteAllUsers();
}
