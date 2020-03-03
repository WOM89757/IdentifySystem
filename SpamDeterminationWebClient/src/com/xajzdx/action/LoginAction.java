package com.xajzdx.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xajzdx.dao.UserDaoImpl;
import com.xajzdx.pojo.User;

/**
 * 
 * @author Wom
 * @category 登录控制器，接受用户的用户名和密码
 *
 */

@WebServlet("/login.action")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String name=request.getParameter("n");
		String password=request.getParameter("p");
		String mess=null;
		//创建数据访问对象
		UserDaoImpl userdao=new UserDaoImpl();
		User user=userdao.find(name, password);
			
		if(user!=null){
			HttpSession session=request.getSession();
			System.out.println(user.getId());
			session.setAttribute("u",user );
			if(user.getId()==1){
				response.sendRedirect("userlist.action");
			}else{
				request.getRequestDispatcher("userinfo.jsp").forward(request, response);
			}
		}else{
			mess="用户名或密码错误！！";
			request.setAttribute("mess", mess);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
