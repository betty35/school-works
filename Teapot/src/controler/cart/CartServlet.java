package controler.cart;
import model.bean.Cart;
import model.bean.Product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.ProductService;

public class CartServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6542114089667277512L;

	public CartServlet(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); //��������UTF-8
		response.setCharacterEncoding("UTF-8");
		String way=request.getParameter("way");
		PrintWriter out=response.getWriter();
		if(way.equals("add")||way.equals("changeAmount"))
		{
		ProductService ps=new ProductService();
		Integer specId=Integer.parseInt(request.getParameter("specId"));
		Integer amount=Integer.parseInt(request.getParameter("amount"));
		//��ȡ���ﳵ
		Cart cart=null;
		if(request.getSession().getAttribute("cart")!=null)
		{cart = (Cart)request.getSession().getAttribute("cart");}
		else {cart=new Cart();}
		
		Product product=ps.getSpecProductBySpecId(specId);
		
			if(cart == null){
			cart = new Cart();
			request.getSession().setAttribute("cart", cart);
			}
	
			if(specId!=0)
			{	if(way.equals("add"))
				{cart.addItem(specId,product,amount);out.println("��ӳɹ�");}
			
				if(way.equals("changeAmount"))
				{cart.updateProductCount(specId, amount);out.println("����");}
				request.getSession().setAttribute("cart", cart);
			}
			out.println("��ӳɹ�");
		}
		else if(way.equals("delete"))
		{Integer specId=Integer.parseInt(request.getParameter("specId"));
			Cart cart = (Cart)request.getSession().getAttribute("cart");
			cart.deleteItem(specId);
			request.getSession().setAttribute("cart", cart);
			out.println("ɾ���ɹ�");
		}
		else if(way.equals("clear"))
		{	Cart cart = (Cart)request.getSession().getAttribute("cart");
			cart.clear();
			request.getSession().setAttribute("cart", cart);
			out.println("����չ��ﳵ");
		}
		else if(way.equals("plus"))
		{
			Cart cart = (Cart)request.getSession().getAttribute("cart");
			Integer specId=Integer.parseInt(request.getParameter("specId"));
			cart.plus(specId);
			request.getSession().setAttribute("cart", cart);
		}
		else if(way.equals("minus"))
		{
			Cart cart = (Cart)request.getSession().getAttribute("cart");
			Integer specId=Integer.parseInt(request.getParameter("specId"));
			cart.minus(specId);
			request.getSession().setAttribute("cart", cart);
		}
		else
		{
			out.print("����δ�ɹ�");
		}
		out.close();
	}
}
