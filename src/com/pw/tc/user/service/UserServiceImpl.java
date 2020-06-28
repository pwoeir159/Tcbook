package com.pw.tc.user.service;

import com.pw.tc.user.dao.UserDao;
import com.pw.tc.user.dao.UserDaoImpl;
import com.pw.tc.user.pojo.User;

public class UserServiceImpl implements UserService{
	private UserDao userdao = new UserDaoImpl();
	@Override
	public boolean existsUsername(String username) {
		if(userdao.queryUserByUsername(username)==null) {
			//如果沒有查到用戶名子，代表可以使用，傳回false 表示可以註冊此用戶名
			return false;
		}		
		return true;
	}
	@Override
	public User login(User user) {
		
		return userdao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
	}
	@Override
	public void registered(User user) {
		userdao.saveUser(user);
		
		
	}
	
}
