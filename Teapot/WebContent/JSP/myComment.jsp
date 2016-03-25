<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.*" %>
<%@ page import="bll.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的评价</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="../css/star.css" rel="stylesheet" type="text/css"><!-- 星星打分，纯CSS插件 -->
<script src="../js/jquery-2.1.1.js"></script>
</head>
<body>
<jsp:include page="navi.jsp"></jsp:include>
<h3>我的商品评价：</h3>
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
	Integer id=item.getId();
%>
<div class="panel panel-default">
   <div class="panel-heading"><h3 class="panel-title"><%="商品："+name+"            种类"+kind %></h3></div>
   <div class="panel-body">
   <form  id="<%=i %>">
   	<table style="width:40%">
   		<tr><td colspan="2" rowspan="3"><div style="height:160px;width:160px;"><img alt="<%=name %>" src="../img/<%=imgPath %>" class="img-rounded" style="width:100%;height:100%;"/></div></td>
   		<td><label>好评</label><input type="radio" name="grade"  value="3"/><span>&nbsp;&nbsp;</span></td>
   		<td><label>中评</label><input type="radio" name="grade"  value="2"/><span>&nbsp;&nbsp;</span></td>
   		<td><label>差评</label><input type="radio" name="grade"  value="1"/><span>&nbsp;&nbsp;</span></td>
   		</tr>
   		<tr><td colspan="4"><br><textarea name="comment" rows="4" style="width:200%"></textarea></td></tr>
   		<tr><td colspan="2"></td><td>是否匿名？<input type="checkbox" name="anonymous" value="1"></td></tr>
   	</table>
   		<input type="hidden" name="id" value="<%=id%>">
   		<input type="hidden" name="what" value="orderItem">
   	</form>
   </div>
</div><!-- 写js循环的上交吧 -->
<%		
}
%>
<div class="panel panel-info">
   <div class="panel-heading"><h3 class="panel-title">对本次订单的评价</h3></div>
   <div class="panel-body">
   <form id="order" action="../NewComment" method="post">
   		<input type="hidden" name="orderId" value="<%=orderId%>">
   		<input type="hidden" name="what" value="order">
		<label>商品符合描述：</label>   
		<div class="star_bg">                 	
    	<input type="radio" id="starScore1" class="score score_1" value="1" name="honestyStar">
    	<a href="#starScore1" class="star star_1" title="差"><label for="starScore1">差</label></a>
    	<input type="radio" id="starScore2" class="score score_2" value="2" name="honestyStar">
   		<a href="#starScore2" class="star star_2" title="较差"><label for="starScore2">较差</label></a>
    	<input type="radio" id="starScore3" class="score score_3" value="3" name="honestyStar">
    	<a href="#starScore3" class="star star_3" title="普通"><label for="starScore3">普通</label></a>
    	<input type="radio" id="starScore4" class="score score_4" value="4" name="honestyStar">
    	<a href="#starScore4" class="star star_4" title="较好"><label for="starScore4">较好</label></a>
    	<input type="radio" id="starScore5" class="score score_5" value="5" name="honestyStar">
    	<a href="#5" class="star star_5" title="好"><label for="starScore5">好</label></a>
    	</div><br>
		<label>服务质量评价：</label>  
		<div class="star_bg">                  	
    	<input type="radio" id="starScore21" class="score score_1" value="1" name="serviceStar">
    	<a href="#starScore21" class="star star_1" title="差"><label for="starScore21">差</label></a>
    	<input type="radio" id="starScore22" class="score score_2" value="2" name="serviceStar">
   		<a href="#starScore22" class="star star_2" title="较差"><label for="starScore22">较差</label></a>
    	<input type="radio" id="starScore23" class="score score_3" value="3" name="serviceStar">
    	<a href="#starScore23" class="star star_3" title="普通"><label for="starScore23">普通</label></a>
    	<input type="radio" id="starScore24" class="score score_4" value="4" name="serviceStar">
    	<a href="#starScore24" class="star star_4" title="较好"><label for="starScore24">较好</label></a>
    	<input type="radio" id="starScore25" class="score score_5" value="5" name="serviceStar">
    	<a href="#5" class="star star_5" title="好"><label for="starScore25">好</label></a>
    	</div>
    	<br>
		<label>送货速度评价：</label>   
		<div class="star_bg">              	
    	<input type="radio" id="starScore31" class="score score_1" value="1" name="deliveryStar">
    	<a href="#starScore31" class="star star_1" title="差"><label for="starScore31">差</label></a>
    	<input type="radio" id="starScore32" class="score score_2" value="2" name="deliveryStar">
   		<a href="#starScore32" class="star star_2" title="较差"><label for="starScore32">较差</label></a>
    	<input type="radio" id="starScore33" class="score score_3" value="3" name="deliveryStar">
    	<a href="#starScore33" class="star star_3" title="普通"><label for="starScore33">普通</label></a>
    	<input type="radio" id="starScore34" class="score score_4" value="4" name="deliveryStar">
    	<a href="#starScore34" class="star star_4" title="较好"><label for="starScore34">较好</label></a>
    	<input type="radio" id="starScore35" class="score score_5" value="5" name="deliveryStar">
    	<a href="#5" class="star star_5" title="好"><label for="starScore35">好</label></a>
    	</div>
   </form>
   <br>
   <button type="button" class="btn btn-info" value="<%=itemNumber%>" id="submitAll">提交所有评价~</button>
   </div>
</div>

<script type="text/javascript">
$(document).ready(function(){
	$("#submitAll").click(function()
	{
	var n=$(this).val();
		for(var i=0;i<n;i++)
		{//交了所有的item评价表
		var queryString = $('#'+i).serialize(); 
		$.post('../NewComment', queryString); 
		}
		document.getElementById("order").submit();
	});	
});



</script>
</body>
</html>