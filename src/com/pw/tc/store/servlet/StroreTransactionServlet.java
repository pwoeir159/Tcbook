package com.pw.tc.store.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pw.tc.store.pojo.Commodity;
import com.pw.tc.store.service.StoreService;
import com.pw.tc.store.service.StoreServiceImpl;

public class StroreTransactionServlet extends HttpServlet {
	StoreService storeservice = new StoreServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action=req.getParameter("action");
		if("buy".equalsIgnoreCase(action)) {
			try {
				Buy(req,resp);
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		doGet(req,resp);
	}
	protected void Buy(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {
		String name = req.getParameter("name");
		Integer quantity =Integer.parseInt(req.getParameter("quantity"));
		//判斷貨物是否為0，0的貨返回購買失敗
		for(Commodity commodity:storeservice.CommodityName(name)) {
			if((commodity.getQuantity()-quantity)<0) {
				resp.sendRedirect("./searchProductServlet?action=list");
			}else {
				storeservice.BuyCommodity(name, quantity);
				resp.sendRedirect("./TransactionComplete.jsp");
			}
		}
		
	}
}
