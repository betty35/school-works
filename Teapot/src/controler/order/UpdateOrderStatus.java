package controler.order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.OrderService;

public class UpdateOrderStatus extends HttpServlet {
//管理员操作专用，更新订单情况
	/**
	 * 
	 */
	private static final long serialVersionUID = -3809484592365591612L;
	OrderService os=new OrderService();
	
	public UpdateOrderStatus(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
		//what判断操作
		String what=request.getParameter("what");
		if(what.equals("status"))
		{//更新订单状态
			Integer id=Integer.parseInt(request.getParameter("orderId"));
			Integer status=Integer.parseInt(request.getParameter("status"));
			os.updateStatusById(id, status);
			//status: 0:未付款；1：付款未发货；2：已发货；3：已签收（确认付款）4:删除（只是用户端不显示而已）
			if(status==3) os.updateFinishDateById(id);//如果签收，自动更新订单结束日期
			if(request.getParameter("back")!=null)
			{
				if(request.getParameter("back").equals("order"))
					response.sendRedirect(basePath+"JSP/showMyOrders.jsp");
			}
		}
		else if(what.equals("deliveryCode"))
		{//发货后更改运单号
			String del=request.getParameter("deliveryCode");
			Integer id=Integer.parseInt(request.getParameter("orderId"));
			Integer status=2;
			os.updateDeliveryCodeById(id, del);
			os.updateStatusById(id, status);
		}
		response.sendRedirect("JSP/orderManagement.jsp");
	}
}
