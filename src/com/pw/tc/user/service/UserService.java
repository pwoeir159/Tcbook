package com.pw.tc.user.service;

import com.pw.tc.user.pojo.User;

public interface UserService {
	
	
	/**
	 * 註冊用戶
	 * @param user
	 * 
	 * */
	public void registered(User user) ;
	
	/**
	 * 登入用戶
	 * @param user
	 * @return 
	 * */
	public User login(User user) ;
	
	/**
	 * 檢查用戶名是否存在
	 * @param user
	 * @return 返回True 表示用戶名存在，返回false 表示用戶名不存在，可使用。
	 * */
	public boolean existsUsername(String username) ;
}
