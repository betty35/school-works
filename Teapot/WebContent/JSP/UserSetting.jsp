<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户设置</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
<script src='../js/jquery-2.1.1.js'></script>
</head>
<body>
<jsp:include page="navi.jsp"></jsp:include>
<script type="text/javascript">
$(document).ready(function(){
	$("#basicB").click(function(){
		var q=$("#basicForm").serialize();
		$.post("../UserSettings",q,function(data,status){
			alert(data);
		});
	});
});

$(document).ready(function(){
	$("#passwordB").click(function(){
		var p1=$("#N").val();
		var p2=$("#N2").val();
		if(p1!=p2)
		{alert("两次输入新密码不相符，请重新输入");}
		else
		{
			var q2=$("#passwordForm").serialize();
			$.post("../UserSettings",q2,function(data){
				alert(data);
			});
		}
	});
});
</script>

<%
User user=null;
if(request.getSession().getAttribute("user")==null)
{
%>
<div class="panel panel-warning">

	<div class="panel-heading">
      <h4 class="panel-title">请先登陆</h4>
    </div>
    
    <div class="panel-body">
		<a href="login.jsp">点此登陆</a>
		<br><br>
		<a href="myShop.jsp">点此回到主页</a>
	</div>
</div>
<%
}
else
	{user=(User)request.getSession().getAttribute("user");
%>

<div class="panel panel-info">
	<div class="panel-heading">
      <h4 class="panel-title">用户基本信息修改</h4>
    </div>
    
    <div class="panel-body">
		<form id="basicForm">
		<table>
		<tr><td>昵称：</td><td><input type="text" name="nickName" value="<%=user.getNickName()%>"></td></tr>
		<tr><td>电话：</td><td><input type="text" name="mobile" value="<%=user.getMobile()%>"></td></tr>
		<tr><td>姓名：</td><td><input type="text" name="fullName" value="<%=user.getFullName()%>">
		<input type="hidden" name="change" value="basic"></td></tr>
		<tr><td colspan="2"><input id="basicB" type="button" value="确认提交"></td></tr>
		</table>
		</form>
	</div>
</div>

<div class="panel panel-success">
	<div class="panel-heading">
      <h4 class="panel-title">密码修改</h4>
    </div>
    
    <div class="panel-body">
		<form id="passwordForm">
			<table>
			<tr><td>原密码：</td><td><input type="text" name="password"></td></tr>
			<tr><td>新密码：</td><td><input type="text"  name="passwordN" id="N"></td></tr>
			<tr><td>重复一遍：</td><td><input type="text" name="passwordN2" id="N2">
			<input type="hidden" name="change" value="password"></td></tr>
			<tr><td colspan="2"><input id="passwordB" type="button" value="确认提交"></td></tr>
			</table>
		</form>
	</div>
</div>
<%} %>

</body>
</html>