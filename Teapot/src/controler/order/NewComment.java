package controler.order;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bll.OrderService;
import java.util.Date;

public class NewComment extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1962167493958728054L;

	public NewComment(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //��������UTF-8
		response.setCharacterEncoding("UTF-8");
		OrderService os=new OrderService();
		
		String what=request.getParameter("what");
		//myCommeny.jsp�У��ȷ�����orderItem�����ۣ��ٷ�order
		if(what.equals("order"))
		{
			Integer honestyStar=Integer.parseInt(request.getParameter("honestyStar"));
			Integer serviceStar=Integer.parseInt(request.getParameter("serviceStar"));
			Integer deliveryStar=Integer.parseInt(request.getParameter("deliveryStar"));
			Integer orderId=Integer.parseInt(request.getParameter("orderId"));
			os.updateStarsById(orderId, honestyStar, serviceStar, deliveryStar);
			response.sendRedirect("JSP/showMyOrders.jsp");
		}
		if(what.equals("orderItem"))
		{
			Integer grade=Integer.parseInt(request.getParameter("grade"));
			Integer id=Integer.parseInt(request.getParameter("id"));
			String comment=request.getParameter("comment");
			Integer anonymous=null;
			if(request.getParameter("anonymous")==null) anonymous=0;
			else		anonymous=0;
			os.updateCommentById(id, grade, comment, anonymous);
		}
	}
}
