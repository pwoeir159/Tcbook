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
	public Commodity CommodityByName(String name) {
		String sql ="select * from tc.twcodingcommodity where name = ?";
		return queryForOne(Commodity.class, sql, name);
	}
	@Override
	public List<Commodity> CommodityByMaxPirce(Integer maxprice) {
		String sql ="select * from tc.twcodingcommodity where price >= ?";
		return queryForList(Commodity.class, sql, maxprice);
	}
	@Override
	public List<Commodity> CommodityByMinPirce(Integer minprice) {
		String sql ="select * from tc.twcodingcommodity where price <= ?";
		return queryForList(Commodity.class, sql, minprice);
	}
	@Override
	public int BuyCommodity(String name,Integer buy) throws SQLException {		
		String  sql ="update tc.twcodingcommodity set quantity = quantity-? where name =?";
		return update(sql,buy,name);
	}
	@Override
	public int ReplenishStock(String name, Integer Quantity) throws SQLException {
		String sql ="update tc.twcodingcommodity set quantity = quantity+? where name =?";
		return update(sql,Quantity,name);
	}
	
}
