<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>logout</title>
</head>
<body>
<%
if(request.getParameter("logout")==null)
	response.sendRedirect("login.jsp");
else
{
	String logout=request.getParameter("logout");
	if(logout.equals("yes"))
	{
		request.getSession().removeAttribute("user");
	}
	response.sendRedirect("myShop.jsp");
}

%>
</body>
</html>