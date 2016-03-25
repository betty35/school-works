package controler.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.*;
import bll.*;
import java.util.*;

public class ShowOrder extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3534592196753565207L;
	
	public ShowOrder(){}
	OrderService os=new OrderService();
	ProductService ps=new ProductService();
	AddressService as=new AddressService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); //两个都用UTF-8
		response.setCharacterEncoding("UTF-8");
		String way=request.getParameter("way");
		String path = request.getContextPath();
		 String basePath = request.getScheme() + "://"
		  + request.getServerName() + ":" + request.getServerPort()
		  + path + "/";
		if(way.equals("byStatus"))
		{PrintWriter out=response.getWriter();
			String xml="<table class=\"table\"><tr><th>买家ID</th><th>orderId</th><th>orderCode</th><th>订单时间</th><th>运单号</th><th>已评价</th></tr>";
			Integer status=Integer.parseInt(request.getParameter("status"));
			List<Order> li=os.getOrderByStatus(status);
			if(li!=null)
			for(int i=0;i<li.size();i++)
			{
				Order order=li.get(i);
				Integer userId=order.getUserId();
				Integer orderId=order.getOrderId();
				String orderCode=order.getOrderCode();
				Date orderDate=order.getOrderDate();
				String deliveryCode=null;
				if(order.getDeliveryCode()==null)
					deliveryCode="暂无";
				else deliveryCode=order.getDeliveryCode();
				String commented=null;
				if(order.getDeliveryStar()==null)
					commented="未评价";
				else commented="已评价";
				
				xml=xml+"<tr><td>"+userId+"</td><td>"+orderId+"</td><td>"+orderCode+"</td><td>"+orderDate.toString()+
						"</td><td>"+deliveryCode+"</td><td>"+commented+"</td></tr>";
			}
			xml+="</table>";
			out.println(xml);out.close();
		}
		if(way.equals("commented"))
		{	PrintWriter out=response.getWriter();
			String xml="";
			List<Order> li=os.getAllCommented();
			if(li==null)
			{out.println("没有已评价订单");}
			else
			{	xml="<table class=\"table\"><tr><th>订单ID</th><th>签收日期</th><th>描述相符</th><th>服务打分</th><th>物流评价</th></tr>";
				for(int i=0;i<li.size();i++)
				{
					Order order=li.get(i);
					Integer orderId=order.getOrderId();
					Date dateF=order.getFinishDate();
					Integer h=order.getHonestyStar();
					Integer s=order.getServiceStar();
					Integer d=order.getDeliveryStar();
					xml=xml+"<tr><td><a href=\""+basePath+"JSP/showOrderById.jsp?orderId="+orderId+"&backUrl=orderManagement.jsp\">"+orderId+"</a></td><td>"+dateF+"</td><td>"+h+"星</td><td>"+s+
							"星</td><td>"+d+"星</td></tr>";
				}
				xml=xml+"</table>";
				out.println(xml);
			}
			out.close();
		}
	}
	

}
