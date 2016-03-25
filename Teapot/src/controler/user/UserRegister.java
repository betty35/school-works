package controler.user;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.UserService;

public class UserRegister extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7782336160250622287L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nickName=request.getParameter("nickName");
		String password=request.getParameter("password");
		String password2=request.getParameter("password2");
		String fullName=request.getParameter("fullName");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String role=request.getParameter("role");
		
		
		if(!password.equals(password2))
		{String temp=URLEncoder.encode("�����������벻һ��", "UTF-8");
			response.sendRedirect("register.jsp?temp="+temp);
		}
		else
		{	
			int result= new UserService().register(email,password,nickName,mobile,fullName,gender,role);
			if(result==0)
			{String temp=URLEncoder.encode("��email�ѱ�ע�ᣬ������Ϣδ��д", "UTF-8");
				response.sendRedirect("JSP/register.jsp?temp="+temp);}
			else
			{String temp=URLEncoder.encode("ע��ɹ������½", "UTF-8");
				response.sendRedirect("JSP/login.jsp?temp="+temp);
			}
		}
	}

}
