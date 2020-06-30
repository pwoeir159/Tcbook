package com.pw.tc.store.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pw.tc.store.pojo.Commodity;
import com.pw.tc.store.service.StoreService;
import com.pw.tc.store.service.StoreServiceImpl;

/**
 * Servlet implementation class SearchProduct
 */
@WebServlet("/SearchProduct")
public class SearchProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StoreService storeservice = new StoreServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//doPost(req, resp);
    	
    	list(req, resp);
    	
    }
    
	/**
	 * 查詢商品類
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
	
		request.setCharacterEncoding("UTF-8");
		String keyword = request.getParameter("keyword");	
		System.out.println(keyword);
		//1.通過Service查詢全部的商品
		if(storeservice.CommodityClass(keyword).size()==0){
			if(storeservice.CommodityName(keyword).size()==0) {
				RequestDispatcher rd = request.getRequestDispatcher("/Tcstore.jsp");
				try {
						rd.forward(request, response);
						return;
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}else {
				List<Commodity> Slist = storeservice.CommodityName(keyword);
				//2.把全部商品存到Request域中
				request.setAttribute("Slist", Slist);
				//3.請求轉發到Tcstore.jsp頁面
				RequestDispatcher rd = request.getRequestDispatcher("/Tcstore.jsp");
				try {
						rd.forward(request, response);
						return;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}else {
			List<Commodity> Slist = storeservice.CommodityClass(keyword);
			//2.把全部商品存到Request域中
			request.setAttribute("Slist", Slist);
			//3.請求轉發到Tcstore.jsp頁面
			RequestDispatcher rd = request.getRequestDispatcher("/Tcstore.jsp");
			try {
					rd.forward(request, response);
					return;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}	
	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.通過Service查詢全部的商品		
		List<Commodity> AllList = storeservice.AllexistsCommodity();
		
		//2.把全部商品存到Request域中
		request.setAttribute("Slist", AllList);
		
		//3.請求轉發到Tcstore.jsp頁面
		RequestDispatcher rd = request.getRequestDispatcher("/Tcstore.jsp");
		try {
				rd.forward(request, response);
				return;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
