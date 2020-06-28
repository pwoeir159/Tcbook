package com.pw.tc.store.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class JdbcUtils {
	private static DruidDataSource dataSource;
	
	static {
		
		try {
			Properties properties =new Properties();
			//讀取jdbc.Properties屬性配置文件
			InputStream inputstream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
			//從流中加載數據
			properties.load(inputstream);
			//創建 資料庫連接 池
			dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);			
			System.out.println(dataSource.getCommitCount());
		
		}
		catch(Exception e) {
			e.printStackTrace();	
		}
	}
	
public static void main(String[] args) {
		
	}
	/*獲取資料庫連接池
	 return 如果是返回null，說明或取連接失敗，有值就是連接成功	 
	*/	
	public static Connection getConnection() {
		Connection conn =null;
		try {
			conn = dataSource.getConnection();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection connection) {
		if(connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
