package com.pw.tc.store.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pw.tc.store.service.StoreService;
import com.pw.tc.store.service.StoreServiceImpl;

public class StoreServiceImplTest {
	StoreService sss = new StoreServiceImpl();
	@Test
	public void testExistsCommodity() {
		System.out.println(sss.existsCommodity("¤â¿ö"));
	}
	@Test
	public void testAllExistsCommodity() {
		System.out.println(sss.AllexistsCommodity());
	}

}
