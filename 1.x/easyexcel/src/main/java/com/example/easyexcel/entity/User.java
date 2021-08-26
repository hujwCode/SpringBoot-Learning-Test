package com.example.easyexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
/**
 * 学生实体类
 *
 * @author 胡佳伟
 */
@Data
public class User {
    @ExcelProperty(value = "学生编号",index = 0)
    private Integer userNo;
    @ExcelProperty(value = "学生姓名",index = 1)
    private String userName;
}