package controler.order;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.OrderService;
import bll.ProductService;
import model.bean.Cart;
import model.bean.CartItem;
import model.bean.Product;
import model.bean.User;

public class NewOrder extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7054858781072764436L;

	public NewOrder(){}
	
	OrderService os=new OrderService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //两个都用UTF-8
		response.setCharacterEncoding("UTF-8");
		// 获取session中信息
		User user=(User) request.getSession().getAttribute("user");
		Integer userId=user.getUserId();
		Cart cart=(Cart) request.getSession().getAttribute("cart");
		Float totalPrice=cart.getTotalPrice();
		//获取提交信息
		String deliveryWay=request.getParameter("deliveryWay");
		String paymentWay=request.getParameter("paymentWay");
		Integer addressId=Integer.parseInt(request.getParameter("addressId"));
		String memo=request.getParameter("memo");
		//创建订单,领取订单id~
		int key=os.newOrder(userId, deliveryWay, paymentWay, addressId, totalPrice, memo);
		//为每个CartItem创建订单项,减少库存
		ProductService ps=new ProductService();
		HashMap<Integer,CartItem> items=cart.getItems();
		Iterator<Entry<Integer, CartItem>> it=items.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, CartItem> entry=(Map.Entry<Integer, CartItem>)it.next();
			Integer specId=entry.getKey();
			CartItem item=entry.getValue();
			Product pro=item.getProduct();
			os.newOrderItem(key, specId, pro.getProductName(), pro.getSpecName(), pro.getPrice(), item.getCount());
			ps.sellOut(specId, item.getCount());
		}
		cart.clear();
		request.getSession().setAttribute("cart", cart);
		response.sendRedirect("JSP/showMyOrders.jsp");
	}
}
