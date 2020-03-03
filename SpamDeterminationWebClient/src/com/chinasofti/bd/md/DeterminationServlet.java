package com.chinasofti.bd.md;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasofti.platform.rpc.Service;
import com.chinasofti.spamdetermination.rpcserver.bizinterface.ISpamDeterminationBiz;

/**
 * @author WOM
 * ������
 */
@WebServlet("/check")
public class DeterminationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ISpamDeterminationBiz biz = (ISpamDeterminationBiz) Service.lookup(
			ServerContext.COUNTER_SERVER, "service");

	public DeterminationServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String msg = request.getParameter("msg");
		request.setAttribute("msg", msg);
		boolean flag = biz.isSpam(msg);
		if (flag) {
			request.setAttribute("result", "垃圾信息");
		} else {
			request.setAttribute("result", "有效信息");
		}
		request.setAttribute("flag", flag);
		request.getRequestDispatcher("/result.jsp").forward(request, response);

	}

}
