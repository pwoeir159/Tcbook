package com.pw.tc.user.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pw.tc.user.pojo.User;
import com.pw.tc.user.service.UserService;
import com.pw.tc.user.service.UserServiceImpl;

public class UserServicImplTest {
	UserService userservice = new UserServiceImpl();
	@Test
	public void testExistsUsername() {
		if(userservice.existsUsername("pw123")) {
			System.out.println("用戶名已存在");
		}else {
			System.out.println("用戶名已可用");
		}
	}

	@Test
	public void testLogin() {
		System.out.println(userservice.login(new User(null,"pw123","123",null)));
	}

	@Test
	public void testRegistered() {
		userservice.registered(new User(null,"c1","123","c1@yahoo.com.tw"));
		userservice.registered(new User(null,"c2","123","c2@yahoo.com.tw"));
	}

}
