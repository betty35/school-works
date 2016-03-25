<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ page import="model.bean.*" %>
    <%@ page import="bll.AddressService"%>
    <%@ page import="java.util.List"%>
    <%@ page import="model.bean.Address" %>
    <%@ page import="java.util.*" %>
	<%@ page import="java.util.Map.Entry" %>
	
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
<title>确认订单</title>
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="<%=basePath %>/js/jquery-2.1.1.js"></script>
</head>
<body>
<jsp:include page="navi.jsp"></jsp:include>

<div>
<form action="../NewOrder" method="post" id="orderForm">
<%
User user;
if(request.getSession().getAttribute("user")!=null)
{%><h3>确认订单</h3><h4>收货地址</h4><%
user=(User)request.getSession().getAttribute("user");
Integer userId=user.getUserId();
AddressService as=new AddressService();
List<Address> li=as.getAddressByUser(userId);
if(li==null)
{%><p>没有找到地址</p>
<%
}
else{
for(int i=0;i<li.size();i++)
{Address t=li.get(i);
String sheng=t.getSheng();
String shi=t.getShi();
String address=t.getAddress();
Integer addressId=t.getId();
String zipcode=t.getZipcode();
%>

<div style="float:left;margin:10px" class="panel panel-info">
	<div class="panel-heading">
      <h4 class="panel-title">    
      <p>
      <input type="radio" name="addressId" value="<%=addressId%>" <%=(i==0)?"checked":"" %>/>
      	收件人：<%=t.getLinkman() %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;联系电话：<%=t.getLinkphone() %>
      </p>
      </h4>
   </div>
   <div class="panel-body">
	<p>地址：<%=sheng+", "+shi+", "+address%></p>
	<p>邮编：<%=zipcode %></p>
	</div>
</div>

<%} 
%>
<p style="clear:both"></p>
<br><a href="addressSetting.jsp">前去修改地址，稍后从购物车回来</a>
<%
}%>
<p style="clear:both"></p>
<br>
</div>

	<label>邮寄方式</label><select id="deliveryWay" name="deliveryWay">
	<option value="邮政小包">邮政小包</option>
	<option value="中通">中通</option>
	<option value="申通">申通</option>
	<option value="圆通">圆通</option></select>
<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
	<label>支付方式</label><select id="paymentWay" name="paymentWay">
	<option value="网上支付">网上支付</option>
	<option value="货到付款">货到付款</option>
	</select>
	<br>
<br>

<h3>商品列表：</h3>
<table class="table"><tr><th>图片</th><th>品名</th><th>单价</th><th>数量</th><th>总价</th></tr>
<% Cart cart=(Cart)request.getSession().getAttribute("cart");
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
	Float price=pro.getPrice();
	String imgPath=pro.getImagePath();
	Integer amount=item.getCount();
	float total=item.getItemPrice();
	total=(float)(Math.round(total*100))/100;%>
<tr>
<td><div style="height:100px;width:100px"><img alt="<%=name %>" src="../img/<%=imgPath %>" class="img-rounded" style="width:100%;height:100%;"/></div></td>
<td><%=name %></td><td><%=price %></td><td><%=amount %></td><td><%=total %></td>
</tr>
<% }%>
<tr><td></td><td></td><td></td><td>总价：</td><td><%=(float)(Math.round(cart.getTotalPrice()*100))/100 %></td></tr>
</table>
<a href="MyCart.jsp">返回购物车修改商品及数量</a><br>
<br><label for="memo">买家留言：</label><textarea style="width:60%" name="memo" id="memo" rows="3"></textarea>
<%
}
else {%><p>您还没有登录，请先登录。</p>
<br><a href="login.jsp">点此登录</a>
<% 
}%>
<br>
<input type="submit" value="确认订单并提交">
</form>
</body>
</html>