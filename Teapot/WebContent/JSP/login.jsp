<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="model.bean.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=GB2312">
<title>用户登陆</title>
<script src="../js/jquery-2.1.1.js"></script>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
<%
if(request.getSession().getAttribute("user")==null){
%>
<div class="panel panel-primary" style="width:40%">
	<div class="panel-heading">
      <h4 class="panel-title">登陆</h4>
    </div>
    
    <div class="panel-body" >
	<form action="../UserLogin" method="post" name="loginForm">
	<table class="table">
	<tr><td colspan=3 class="text-danger"><%=request.getParameter("temp")==null?"":request.getParameter("temp") %></td></tr>
	<tr><td colspan=2>用户名/email:</td><td><input type="email" name="email"></input></td>
	<tr><td colspan=2>密&nbsp;&nbsp;码:</td><td><input type="password" name="password"></input></td>
	<tr>
	<td><a href="register.jsp">用户注册</a></td>
	<td><a href="#">忘记密码</a></td>
	<td><input type="submit" value="登陆"></input></td>
	</tr>
	</table>
	</form>
	</div>
</div>
<%}
else
{User user=(User)request.getSession().getAttribute("user");
String nick=user.getNickName();
%>
<div class="panel panel-success" style="width:40%">
	<div class="panel-heading">
      <h4 class="panel-title"><%=nick %>，您已登陆</h4>
    </div>
    
    <div class="panel-body" >
    <p>需要登出吗？</p>
    <button class="btn btn-success" id="logout">确认登出</button>
    <p><a href="myShop.jsp">不需要，返回主页</a></p>
    </div>
</div>
<%
}
%>
<script type="text/javascript">
$(document).ready(function(){
	$("#logout").click(function(){
		$.post("logout.jsp","logout=yes",function(){ location.href="myShop.jsp";});
	   
	});
});

</script>
</body>
</html>