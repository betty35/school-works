package controler.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.ProductService;

public class StockChange extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1730611654046969251L;

	public StockChange(){}
	
	private ProductService ps=new ProductService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//读取way来看是进货还是销售
		String way=request.getParameter("way");
		if(way.equals("in"))
		{
			Integer amount=Integer.parseInt(request.getParameter("amount"));
			Integer specId=Integer.parseInt(request.getParameter("specId"));
			int a=ps.replenish(specId, amount);
			if(a==0)
			response.sendRedirect("JSP/failed.jsp");
			else
			response.sendRedirect("JSP/operationSuccess.jsp");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
}
