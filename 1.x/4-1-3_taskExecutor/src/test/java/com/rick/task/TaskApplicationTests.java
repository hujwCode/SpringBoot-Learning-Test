package com.rick.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskApplicationTests {
	@Autowired
	private Task task;

	@Test
	void contextLoads() throws Exception {
		task.doTaskOne();
		task.doTaskTwo();
		task.doTaskThree();
		Thread.currentThread().join();
	}



}
