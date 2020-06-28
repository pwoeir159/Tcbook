package com.pw.tc.user.dao;

import com.pw.tc.user.pojo.User;

public interface UserDao {

	
	/*
	 *根據用戶名查詢用戶資訊
	 *@Return 如果是null說明沒有這個用戶。反之亦然
	 */	
	public User queryUserByUsername(String username);	
	/*
	 *根據用戶名與密碼查詢用戶資訊
	 *@Return 如果是null說明沒有這個用戶或是密碼錯誤。反之亦然
	 */	
	public User queryUserByUsernameAndPassword(String username,String password);	
	/*
	 *保存用戶訊息
	 *@Return 
	 */	
	public int saveUser(User user);
	/*
	 *保存用戶訊息
	 *@Return 
	 */	
	
}
