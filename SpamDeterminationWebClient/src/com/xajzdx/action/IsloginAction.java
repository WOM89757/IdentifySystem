package com.xajzdx.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xajzdx.pojo.User;

/**
 * 
 * @author Wom
 * @category 登录控制器，接受用户的用户名和密码
 *
 */
@WebServlet("/islogin.action")
public class IsloginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IsloginAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session=request.getSession();
	User user = (User) session.getAttribute("u");
	String idstr=request.getParameter("uid");
	System.out.println(user);
	if(user!=null){
		request.getRequestDispatcher("blogpublish.jsp").forward(request, response);
		
	}else{
		

		request.getRequestDispatcher("login.jsp").forward(request, response);
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
