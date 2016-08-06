package com.yonon.icft.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yonon.icft.model.User;
import com.yonon.icft.service.UserService;

public class TestCase {
	@Test
	public void springbatisDemo(){
		User user = new User();
		UserService userService = null;
		// TODO Auto-generated method stub
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml","spring-mybatis.xml"});
		userService = (UserService) ctx.getBean("userService");
//		user.setName("Yonon");
//		user.setPsw("123");
//		userService.addUser(user);
		
		user = new User();
		user.setName("Yonon");
		user.setPsw("1234");
		System.out.println(userService.getUser(user));
	}
}
