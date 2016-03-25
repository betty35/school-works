package controler.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bll.ProductService;

public class Show1stCategory extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5737793814345046390L;
	private ProductService ps=new ProductService();
	public Show1stCategory(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); //两个都用
		response.setCharacterEncoding("UTF-8");
        String xml = "";
        
        List<model.bean.FirstCategory> li1=ps.showFirstCategory();
        for(int i=0;i<li1.size();i++)
        {
        	Integer listValue=li1.get(i).getId();
        	String name=li1.get(i).getCategoryName();
        	if(i==li1.size()-1)
        	xml +=listValue+","+name;
        	else
        		xml+=listValue+","+name+"|";
        }
        response.getWriter().write(xml);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
}
