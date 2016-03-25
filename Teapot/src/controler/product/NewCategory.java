package controler.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.ProductService;

public class NewCategory extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -327696199172631123L;
	private ProductService ps=new ProductService();
	public NewCategory(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type=request.getParameter("type");
			if(type.equals("first"))
			{
				String name=request.getParameter("categoryName");
				ps.new1stCategory(name);
			}
			else if(type.equals("second"))
			{
				Integer firstId=Integer.parseInt(request.getParameter("firstCategoryId"));
				String name=request.getParameter("categoryName");
				ps.new2ndCategory(firstId, name);
			}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
}
