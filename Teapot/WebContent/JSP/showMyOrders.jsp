<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.*" %>
<%@ page import="java.util.*" %>
<%@ page import="bll.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看我的订单</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="navi.jsp"></jsp:include>
<%//判断是否已登录
User user=null;
if(request.getSession().getAttribute("user")==null)
{%><p>您尚未登录，不能查看订单</p>
	<br><a href="myShop.jsp">点此回到首页登录</a><%	
}
else
{
	user=(User)request.getSession().getAttribute("user");
	Integer userId=user.getUserId();
	OrderService os=new OrderService();
	AddressService as=new AddressService();
	ProductService ps=new ProductService();
	List<Order> orderlist=os.getOrderByUser(userId);
	if(orderlist==null)
	{%>
	<div class="panel">您还没有订单</div>
  <%}
	else{
	List<OrderItem> items=null;
	for(int i=0;i<orderlist.size();i++)
	{	Order order=orderlist.get(i);
		Integer orderId=order.getOrderId();
		Integer orderStatus=order.getOrderStatus();
		String status=null;
		String panelclass=null;
		if(orderStatus==0) {status="未付款";panelclass="warning";}
		else if(orderStatus==1) {status="未发货";panelclass="primary";}
		else if(orderStatus==2) {status="已发货";panelclass="info";}
		else if(orderStatus==3) {status="已收货";panelclass="success";}
		else status="已删除";
		
		if(orderStatus==0||orderStatus==1||orderStatus==2||orderStatus==3)
		{//获取该订单全部订单项  //items是个List
			items=os.getAllOrderItemByOrderId(orderId);	
		//获取订单其他属性
			String orderCode=null;
		if(order.getOrderCode()!=null) orderCode=order.getOrderCode();
		else orderCode="暂无";
			Float totalPrice=order.getTotalPrice();
			Date orderDate=order.getOrderDate();
			Boolean commented=!(order.getHonestyStar()==null);
			String deliveryCode=null;
			Integer addressId=order.getAddressId();
			Address address=as.getAddressById(addressId);
			String linkman=address.getLinkman();
			String linkphone=address.getLinkphone();
			String place=address.getSheng()+", "+address.getShi()+", "+address.getAddress();
			if(orderStatus!=0)
			deliveryCode=order.getDeliveryCode();
			else deliveryCode="尚无";
			String deliveryWay=order.getDeliveryWay();
			String memo=order.getMemo();
			%>
			<div class="panel panel-<%=panelclass%>">
				<div class="panel-heading">
      				<h5 class="panel-title">订单ID:<%=orderId%>&nbsp;&nbsp;&nbsp;&nbsp;订单号：<%=orderCode%>&nbsp;&nbsp;&nbsp;&nbsp;运单号：<%=deliveryCode%>
      				&nbsp;&nbsp;&nbsp;&nbsp;状态：<%=status%>&nbsp;&nbsp;&nbsp;&nbsp;下单日期：<%=orderDate%></h5>
   				</div>
   				<div class="panel-body">
   					<p>送货地址:<%="  "+place %></p>
   					<br><p>联系人：<%=linkman+",     " %>联系电话：<%=linkphone %></p>
      				<table class="table">
      					<tr><th>图片</th><th>商品名</th><th>品种</th><th>单价</th><th>数量</th><th>总价</th></tr>
      					<%for(int j=0;j<items.size();j++)
      					{	//遍历该订单的订单项
      						OrderItem item=items.get(j);
      						Integer specId=item.getProductId();
      						String imgPath=ps.getSpecProductBySpecId(specId).getImagePath();
      						String name=item.getProductName();
      						String kind=item.getKind();
      						Float unitPrice=item.getUnitPrice();
      						Integer amount=item.getQuantity();
      						Float total=unitPrice*amount;
      					%>
      					<tr><td><div style="height:100px;width:100px"><img alt="<%=name %>" src="../img/<%=imgPath %>" class="img-rounded" style="width:100%;height:100%;"/></div></td>
      						<td><%=name %></td><td><%=kind %></td><td><%=unitPrice %></td><td><%=amount %></td><td><%=total %></td>
      					</tr>
      					<%
      					}
      					%>
      					<tr><td></td><td></td><td></td><td></td><td>总价:</td><td><%=totalPrice %></td></tr>
      				</table>
      				<p>备注：<%=memo %></p>
      				<br>
      					<%
      					if(orderStatus==0){
      					%>
      					<button class="btn-warning" onclick="location.href='../UpdateOrderStatus?back=order&what=status&status=1&orderId=<%=orderId%>'">确认付款</button>
      					<%
      					}else if(orderStatus==2){
      					%>
      					<button class="btn-info" onclick="location.href='../UpdateOrderStatus?back=order&what=status&status=3&orderId=<%=orderId%>'">确认收货</button>
      					<%	
      					}else if(orderStatus==3){if(!commented){
      					%>
      					<button class="btn-success" onclick="location.href='myComment.jsp?orderId=<%=orderId%>'">进行评价</button><span style="width:5%"></span>
      					<%
      					}
      					else
      					{
      					%>
      					<button class="btn-success" onclick="location.href='seeMyComment.jsp?orderId=<%=orderId%>'">查看评价</button>
      					<%	
      					}
      					%>
      					<button class="btn-success" onclick="location.href='../UpdateOrderStatus?back=order&what=status&status=4&orderId=<%=orderId%>'">删除订单</button>
      					<%
      					}
      					%>
   				</div>
			</div>
			<%
		}
	}}
}
%>
</body>
</html>