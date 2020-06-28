package com.pw.tc.store.service;

import java.util.List;

import com.pw.tc.store.pojo.Commodity;

public interface StoreService {
	
	/**
	 * 搜尋商品種類
	 * @return 返回[]代表商品不存在
	 * */
	public List<Commodity> existsCommodity(String Name);
	/**
	 * 顯示所有商品
	 * @return 返回[]代表商品不存在
	 * */
	public List<Commodity> AllexistsCommodity();
	
	
}
