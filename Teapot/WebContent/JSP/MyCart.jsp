<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.Map.Entry" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的购物车</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
<script src='../js/jquery-2.1.1.js'></script>
</head>
<body>
<jsp:include page="navi.jsp"></jsp:include>
<script language="JavaScript">

</script>

<%
User user;
if(request.getSession().getAttribute("user")==null)
{%><p>您还没有登陆，购物车暂存</p><br><%}
else
{user=(User)request.getSession().getAttribute("user");
String username=user.getNickName();%><p>这里是<%=username %>的购物车</p><br><%}
//从session获取购物车
Cart cart;
if(!(request.getSession().getAttribute("cart")==null))
{
cart=(Cart)request.getSession().getAttribute("cart");
	if(cart.getItemCount() == 0)
	{
%><p>购物车还没有商品，快去添加吧！</p><%
	}
	else{//遍历购物车里面的东西
		%><table class="table"><tr><th>图片</th><th>品名</th><th>单价</th><th>数量</th><th>总价</th></tr>
		<%
		HashMap<Integer,CartItem> items=cart.getItems();
		Iterator<Entry<Integer, CartItem>> it=items.entrySet().iterator();
			while(it.hasNext())
			{
			Map.Entry<Integer, CartItem> entry=(Map.Entry<Integer, CartItem>)it.next();
			Integer specId=entry.getKey();
			CartItem item=entry.getValue();
			Product pro=item.getProduct();
			String name=pro.getProductName();
			String spec=pro.getSpecName();
			float price=pro.getPrice();
			String imgPath=pro.getImagePath();
			Integer amount=item.getCount();
			Integer stock=pro.getStock();
			float total=item.getItemPrice();
			price=(float)(Math.round(price*100))/100;
			total=(float)(Math.round(total*100))/100;
		%>
<tr>
<td><div style="height:100px;width:100px"><img alt="<%=name %>" src="../img/<%=imgPath %>" class="img-rounded" style="width:100%;height:100%;"/></div></td>
<td><%=name %><br><br><%=spec %></td><td><br><%=price %></td>
<td><button class="btn btn-primary btn-xs" name="minus" value="<%=specId%>"> &nbsp;-&nbsp; </button>
	<input type="text" class="number" id="<%=specId %>" value="<%=amount %>" min="1">
	<button class="btn btn-primary btn-xs" name="plus" value="<%=specId%>"> &nbsp;+&nbsp; </button>
	<br><input type="hidden" name="stock" id="s<%=specId %>" value="<%=stock%>"><p>库存：<%=stock %></p>
</td>
<td><%=total %></td>
<td><button class="btn btn-link" name="delete" value="<%=specId%>">删除</button></td>
</tr>
<%
			}
		%>
		<tr><td><button class="btn btn-link" name="clear">清空购物车</button></td>
		<td></td><td></td><td></td><td>总价：</td><td><%=(float)(Math.round(cart.getTotalPrice()*100))/100 %></td><td></td></tr>
		</table>
		<%
	}
}
else {%><p>您的购物车中目前还没有商品</p> <%}%>

<form action="SetOrder.jsp" method="post">
<input type="submit" value="前去提交订单">
</form>

<script type="text/javascript">
$(document).ready(function(){
	$("button").click(function(){
		var way=$(this).attr("name");
		if(way=="plus")
		{
			var specId=$(this).val();
			var amount=$("#"+specId).val();
			var max=$("#s"+specId).val();
			if(amount==max)
				{alert("您不可以购买超过库存限制的商品");}
			else
			{
				var q="way=plus&specId="+specId;
				$.post("../CartServlet",q,function(data,status){
				if(status=="success") {location.reload();}
				});
			}
		}
		if(way=="minus")
		{
			var specId=$(this).val();
			var amount=$("#"+specId).val();
			var q="way=minus&specId="+specId;
			if(amount>=2)
			{$.post("../CartServlet",q,function(data,status){
				if(status=="success")
				{location.reload();}
			});
			}
			else alert("数量不可以小于1");
		}
		if(way=="delete")
		{	
			var specId=$(this).val();
			var q="way=delete&specId="+specId;
			$.post("../CartServlet",q,function(data,status){
				if(status=="success")
				{location.reload();}
			});	
		}
		if(way=="clear")
		{
			var q="way=clear";
			$.post("../CartServlet",q,function(data,status){
				if(status=="success")
				{location.reload();}
			});	
		}
	});
});
</script>
</body>
</html>