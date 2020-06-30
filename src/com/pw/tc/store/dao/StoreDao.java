package com.pw.tc.store.dao;

import java.sql.SQLException;
import java.util.List;

import com.pw.tc.store.pojo.Commodity;

public interface StoreDao {
	
	/**
	 * 顯示所有商品
	 * @return 如果是null 代表沒有這個商品種類
	 * */
	public List<Commodity> CommodityByAll() ;
	/**
	 * 透過商品種類搜尋
	 * @return 如果是null 代表沒有這個商品種類
	 * */
	public List<Commodity> CommodityByClass(String classname) ;
	/**
	 * 透過商品名稱搜尋
	 * @return 如果是null 代表沒有這個商品名稱
	 * */
	public List<Commodity> CommodityByName(String name) ;
	/**
	 * 搜尋商品價格大於等於數入值
	 * @return 如果是null 代表沒有這個商品大於這個價格
	 * */
	public List<Commodity> CommodityByMaxPirce(String maxprice) ;
	/**
	 * 搜尋商品價格小於等於數入值
	 * @return 如果是null 代表沒有這個商品小於這個價格
	 * */
	public List<Commodity> CommodityByMinPirce(String minprice) ;
	/**
	 * 購買商品，扣除數量
	 * @return 如果是-1代表購買失敗
	 * @throws SQLException 
	 * @name 購買商品名子
	 * @buy 購買商品數量
	 * */
	public int BuyCommodity(String name,Integer Quantity) throws SQLException ;
	/**
	 * 補充貨物數量
	 * @return 如果是-1 代表補貨失敗
	 * @throws SQLException 
	 * @name 補充商品名子
	 * @buy 補充商品數量
	 * */
	public int ReplenishStock(String name,Integer Quantity) throws SQLException ;
	/**
	 * 新增商品
	 * @return 如果是-1 代表補貨失敗
	 * @throws SQLException 
	 * @name 補充商品名子
	 * @buy 補充商品數量
	 * */
	public int AddCommodity(Commodity Commodity) throws SQLException ;
	/**
	 * 下架商品(　)
	 * @return 如果是-1 代表補貨失敗
	 * @throws SQLException 
	 * @name 補充商品名子
	 * 
	 * */
	public int DeleteCommodity(String name) throws SQLException ;
}
