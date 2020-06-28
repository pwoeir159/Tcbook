package com.pw.tc.user.dao;

import java.sql.SQLException;

import com.pw.tc.user.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {
	
	@Override
	public User queryUserByUsername(String username) {
		String sql = "Select * from book_user where username = ?" ;
		return queryForOne(User.class, sql, username);
	}
	@Override
	public User queryUserByUsernameAndPassword(String username, String password) {
		String sql = "Select * from book_user where username = ? and password = ?" ;
		return queryForOne(User.class, sql, username,password);
	}
	@Override
	public int saveUser(User user) {
		String sql = "insert into book_user (`username`,`password`,`email`) values (?,?,?)";
		
		try {
			return update(sql, user.getUsername(),user.getPassword(),user.getEmail());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
