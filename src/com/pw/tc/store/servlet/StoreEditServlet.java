package com.pw.tc.store.servlet;

import java.io.IOException;
import java.sql.SQLException;

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
 * Servlet implementation class StoreEdit
 */
@WebServlet("/StoreEdit")
public class StoreEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StoreService storeservice = new StoreServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String action = request.getParameter("action");
			System.out.println(action);
			if("Add".equals(action)) {
				try {
					add(request,response);
				} catch (ServletException | IOException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if("Delete".equals(action)) {
				try {
					delete(request,response);
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if("ReplenishStock".equals(action)) {
				try {
					replenish(request,response);
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//����N�X�নUTF-8
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
				
	}
	/**
	 * �s�W�ӫ~
	 * @throws SQLException 
	 * */
	protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {		
		//�����n�s�W���ӫ~�����A�ӫ~�W�l�A�ӫ~����A�ӫ~�ƶq
		String commodityclass = request.getParameter("commodityclass");
		String name = request.getParameter("name");
		Integer pirce = Integer.parseInt(request.getParameter("price"));
		Integer quantity = Integer.parseInt(request.getParameter("quantity"));
		//����Service.Add
		storeservice.AddCommodity(new Commodity(commodityclass,name,pirce,quantity));
		//�ШD��o�^�ӫ�������ܵ��G
		response.sendRedirect("./searchProductServlet?action=list");
	}
	/**
	 * �R���ӫ~
	 * @throws SQLException 
	 * */
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		//�����n�s�W���ӫ~�����A�ӫ~�W�l�A�ӫ~����A�ӫ~�ƶq
		String name = request.getParameter("name");

		//����Service.Delete
		try {
			storeservice.DeleteCommodity(name);
			response.sendRedirect("./searchProductServlet?action=list");	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ШD��o�^�ӫ�������ܵ��G
			
	}
	/**
	 * �ɥR�ӫ~
	 * @throws SQLException 
	 * */
	protected void replenish(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		//�����n�s�W���ӫ~�����A�ӫ~�W�l�A�ӫ~����A�ӫ~�ƶq
		String name = request.getParameter("name");
		Integer quantity = Integer.parseInt(request.getParameter("quantity"));
		//����Service.Add
		storeservice.ReplenishStock(name, quantity);
		//�ШD��o�^�ӫ�������ܵ��G
		response.sendRedirect("./searchProductServlet?action=list");		
	}


}
