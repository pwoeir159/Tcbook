package com.pw.tc.store.service;

import java.sql.SQLException;
import java.util.List;

import com.pw.tc.store.dao.StoreDao;
import com.pw.tc.store.dao.StoreDaoImpl;
import com.pw.tc.store.pojo.Commodity;

public class StoreServiceImpl implements StoreService{
	private StoreDao storedao = new StoreDaoImpl();
	
	@Override
	public List<Commodity> CommodityClass(String Name) {					
			return storedao.CommodityByClass(Name);		
	}
	@Override
	public List<Commodity> AllexistsCommodity() {
		
		return storedao.CommodityByAll();
	}
	@Override
	public List<Commodity> CommodityName(String Name) {
		// TODO Auto-generated method stub
		return storedao.CommodityByName(Name);
	}
	
	@Override
	public List<Commodity> CommodityMaxPrice(String price) {
		// TODO Auto-generated method stub
		return storedao.CommodityByMaxPirce(price);
	}
	
	@Override
	public List<Commodity> CommodityMinPrice(String price) {
		// TODO Auto-generated method stub
		return storedao.CommodityByMinPirce(price);
	}
	
	@Override
	public int BuyCommodity(String name,Integer quantity) throws SQLException {
		// TODO Auto-generated method stub
		return storedao.BuyCommodity(name, quantity);
	}
	@Override
	public int AddCommodity(Commodity commodity) throws SQLException {
		// TODO Auto-generated method stub
		return storedao.AddCommodity(commodity);
	}@Override
	public int ReplenishStock(String name,Integer quantity) throws SQLException{
		// TODO Auto-generated method stub
		return storedao.ReplenishStock(name, quantity);
	}
	@Override
	public int DeleteCommodity(String name) throws SQLException{
		// TODO Auto-generated method stub
		return storedao.DeleteCommodity(name);
	}
	
		
		

}
