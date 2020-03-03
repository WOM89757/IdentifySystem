package com.xajzdx.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xajzdx.dao.UserDaoImpl;
/**
 * 
 * @author WOM
 * @category 删除控制器
 *
 */
@WebServlet("/delete.action")
public class DeleteAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得删除用户ID
		String idstr=request.getParameter("id");
		int id=Integer.valueOf(idstr);
		// 获得Userdao对象
		UserDaoImpl userdao=new UserDaoImpl();
		
		//删除指定用户
		int i=userdao.delete(id);
		if(i>0){
			//成功了跳转到list控制器
			response.sendRedirect("userlist.action");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
