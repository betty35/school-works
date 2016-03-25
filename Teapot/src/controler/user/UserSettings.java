package controler.user;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bll.*;
import model.bean.*;

public class UserSettings extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4182806359671944037L;

	public UserSettings() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //��������UTF-8
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		UserService us=new UserService();
		//session��ȡ
		User user=(User)request.getSession().getAttribute("user");
		Integer userId=user.getUserId();
		//��ȡ����
		String change=request.getParameter("change");
		if(change.equals("basic"))
		{
			String nickName=request.getParameter("nickName");
			String mobile=request.getParameter("mobile");
			String fullName=request.getParameter("fullName");
			int temp=us.updateBasicById(userId, nickName, mobile, fullName);
			if(temp==0)
			{out.println("�û���Ϣ����ʧ��");}
			else
			{	User replace=us.login(user.getEmail(),user.getPassword());
				request.getSession().setAttribute("user", replace);
				out.println("�û���Ϣ���³ɹ�");
			}
			
		}
		if(change.equals("password"))
		{	
			String old=user.getPassword();
			String password=request.getParameter("password");
			String newPassword=request.getParameter("passwordN");
			if(old.equals(password))
			{
				int temp=us.updatePasswordById(userId, newPassword);
				if(temp==0)
					out.print("�������ʧ��");
				else 
				{User replace=us.login(user.getEmail(),newPassword);
				request.getSession().setAttribute("user", replace);
					out.println("������³ɹ�");
				}
			}
			else out.println("���������벻��ȷ���������ʧ��");
			
		}
		out.close();
	}
}
