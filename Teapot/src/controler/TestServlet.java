package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.User;

public class TestServlet extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2865339373194388850L;
private Date date=new Date();

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{doPost(request,response);}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=GB2312");//这条语句指明了向客户端发送的内容格式和采用的字符编码． 　　

PrintWriter out = response.getWriter();
out.println("这是Servlet的例子");
out.println(" 您好！现在的日期是："+date.toString());
String line=request.getParameter("line");
String what=request.getParameter("what");
out.println(line);
out.println("<br>");
out.println(what);
out.close();
}
}
