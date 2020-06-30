package com.pw.tc.store.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.pw.tc.store.dao.StoreDao;
import com.pw.tc.store.dao.StoreDaoImpl;
import com.pw.tc.store.pojo.Commodity;

public class StoreDaoImplTest {
	StoreDao storedao = new StoreDaoImpl();
	@Test
	public void testCommodityByAll() {
		
		System.out.println(storedao.CommodityByAll());
	}
	@Test
	public void testCommodityByClass() {
		
		System.out.println(storedao.CommodityByClass("球鞋"));
	}

	@Test
	public void testCommodityByName() {
		System.out.println(storedao.CommodityByName("球A款"));
	}

	@Test
	public void testCommodityByMaxPirce() {
		System.out.println(storedao.CommodityByMaxPirce("200"));
	}

	@Test
	public void testCommodityByMinPirce() {
		System.out.println(storedao.CommodityByMinPirce("300"));
	}

	@Test
	public void testBuyCommodity() throws SQLException {
		System.out.println(storedao.BuyCommodity("球A款", 5));
	}
	@Test
	public void testReplenishStock() throws SQLException {
		System.out.println(storedao.ReplenishStock("球A款",10));
	}
	@Test
	public void testAddCommodity() throws SQLException {
		System.out.println(storedao.AddCommodity(new Commodity("眼鏡","眼鏡A款",230,20)) );
	}
	@Test
	public void testDeleteCommodity() throws SQLException {
		System.out.println(storedao.DeleteCommodity("眼鏡A款"));
	}
	
	
	

}
