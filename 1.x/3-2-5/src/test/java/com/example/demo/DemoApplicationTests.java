package com.example.demo;

import com.example.demo.domain.Survive;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	void contextLoads() {
//		stringRedisTemplate.opsForValue().set("name","hjw");
//		String name = stringRedisTemplate.opsForValue().get("name");
//		System.out.println(name);
//
//		User user = new User("pwt", 18);
////		redisTemplate.opsForValue().set("admin", user);
//		redisTemplate.opsForValue().set("admin", user, 30l, TimeUnit.MINUTES);
//		User user1 = (User) redisTemplate.opsForValue().get("admin");
//		System.out.println(user1.toString());
		if (!check("hjw")) {
			System.out.println("error");
			clearNum("hjw");
			return;
		}
//		addNum("hjw");
	}

	public boolean check(String userName) {
		Survive survive = (Survive) redisTemplate.opsForValue().get(userName);
		if (Objects.isNull(survive)) {
			return true;
		}
		Integer num = survive.getNum();
		LocalDateTime lastTime = survive.getLastTime();
		LocalDateTime nowTime = LocalDateTime.now();
		Duration duration = Duration.between(lastTime, nowTime);
		Long milliseconds = duration.toMinutes();
		if (num>=3 || milliseconds >30) {
			return false;
		}
		return true;
	}
	public void addNum(String userName) {
		Survive survive = (Survive) redisTemplate.opsForValue().get(userName);


		if (survive == null) {
			Survive survive1 = new Survive();
			survive1.setNum(1);
			survive1.setLastTime(LocalDateTime.now());
			redisTemplate.opsForValue().set(userName, survive1);
			return;
		}
//		assert survive != null;
		survive.setNum(survive.getNum()+1);
		redisTemplate.opsForValue().set(userName, survive);

	}

	public void clearNum(String userName) {
		redisTemplate.delete(userName);
	}
}
