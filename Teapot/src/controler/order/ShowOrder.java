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
		request.setCharacterEncoding("UTF-8"); //��������UTF-8
		response.setCharacterEncoding("UTF-8");
		String way=request.getParameter("way");
		String path = request.getContextPath();
		 String basePath = request.getScheme() + "://"
		  + request.getServerName() + ":" + request.getServerPort()
		  + path + "/";
		if(way.equals("byStatus"))
		{PrintWriter out=response.getWriter();
			String xml="<table class=\"table\"><tr><th>���ID</th><th>orderId</th><th>orderCode</th><th>����ʱ��</th><th>�˵���</th><th>������</th></tr>";
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
					deliveryCode="����";
				else deliveryCode=order.getDeliveryCode();
				String commented=null;
				if(order.getDeliveryStar()==null)
					commented="δ����";
				else commented="������";
				
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
			{out.println("û�������۶���");}
			else
			{	xml="<table class=\"table\"><tr><th>����ID</th><th>ǩ������</th><th>�������</th><th>������</th><th>��������</th></tr>";
				for(int i=0;i<li.size();i++)
				{
					Order order=li.get(i);
					Integer orderId=order.getOrderId();
					Date dateF=order.getFinishDate();
					Integer h=order.getHonestyStar();
					Integer s=order.getServiceStar();
					Integer d=order.getDeliveryStar();
					xml=xml+"<tr><td><a href=\""+basePath+"JSP/showOrderById.jsp?orderId="+orderId+"&backUrl=orderManagement.jsp\">"+orderId+"</a></td><td>"+dateF+"</td><td>"+h+"��</td><td>"+s+
							"��</td><td>"+d+"��</td></tr>";
				}
				xml=xml+"</table>";
				out.println(xml);
			}
			out.close();
		}
	}
	

}
