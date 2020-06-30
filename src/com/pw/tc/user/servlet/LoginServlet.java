package com.pw.tc.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pw.tc.user.pojo.User;
import com.pw.tc.user.service.UserService;
import com.pw.tc.user.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userservice = new UserServiceImpl();
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		//判斷用戶名是否存在，不存在請求頁面到登入失敗，存在的話判斷密碼是否正確
		if(!userservice.existsUsername(Username)) {
			System.out.println("無此帳號，登入錯誤");
			request.getRequestDispatcher("/LoginFailed.jsp").forward(request, response);
		}
		//判斷用戶帳號密碼是否正確
		else if(userservice.login(new User(null,Username,Password,null))==null) {
			System.out.println("用戶名稱或是密碼錯誤");
			request.getRequestDispatcher("/WrongPassword.jsp").forward(request, response);
		}else {
			System.out.println("登入成功");
			//先跳轉到searchProduct 的 list方法 呈現出所有商品
			//response.sendRedirect("./searchProduct?action=list");
			response.sendRedirect("./LoginOk.jsp");
			
		}
	}

}
