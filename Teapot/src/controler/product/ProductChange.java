package controler.product;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.ProductService;

public class ProductChange extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5757663980415077128L;
	private ProductService ps=new ProductService();
	public ProductChange(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); //两个都用UTF-8
		response.setCharacterEncoding("UTF-8");
		String method=request.getParameter("method");
		if(method.equals("NP"))
		{//NewProduct
			String productName=request.getParameter("productName");
			Integer secondCategoryId=Integer.parseInt(request.getParameter("secondCategoryId"));
			String detail=request.getParameter("detail");
			int key=ps.newProduct(productName, secondCategoryId, detail);
			if(key!=0) response.sendRedirect("JSP/operationSuccess.jsp?returnUrl="+URLEncoder.encode("JSP/productManagement.jsp", "UTF-8"));
			else response.sendRedirect("JSP/failed.jsp?returnUrl="+URLEncoder.encode("JSP/productManagement.jsp", "UTF-8"));
		}
		else if(method.equals("NS"))
		{//NewSpec
			String specName=request.getParameter("specName");
			Integer productId=Integer.parseInt(request.getParameter("productId"));
			String brand=request.getParameter("brand");
			String imagePath=request.getParameter("imagePath");
			Integer stock=Integer.parseInt(request.getParameter("stock"));
			Float price=Float.parseFloat(request.getParameter("price"));
			int key=ps.newSpec(specName, productId, price, brand, imagePath, stock);
			if(key!=0) response.sendRedirect("JSP/operationSuccess.jsp?returnUrl="+URLEncoder.encode("JSP/productManagement.jsp", "UTF-8"));
			else response.sendRedirect("JSP/failed.jsp?returnUrl="+URLEncoder.encode("JSP/productManagement.jsp", "UTF-8"));
		}
		else if(method.equals("UP"))
		{//UpdateProduct
			Integer ID=Integer.parseInt(request.getParameter("productId"));
			String productName=request.getParameter("productName");
			Integer secondId=Integer.parseInt(request.getParameter("secondCategoryId"));
			String detail=request.getParameter("detail");
			int key=ps.updateProduct(ID, productName, secondId, detail);
			if(key!=0) response.sendRedirect("JSP/operationSuccess.jsp?returnUrl="+URLEncoder.encode("JSP/productManagement.jsp", "UTF-8"));
			else response.sendRedirect("JSP/failed.jsp?returnUrl="+URLEncoder.encode("JSP/productManagement.jsp", "UTF-8"));
		}
		else if(method.equals("US"))
		{//UpdateSpec
			Integer specId=Integer.parseInt(request.getParameter("specId"));
			String specName=request.getParameter("specName");
			Float price=Float.parseFloat(request.getParameter("price"));
			String brand=request.getParameter("brand");
			String imagePath=request.getParameter("imagePath");
			int key=ps.updateProductSpec(specId, specName, brand, price, imagePath);
			if(key!=0) response.sendRedirect("JSP/operationSuccess.jsp?returnUrl="+URLEncoder.encode("JSP/productManagement.jsp", "UTF-8"));
			else response.sendRedirect("JSP/failed.jsp?returnUrl="+URLEncoder.encode("JSP/productManagement.jsp", "UTF-8"));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
}
