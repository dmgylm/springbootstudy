package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.dao.dba.UserDao;
import com.example.demo.dto.User;
import com.example.demo.util.FastJsonRedisSerializer;
import com.example.demo.util.RedisUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootstudyApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private RedisUtil redisUtil;

	@Autowired
	public UserDao userDao;



	@Test
	public void contextLoads() {
	}

	@Test
	public void testRedis(){
		//redisTemplate.opsForValue().set("name","lm");
		System.out.println(redisTemplate.opsForValue().get("name"));
	}

	@Test
	public void testSeriallizer(){
		String key="userList";
		List<User> userList=userDao.showUserList();
		redisUtil.lPush(key,userList);
		//redisUtil.remove(key);

	}

}
