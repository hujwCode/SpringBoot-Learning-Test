package com.example.easyexcel.action;

import com.alibaba.excel.EasyExcel;
import com.example.easyexcel.entity.User;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 用户action
 * @author hujw
 */
@Controller
public class UserAction {

    @PostMapping("/import")
    @ResponseBody
    public String importCustomerDaily(@RequestParam MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        List<User> userList = EasyExcel.read(inputStream)
                .head(User.class)
                .headRowNumber(0)
                // 设置sheet,默认读取第一个
                .sheet()
                // 设置标题所在行数
                .doReadSync();
        userList.forEach((user)->{
            File file1 = new File("C:\\Users\\hujw.BZT\\Desktop\\pwt\\0826学生-2\\"+user.getUserNo() + ". "+user.getUserName());
            if (!file1.isDirectory()) {
                file1.mkdirs();
            }
        });

        return userList.toArray().toString();
    }



    @SneakyThrows
    public static void main(String[] args) {
        // 需要输出数据的文件
        String path = ResourceUtils.getURL("classpath:").getPath();
        String filename = path + "static/0826_14班.xlsx";
        List<User> userList = EasyExcel.read(filename).head(User.class).sheet().headRowNumber(0).doReadSync();
        userList.forEach(System.out::println);
    }
}
