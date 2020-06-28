package com.pw.tc.store.service;

import java.util.List;

import com.pw.tc.store.dao.StoreDao;
import com.pw.tc.store.dao.StoreDaoImpl;
import com.pw.tc.store.pojo.Commodity;

public class StoreServiceImpl implements StoreService{
	private StoreDao stroedao = new StoreDaoImpl();
	
	@Override
	public List<Commodity> existsCommodity(String Name) {					
			return stroedao.CommodityByClass(Name);		
	}
	@Override
	public List<Commodity> AllexistsCommodity() {
		
		return stroedao.CommodityByAll();
	}
	
		
		

}
