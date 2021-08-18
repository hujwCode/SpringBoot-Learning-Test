package com.example;

import com.example.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Objects;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class ApplicationTests {

	@Autowired
	private UserService userService;

	@BeforeEach
	void setUpBefore() {
		userService.deleteAllUsers();
//		System.out.println(1212);
	}


	@Test
	void contextLoads() {
		// 插入5个用户
		userService.create("a", 1);
		userService.create("b", 2);
		userService.create("c", 3);
		userService.create("d", 4);
		userService.create("e", 5);

		// 查数据库，应该有5个用户
//		Assert.assertEquals(5, userService.getAllUsers().intValue());
		boolean equals = Objects.equals(5, userService.getAllUsers().intValue());
		System.out.println(equals);
		// 删除两个用户
		userService.deleteByName("a");
		userService.deleteByName("e");

		// 查数据库，应该有5个用户
//		Assert.assertEquals(3, userService.getAllUsers().intValue());
		boolean equals2 = Objects.equals(3, userService.getAllUsers().intValue());
		System.out.println(equals2);
	}

}
