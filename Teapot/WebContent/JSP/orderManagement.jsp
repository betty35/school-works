<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.User" %>
<%
 String path = request.getContextPath();
 String basePath = request.getScheme() + "://"
  + request.getServerName() + ":" + request.getServerPort()
  + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单管理</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="../css/tabPage.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-2.1.1.js"></script>
<script src="../js/tabPage.js"></script>
</head>

<body>
<%//没登录就闯的都愉快的扔出去(╯-v-)╯︵ 0<━<
//不是管理员的都扔出去(╯-v-)╯︵ 0<━< 普通用户都给我买东西去~
User user=null;
if(request.getSession().getAttribute("user")==null) response.sendRedirect("blocked.jsp");
else 
{
	user=(User)request.getSession().getAttribute("user");
	if(user.getRole().equals("b")) response.sendRedirect("blocked.jsp");	
}

%>
<script type="text/javascript">

$(document).ready(function(){
	$("#checkByStatusB").click(function(){
		var que=$("#showByStatusForm").serialize();
		$.post("../ShowOrder",que,function(data){
			$("#showOrder").html(data);
		});
	});
});

$(document).ready(function(){
	$.post("../ShowOrder","way=commented",function(data){
		$("#showAllComment").html(data);
	});
});
</script>

<div>
	<ul class="list-inline">
  		<li><a href="myShop.jsp">首页</a></li>
  		<li><a href="productManagement.jsp">商品种类管理</a></li>
  		<li><a href="productManagement2.jsp">品种与库存</a></li>
  		<li><a href="orderManagement.jsp">订单管理</a></li>
	</ul>
	</div>
<h3 class="text-info text-center">订单与评价管理</h3>
<div class="tab1" id="tab1">
	<div class="menu">
		<ul>
			<li id="one1" onclick="setTab('one',1)">按状态查看订单</li>
			<li id="one2" onclick="setTab('one',2)">查看已评价订单</li>
			<li id="one3" onclick="setTab('one',3)">订单状态管理</li>
			<li id="one4" onclick="setTab('one',4)">按订单id查询</li>
		</ul>
	</div>
	
	<div class="menudiv">
	<div id="con_one_1">
		<form id="showByStatusForm">
		<input type="hidden" name="way" value="byStatus">
		<select name="status" id="showByStatus">
		<option value="0">未付款</option>
		<option value="1">未发货</option>
		<option value="2">已发货</option>
		<option value="3">已签收</option>
		</select>
		</form>
		<button id="checkByStatusB">点击显示查询结果</button>
		<div id="showOrder"></div>
	</div>
	
	<div id="con_one_2" style="display:none;">
		<div>点击下列订单，查看具体评价</div>
		<div id="showAllComment"></div>	
	</div>
	<div id="con_one_3" style="display:none;">
		<p>单独更新订单状态：</p><br>
		<form action="../UpdateOrderStatus" method="post">
			<label>订单id:</label><input type="text" name="orderId">
			<br>
			<select name="status" id="status">
				<option value="0">未付款</option>
				<option value="1">未发货</option>
				<option value="2">已发货</option>
				<option value="3">已收货</option>
			</select>
			<input type="hidden" value="status" name="what">
			<input type="submit" value="确认改变该订单状态">
		</form>
		<br><br>
		<p>发货（自动改变订单状态为已发货）：</p>
		<form action="../UpdateOrderStatus" method="post">
		<label>订单id:</label><input type="text" name="orderId"/>
		<br><label>运单号：</label><input type="text" name="deliveryCode"/>
		<input type="hidden" value="deliveryCode" name="what"/>
		<br><input type="submit" value="确认发货">
		</form>	
	</div>
	
	<div id="con_one_4" style="display:none;">
		<form id="checkOrderForm" action="showOrderById.jsp" method=post>
		<label>输入订单号：</label><input type="text" name="orderId" id="findOrderId">
		<input type="hidden" name="backUrl" value="orderManagement.jsp">
		<button type="submit" id="checkOrderB">点击确认查询</button>
		</form>
		<div id="showThis"></div>
	</div>
	
	</div>
</div>

</body>
</html>