package controler.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.ProductService;
import model.bean.SecondCategory;

public class Show2ndCategory extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4343016965395905823L;
	private ProductService ps=new ProductService();
	public Show2ndCategory(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8"); //两个都用
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String targetId = request.getParameter("id").toString();
        String xml = "";
         List<SecondCategory> li2=ps.showSecondCategory(Integer.parseInt(targetId));
     
         for(int i=0;i<li2.size();i++)
        {
        	Integer listValue=li2.get(i).getId();
        	
        	String name=li2.get(i).getCategoryName();
        	
        	if(i==li2.size()-1)
        		xml+=listValue+","+name;
        	else
        	xml += listValue+","+name+"|";
        }
    	   
        out.println(xml);
       
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
}
