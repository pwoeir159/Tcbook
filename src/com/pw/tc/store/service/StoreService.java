package com.pw.tc.store.service;

import java.sql.SQLException;
import java.util.List;

import com.pw.tc.store.pojo.Commodity;

public interface StoreService {
	
	/**
	 * 搜尋商品種類
	 * @return 返回[]代表商品不存在
	 * */
	public List<Commodity> CommodityClass(String Name);
	/**
	 * 顯示所有商品
	 * @return 返回[]代表商品不存在
	 * */
	public List<Commodity> AllexistsCommodity();
	
	/**
	 * 搜尋商品名稱
	 * @return 返回[]代表商品不存在
	 * */
	public List<Commodity> CommodityName(String Name);
	
	/**
	 * 搜尋商品金額大於等於輸入金額
	 * @return 返回[]代表商品不存在
	 * */
	public List<Commodity> CommodityMaxPrice(String price);
	
	/**
	 * 搜尋商品金額小於等於輸入金額
	 * @return 返回[]代表商品不存在
	 * */
	public List<Commodity> CommodityMinPrice(String price);
	
	
	
	/**
	 * 購買商品
	 * @return 返回-1代表失敗
	 * */
	public int BuyCommodity(String name,Integer quantity) throws SQLException;
	
	/**
	 * 新增商品
	 * @return 返回-1代表失敗
	 * */
	public int AddCommodity(Commodity commodity) throws SQLException;
	
	/**
	 * 補充商品
	 * @return 返回-1代表失敗
	 * */
	public int ReplenishStock(String name,Integer quantity) throws SQLException;
	
	/**
	 * 下架商品
	 * @return 返回-1代表失敗
	 * */
	public int DeleteCommodity(String name) throws SQLException;
	
	
}
