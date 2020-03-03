package com.xajzdx.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xajzdx.dao.BlogDaoImpl;
import com.xajzdx.dao.UserDaoImpl;

/**
 * 
 * @author Wom
 * @category 删除博客控制器
 *
 */
@WebServlet("/blogdelete.action")
public class BlogDeleteAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogDeleteAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得删除博客ID
		String idstr=request.getParameter("bkid");
		int id=Integer.valueOf(idstr);
		// 获得blogdao对象
		BlogDaoImpl blogdao=new BlogDaoImpl();
		
		//删除指定用户
		int i=blogdao.delete(id);
		if(i>0){
			//成功了跳转到list控制器
			response.sendRedirect("bloglist.action");
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
