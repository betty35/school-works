<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="navi.jsp"></jsp:include>
<form action="../UserRegister" action="post" name="registerForm">
	<table class="table table-striped">
	<caption>用户注册</caption>
		<tr>
			<td>email:*</td><td><input type="email" name="email" maxlength="200"></input></td>
		</tr>
		<tr><td colspan="3" class="text-danger"><%=request.getParameter("temp")==null?"":request.getParameter("temp") %></td></tr>
		<tr>
			<td>密码:*</td><td><input type="password" name="password" maxlength="30"></input></td>
		</tr>
		<tr>
			<td>请重复输入密码:*</td><td><input type="password" name="password2" maxlength="30"></input></td>
		</tr>
		<tr>	
			<td>昵称:*</td><td><input type="text" name="nickName" maxlength="100"></input></td>
		</tr>
		<tr>	
			<td>姓名:*</td><td><input type="text" name="fullName" maxlength="100"></input></td>
		</tr>
		<tr>
			<td>性别:*</td><td>男：<input type="radio" name="gender" value="男">&nbsp;&nbsp;女：<input type="radio" name="gender" value="女"></td>
		</tr>
		<tr>	
			<td>手机号码:*</td><td><input type="text" name="mobile" maxlength="15"></input></td>
		</tr>	
		<tr>
			<td><input type="submit" value="注册"></td><td><input type="reset" value="重新填写"></td>
		</tr>
	</table>
	<input type="hidden" name="role" value="b">
</form>
</body>
</html>