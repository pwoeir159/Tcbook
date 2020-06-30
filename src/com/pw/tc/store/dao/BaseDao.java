package com.pw.tc.store.dao;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.pw.tc.user.utils.JdbcUtils;


public abstract class BaseDao {
	
	//使用DbUtils操作數據庫
	private QueryRunner queryrunner = new QueryRunner(); 
	/*
	  	update 方法用來執行 :Insert / Update / Delete 語句。
		queryrunner.update(conn, sql, args);
		如果返回-1說明失敗 ，返回其他數值代表成功。
	*/
	public int update(String sql,Object ... args) throws SQLException {
		Connection conn = com.pw.tc.user.utils.JdbcUtils.getConnection();
		try {
			return queryrunner.update(conn, sql, args);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}		
		return -1;
	}
	/*
	 	queryForOne 查詢一個對象的時候使用
	 	queryrunner.query(conn,sql,new BeanHandler<T>(type),args); 
	 	查詢返回一個JavaBean的sql語句
	 	type 返回的對像類別
	 	sql 執行語句
	 	args sql對應的參數值
	 	<T> 泛型
	  */
	public <T> T queryForOne(Class<T> type,String sql,Object ... args) {
		Connection conn = JdbcUtils.getConnection();
		try {
			return queryrunner.query(conn,sql,new BeanHandler<T>(type),args); 
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn);
		}
		return null;
	}
	/*
 	queryForList 查詢多個對象的時候使用
 	queryrunner.query(conn, sql,new BeanListHandler<T>(type), args);
 	查詢多個JavaBean的sql語句
 	type 返回的對像類別
 	sql 執行語句
 	args sql對應的參數值
 	<T> 泛型
  */
	public <T>List<T> queryForList(Class<T> type,String sql,Object ... args){
		Connection conn = JdbcUtils.getConnection();
		try {
			return queryrunner.query(conn, sql,new BeanListHandler<T>(type), args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn);
		}
		return null;
		
	}
	/*
 	queryForSingValue 查詢一行一列的SQL語句
 	queryrunner.query(conn, sql, new ScalarHandler(), argns);
 	
 	type 返回的對像類別	
 	sql 執行語句
 	args sql對應的參數值
 	<T> 泛型
  */
	public Object queryForSingValue(String sql,Object ... argns) {
		Connection conn = JdbcUtils.getConnection();
		try {
				return queryrunner.query(conn, sql, new ScalarHandler(), argns);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn);
		}
		return null;
	}
	public int DeleteCommodity(String name) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
