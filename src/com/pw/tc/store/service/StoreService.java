package com.pw.tc.store.service;

import java.sql.SQLException;
import java.util.List;

import com.pw.tc.store.pojo.Commodity;

public interface StoreService {
	
	/**
	 * �j�M�ӫ~����
	 * @return ��^[]�N��ӫ~���s�b
	 * */
	public List<Commodity> CommodityClass(String Name);
	/**
	 * ��ܩҦ��ӫ~
	 * @return ��^[]�N��ӫ~���s�b
	 * */
	public List<Commodity> AllexistsCommodity();
	
	/**
	 * �j�M�ӫ~�W��
	 * @return ��^[]�N��ӫ~���s�b
	 * */
	public List<Commodity> CommodityName(String Name);
	
	/**
	 * �j�M�ӫ~���B�j�󵥩��J���B
	 * @return ��^[]�N��ӫ~���s�b
	 * */
	public List<Commodity> CommodityMaxPrice(String price);
	
	/**
	 * �j�M�ӫ~���B�p�󵥩��J���B
	 * @return ��^[]�N��ӫ~���s�b
	 * */
	public List<Commodity> CommodityMinPrice(String price);
	
	
	
	/**
	 * �ʶR�ӫ~
	 * @return ��^-1�N����
	 * */
	public int BuyCommodity(String name,Integer quantity) throws SQLException;
	
	/**
	 * �s�W�ӫ~
	 * @return ��^-1�N����
	 * */
	public int AddCommodity(Commodity commodity) throws SQLException;
	
	/**
	 * �ɥR�ӫ~
	 * @return ��^-1�N����
	 * */
	public int ReplenishStock(String name,Integer quantity) throws SQLException;
	
	/**
	 * �U�[�ӫ~
	 * @return ��^-1�N����
	 * */
	public int DeleteCommodity(String name) throws SQLException;
	
	
}
