package com.pw.tc.store.dao;

import java.sql.SQLException;
import java.util.List;

import com.pw.tc.store.pojo.Commodity;

public class StoreDaoImpl extends BaseDao implements StoreDao{
	@Override
	public List<Commodity> CommodityByAll() {
		String sql="select * from tc.twcodingcommodity ";
		return queryForList(Commodity.class, sql);
	}
	
	@Override
	public List<Commodity> CommodityByClass(String classname) {
		String sql="select * from tc.twcodingcommodity where commodityclass = ?";
		return queryForList(Commodity.class, sql, classname);
	}
	@Override
	public List<Commodity> CommodityByName(String name) {
		String sql ="select * from tc.twcodingcommodity where name = ?";
		return queryForList(Commodity.class, sql, name);
	}
	@Override
	public List<Commodity> CommodityByMaxPirce(String maxprice) {
		String sql ="select * from tc.twcodingcommodity where price >=?";
		return queryForList(Commodity.class, sql, maxprice);
	}
	@Override
	public List<Commodity> CommodityByMinPirce(String minprice) {
		String sql ="select * from tc.twcodingcommodity where price <=?";
		return queryForList(Commodity.class, sql, minprice);
	}
	@Override
	public int BuyCommodity(String name,Integer Quantity) throws SQLException {		
		String  sql ="update tc.twcodingcommodity set quantity = quantity-? where name =?";
		return update(sql,Quantity,name);
	}
	@Override
	public int ReplenishStock(String name, Integer Quantity) throws SQLException {
		String sql ="update tc.twcodingcommodity set quantity = quantity+? where name =?";
		return update(sql,Quantity,name);
	}
	@Override
	public int AddCommodity(Commodity Commodity) throws SQLException {
		String sql ="insert into twcodingcommodity (`commodityclass`,`name`,`price`,`quantity`) values (?,?,?,?)";
		return update(sql,Commodity.getCommodityclass(),Commodity.getName(),Commodity.getPrice(),Commodity.getQuantity());
	}@Override
	public int DeleteCommodity(String name) throws SQLException {
		String sql ="Delete from twcodingcommodity WHERE name= ?";
		return update(sql,name);
	}
	
}
