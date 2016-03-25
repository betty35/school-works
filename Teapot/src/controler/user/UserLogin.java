package controler.user;
import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bll.*;
import model.bean.Cart;

public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 4046594619399044392L;
	public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if (email != null && password != null)
		{
			if (!email.equals("") && !password.equals(""))
			{
				model.bean.User user = new UserService().login(email, password);
				model.bean.Cart cart=new Cart();
				if (user != null)
				{	if(user.getRole().equals("a"))
					{
					request.getSession().setAttribute("user", user);
					response.sendRedirect("JSP/productManagement.jsp");
					}
				else{
					request.getSession().setAttribute("user", user);
					response.sendRedirect("JSP/myShop.jsp");
	
					//request.getRequestDispatcher("Product?action=list").forward(request, response);
					}
				}
				else{
					response.sendRedirect("JSP/login.jsp?temp="+URLEncoder.encode("用户名或密码错误，请重新登录", "UTF-8"));
				}
			}
			else response.sendRedirect("JSP/login.jsp?temp="+URLEncoder.encode("未输入用户名或密码", "UTF-8"));
		}
		return;
	}
}
