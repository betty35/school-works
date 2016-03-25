<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.bean.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
 String path = request.getContextPath();
 String basePath = request.getScheme() + "://"
  + request.getServerName() + ":" + request.getServerPort()
  + path + "/";
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航</title>
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
<div>
<img src="<%=basePath%>img/welcome.png" style="width:100%">
<div class="panel text-right">
	<ul class="list-inline">
  	<li><a href="<%=basePath%>JSP/myShop.jsp">首页</a></li>
  	<li>|</li>
  	<li><a href="<%=basePath%>JSP/login.jsp">登陆/登出</a></li>
  	<li>|</li>
  	<li><a href="<%=basePath%>JSP/MyCart.jsp">购物车</a></li>
  	<li>|</li>
  	<li><a href="<%=basePath%>JSP/showMyOrders.jsp">我的订单</a></li>
  	<li>|</li>
  	<li><%
  	String welcome="游客您好~";
  	if(request.getSession().getAttribute("user")!=null)
  	{
  		User user=(User)request.getSession().getAttribute("user");
  		String nick=user.getNickName();
  		welcome=nick+"您好~";
  	}
  	%><%=welcome %></li>
	</ul>
</div>
</div>
</body>
</html>