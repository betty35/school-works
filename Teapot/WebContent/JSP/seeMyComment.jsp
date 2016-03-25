<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.*" %>
<%@ page import="java.util.*" %>
<%@ page import="bll.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看订单评价</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="navi.jsp"></jsp:include>
<%
Integer orderId=Integer.parseInt(request.getParameter("orderId"));
OrderService os=new OrderService();
ProductService ps=new ProductService();
Order order=os.getOrderById(orderId);
List<OrderItem> items=null;
items=os.getAllOrderItemByOrderId(orderId);
Integer itemNumber=items.size();
for(int i=0;i<itemNumber;i++)
{
	OrderItem item=items.get(i);
	Integer specId=item.getProductId();
	String imgPath=ps.getSpecProductBySpecId(specId).getImagePath();
	String name=item.getProductName();
	String kind=item.getKind();
	Integer grade=item.getGrade();
	String showGrade=null;
	if(grade==3) showGrade="好评";
	else if(grade==2) showGrade="中评";
	else if(grade==3) showGrade="差评";
	else showGrade="暂无";
	String comment=item.getComment();
	Integer ano=item.getAnonymous();
	String showIt="未匿名";
	if(ano==1) showIt="匿名";
%>
<div class="panel panel-default">
   <div class="panel-heading"><h3 class="panel-title"><%="商品："+name+"            种类"+kind %></h3></div>
   <div class="panel-body">
   	<table style="width:40%">
   		<tr><td colspan="2" rowspan="3"><div style="height:160px;width:160px;"><img alt="<%=name %>" src="../img/<%=imgPath %>" class="img-rounded" style="width:100%;height:100%;"/></div></td>
   		<td>评价：</td>
   		<td><%=showGrade %></td>
   		</tr>
   		<tr><td colspan="2"><p>评论：</p><p><%=comment %></p></td></tr>
   		<tr><td colspan="3">评论匿名情况：</td><td><%=showIt %></td></tr>
   	</table>
   </div>
</div><!-- 写js循环的上交吧 -->
<%		
}
%>

</body>
</html>