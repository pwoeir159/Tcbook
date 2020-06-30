package com.pw.tc.store.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.pw.tc.store.pojo.Commodity;
import com.pw.tc.store.service.StoreService;
import com.pw.tc.store.service.StoreServiceImpl;

public class StoreServiceImplTest {
	StoreService sss = new StoreServiceImpl();
	@Test
	public void testExistsCommodity() {
		for(Commodity commodity:sss.CommodityClass("���")) {
			System.out.println(commodity);
		}
		
	}
	@Test
	public void testAllExistsCommodity() {
		for(Commodity commodity:sss.AllexistsCommodity()) {
			System.out.println(commodity);
		}
	}
	@Test
	public void testCommodityName() {		
		for(Commodity commodity:sss.CommodityName("�UA��")) {
			System.out.println(commodity.getQuantity());
			
		}
	}
	@Test
	public void testCommodityMax() {		
		for(Commodity commodity:sss.CommodityMaxPrice("600")) {
			System.out.println(commodity);
		}
	}
	@Test
	public void testCommodityMin() {
		for(Commodity commodity:sss.CommodityMinPrice("600")) {
			System.out.println(commodity);
		}
	}
	
	@Test
	public void BuyCommodity() throws SQLException {
		System.out.println(sss.BuyCommodity("�UB��", 2));
		
	}
	@Test
	public void AddCommodity() throws SQLException {
		System.out.println(sss.AddCommodity(new Commodity("��l", "�j���", 1500, 5)));
	}
	@Test
	public void ReplenishStock() throws SQLException {
		System.out.println(sss.ReplenishStock("�UB��", 1));
	}
	@Test
	public void DeleteCommodity() throws SQLException {
		System.out.println(sss.DeleteCommodity("�j���"));
	}

}
