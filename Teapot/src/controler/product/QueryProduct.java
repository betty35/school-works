package controler.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.List;

import model.bean.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bll.ProductService;

public class QueryProduct extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2291679323612239002L;

	public QueryProduct(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); //两个都用UTF-8
		response.setCharacterEncoding("UTF-8");
		String way=request.getParameter("way");
		PrintWriter out=response.getWriter();
		ProductService ps=new ProductService();
		
		if(way.equals("byCategory"))
		{	String how=request.getParameter("how");
			String secId=request.getParameter("secId");
			Integer secondId=Integer.parseInt(secId);
			List<ProductList> li=ps.showProductListByCategory(secondId);
			
			if(how.equals("ajaxP"))
			{

				String xml="";
				if(li==null)
				{
					xml="<p>该分类还没有商品</p>";
				}
				else
				{
					xml="<table class=\"table\" width=\"490\">";
					xml+="<tr><th>商品表ID</th><th>品名</th><th>描述</th></tr>";
				for(int i=0;i<li.size();i++)
					{
					Integer id=li.get(i).getId();
					String name=li.get(i).getProductName();
					String detail=li.get(i).getDetail();
					
						xml=xml+"<tr><td>"+id+"</td><td>"+name+"</td><td>"+detail+"</td></tr>";
					}
				}
				xml+="</table>";
				out.println(xml);
			}
			
			if(how.equals("ajaxO"))
			{
				String xml="";

				if(li==null)
				{
					xml="1,该分类还没有商品";
				}
				else
				{for(int i=0;i<li.size();i++)
					{
					Integer id=li.get(i).getId();
					String name=li.get(i).getProductName();
					if(i==li.size()-1)
						xml=xml+id+","+name;
					else xml=xml+id+","+name+"|";
					}
				}
				out.println(xml);
			}
		}
		
		if(way.equals("search"))
		{//查询框中内容为searchLine
			String search=request.getParameter("searchLine");
			List<Product> li=ps.ProductSearch(search);
			request.setAttribute("searchResult", li);
			request.getRequestDispatcher("JSP/product.jsp?searchLine="+URLEncoder.encode(search, "UTF-8")).forward(request, response);
		}
		
		if(way.equals("byId"))
		{//按产品号（productlist的主键）查询
			//交给商品Spec页面
			String id=request.getParameter("productId");
			List<Product> li=ps.show(Integer.parseInt(id));
			request.setAttribute("searchResult",li);
			request.getRequestDispatcher("JSP/productSpe.jsp?productId="+URLEncoder.encode(id, "UTF-8")).forward(request, response);
		}
		
		if(way.equals("getProduct"))
		{
			Integer id=Integer.parseInt(request.getParameter("productId"));
			List<Product> li=ps.show(id);
			String xml="";
			

			if(li==null)
			{
				xml="<p>该分类还没有商品</p>";
			}
			else
			{
				xml="<table class=\"table\" width=\"490\">";
				xml+="<th>种类号</th><th>种类名</th><th>价格</th><th>厂商</th><th>库存</th>";
			for(int i=0;i<li.size();i++)
				{Product t=li.get(i);
				Integer specId=t.getSpecId();
				String name=t.getSpecName();
				Float price=t.getPrice();
				String brand=t.getBrand();
				Integer stock=t.getStock();
					xml+="<tr><td>"+specId+"</td><td>"+name+"</td><td>"+price+"</td><td>"
					+brand+"</td><td>"+stock+"</td></tr>";
				}
			}
			xml+="</table>";
			out.println(xml);
		}
		
		if(way.equals("byCate"))
		{
			Integer secId=Integer.parseInt(request.getParameter("secId"));
			List<Product> li=ps.showProductByCategory(secId);
			request.setAttribute("searchResult", li);
			request.getRequestDispatcher("JSP/product.jsp?secId="+secId).forward(request, response);
		}
		
		if(way.equals("price"))
		{
			Integer specId=Integer.parseInt(request.getParameter("specId"));
			Product pro=ps.getSpecProductBySpecId(specId);
			out.print(pro.getPrice());
		}
		if(way.equals("stock"))
		{
			Integer specId=Integer.parseInt(request.getParameter("specId"));
			Product pro=ps.getSpecProductBySpecId(specId);
			out.print(pro.getStock());
		}
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
}
