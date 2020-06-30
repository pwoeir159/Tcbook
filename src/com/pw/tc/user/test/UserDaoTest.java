package com.pw.tc.user.test;

import static org.junit.Assert.*;

import com.pw.tc.user.dao.*;
import com.pw.tc.user.pojo.*;

import org.junit.Test;

public class UserDaoTest {
	UserDao userdao = new UserDaoImpl();	
	@Test
	public void testQueryUserByUsername() {
		
		if(userdao.queryUserByUsername("pw123")==null) {
			System.out.println("用戶名不存在");
		}else {
			System.out.println("用戶名已存在");
		}
		
	}

	@Test
	public void testQueryUserByUsernameAndPassword() {
		if (userdao.queryUserByUsernameAndPassword("pw123","123")==null) {
			System.out.println("用戶名或是密碼錯誤，登入失敗");
		}else {
			System.out.println("登入成功");
		}
	}

	@Test
	public void testSaveUser() {
		System.out.println(userdao.saveUser(new User(null,"p123","123","a@gmail.com")));
	}

}
