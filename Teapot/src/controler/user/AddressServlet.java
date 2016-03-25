package controler.user;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bll.*;
import model.bean.User;

public class AddressServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2385565868916974764L;

	AddressService as=new AddressService();
	public AddressServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8"); //两个都用UTF-8
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		User user=(User)request.getSession().getAttribute("user");
		Integer userId=user.getUserId();
		String way=request.getParameter("way");
		if(way.equals("new"))
		{
			String man=request.getParameter("linkman");
			String phone=request.getParameter("linkphone");
			String code=request.getParameter("zipcode");
			String sheng=request.getParameter("sheng");
			String shi=request.getParameter("shi");
			String address=request.getParameter("address");
			int temp=as.newAddress(userId, man, phone, code, sheng, shi, address);
			if(temp==0) out.println("地址添加失败");
			else out.print("地址添加成功");
		}
		if(way.equals("update"))
		{
			Integer id=Integer.parseInt(request.getParameter("id"));//注意取得订单id
			String man=request.getParameter("linkman");
			out.print(man);
			String phone=request.getParameter("linkphone");
			String code=request.getParameter("zipcode");
			String sheng=request.getParameter("sheng");
			String shi=request.getParameter("shi");
			String address=request.getParameter("address");
			int temp=as.updateAddressById(id, man, phone, code, sheng, shi, address);
			if(temp==0) out.println("地址修改失败");
			else out.println("地址修改成功");
		}
		if(way.equals("delete"))
		{
			Integer id=Integer.parseInt(request.getParameter("id"));//注意取得订单id
			int temp=as.deleteAddressById(id);
			if(temp==0) out.println("删除失败");
			else out.println("删除成功");
		}
		out.close();
	}
}
