package com.xajzdx.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Wom
 * @category 注销控制器
 *
 */
@WebServlet("/logout.action")
public class LogoutAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogoutAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//注销当前用户
		request.removeAttribute("u");
		request.removeAttribute("uid");
		request.getSession().invalidate();
		response.sendRedirect("login.jsp");
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
