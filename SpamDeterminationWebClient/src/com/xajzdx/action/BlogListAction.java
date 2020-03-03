package com.xajzdx.action;

import java.io.IOException;
import java.util.List;

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
 * @category 博客列表控制器
 *
 */
@WebServlet("/bloglist.action")
public class BlogListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BlogListAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//判断是否为管理员
		
		HttpSession session=request.getSession();
		User user =(User) session.getAttribute("u");
		
		
		BlogDaoImpl blogDao = new BlogDaoImpl();//创建数据访问对象
		List<Blog> list = blogDao.findBlogList();
		//将用户列表放到作用域当中
		request.setAttribute("bloglist", list);
		
		request.getRequestDispatcher("bloglist.jsp").forward(request, response);
		/*if(user!=null){
			
			int uid=user.getId();
			if(uid==1){
				//转发到管理员博客列表页面
				request.getRequestDispatcher("bloglist.jsp").forward(request, response);

			}else{
				//转发到博客列表页面
				request.getRequestDispatcher("bloglistu.jsp").forward(request, response);
			
			}
			
		}else{
			//转发到博客列表页面
			request.getRequestDispatcher("bloglistu.jsp").forward(request, response);
		
			}
		*/

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
