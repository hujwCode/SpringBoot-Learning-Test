package com.example.demo;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private Properties1 properties1;
	@Autowired
	private Properties2 properties2;
	@Test
	void contextLoads() {

		System.out.println(properties1.toString());
		System.out.println(properties2.toString());
	}

}
