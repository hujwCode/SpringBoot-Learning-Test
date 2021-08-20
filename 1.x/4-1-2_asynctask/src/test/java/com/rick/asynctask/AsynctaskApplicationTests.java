package com.rick.asynctask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Future;

@SpringBootTest
class AsynctaskApplicationTests {

	@Autowired
	private Task task;
	@Test
	void contextLoads() throws Exception {

		long start = System.currentTimeMillis();
		Future<String> taskOne = task.doTaskOne();
		Future<String> taskTwo = task.doTaskTwo();
		Future<String> taskThree = task.doTaskThree();

		while (true) {

			if (taskOne.isDone() && taskTwo.isDone() && taskThree.isDone()) {
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");

	}

}
