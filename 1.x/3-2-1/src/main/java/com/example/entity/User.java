package com.example.entity;

import com.mysql.cj.xdevapi.Column;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * @PackageName: com.example.entity
 * @FileName: User.java
 * @Descriptions:
 * @Author: 胡佳伟
 * @Date: 2021/8/25 16:41
 * @Updater:
 * @Content:
 * @Copyright: (C)2021 苏州百智通信息技术有限公司. All rights reserved.
 */
@Data
public class User {
    private String name;
    private String age;
}
