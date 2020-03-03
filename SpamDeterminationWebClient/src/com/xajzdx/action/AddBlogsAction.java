package com.xajzdx.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xajzdx.dao.BlogDaoImpl;
import com.xajzdx.pojo.Blog;
import com.xajzdx.pojo.User;

/**
 * @author WOM
 * @category 增添博客控制器
 */
@WebServlet("/addblogs.action")
public class AddBlogsAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddBlogsAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		BlogDaoImpl dao = new BlogDaoImpl();
		//接收用户的参数
		//String kidstr = request.getParameter("type");
		String uidstr= request.getParameter("uid");
		String title = request.getParameter("Title");
		String schema = request.getParameter("Schema");
		String content = request.getParameter("Content");
	//	int kid = Integer.valueOf(kidstr);
		System.out.println(uidstr);
		int uid = Integer.valueOf(uidstr);
		
		System.out.println(uid);
		System.out.println(title);
		System.out.println(schema);
		System.out.println(content);
		
	
		// 将用户的参数放入到一个用户对象中
		Blog blog = new Blog(uid, title, schema, content, new Date());
		// 将用户对象传入到数据库中，进行持久化操作
		int i = dao.saveInfo(blog);
		System.err.println(i > 0 ? "保存成功" : "保存失败");
		// 跳转到登录页面
	response.sendRedirect("bloglist.action");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
