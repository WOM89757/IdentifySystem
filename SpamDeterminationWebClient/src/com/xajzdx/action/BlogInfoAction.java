package com.xajzdx.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xajzdx.dao.BlogDaoImpl;
import com.xajzdx.dao.UserDaoImpl;
import com.xajzdx.pojo.Blog;
import com.xajzdx.pojo.User;

/**
 * 
 * @author Wom
 * @category 博客详细信息控制器
 *
 */
@WebServlet("/bloginfo.action")
public class BlogInfoAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogInfoAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String bkidStr=request.getParameter("bkid");
		int bkid=Integer.valueOf(bkidStr);
		String mess=null;
		//创建数据访问对象
		BlogDaoImpl blogdao=new BlogDaoImpl();

		//根据博客ID查询博客详细信息
		Blog blog=blogdao.find(bkid);
		//将信息放入session中
		HttpSession session=request.getSession();
		session.setAttribute("blog",blog );
		
		//访问量加1
		
		int i=blogdao.updateclicks(blog);
		System.err.println(i > 0 ? "访问量加1" : "访问量失败");
		//跳转到博客详细信息界面
		request.getRequestDispatcher("bloginfo.jsp").forward(request, response);
		
		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
