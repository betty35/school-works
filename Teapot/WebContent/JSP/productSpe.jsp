<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
<%@ page import="model.bean.*" %>
<%@ page import="bll.*" %>
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
<title>具体商品</title>
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/jquery-picZoomer.css">
<script src="<%=basePath %>/js/jquery-2.1.1.js"></script>
<script src="<%=basePath %>/js/jquery.picZoomer.js"></script>
<!-- 下面是放大镜的插件 -->
<style type="text/css">
    .piclist{margin-top: 30px;}
    .piclist li{display: inline-block;width: 50px;height: 50px;}
    .piclist li img{width: 100%;height: auto;}
</style>
<script type="text/javascript">
        $(function() {$('.picZoomer').picZoomer();
			//切换图片
            $('.piclist li').click(function(event){
                var $pic = $(this).find('img');
                $('.picZoomer-pic').attr('src',$pic.attr('src'));
            });
        });
</script>
<!-- 放大镜插件结束 -->
</head>
<body>
<jsp:include page="navi.jsp"></jsp:include>
<script language="JavaScript"> 
$(document).ready(function(){
	$("#addCart").click(function(){
		var basePath=$("#basePath").val();
		var stock=$("#showStock").html();
		var amount=$("#amount").val();
		if(amount>stock)
			{alert("您不可以购买超过库存量的商品");}
		else
		{
		var q=$("#form1").serialize();
		q=q+"&way=add";
		$.post(basePath+"CartServlet",q,function(data,status){
				alert("商品添加成功");
		});
		}
	});
});

$(document).ready(function(){
	$("#spe").change(function(){
		var basePath=$("#basePath").val();
		var specId=$(this).val();
		var q1="way=price&specId="+specId;
		$.post(basePath+"Product",q1,function(data){
			$("#showPrice").html(data);
		});
		var q2="way=stock&specId="+specId;
		$.post(basePath+"Product",q2,function(data){
			$("#showStock").html(data);
			$("stock").val(data);
		});
	});
});

</script>


<%
List<Product> li=(List<Product>)request.getAttribute("searchResult");
String detail=li.get(0).getDetail();
String name=li.get(0).getProductName();
String imgPath=li.get(0).getImagePath();
%>
<input type="hidden" id="basePath" value="<%=basePath%>">
<table class="table table-bordered">
<tr><td colspan="4" rowspan="5">
	
	<div><!-- 商品图片存放框 -->
 <div class="picZoomer">
        <img src="img/<%=imgPath %>"  alt="图片">
    </div>

    <ul class="piclist">
<% Product[] p =new Product[li.size()];

	for(int i=0;i<li.size();i++)
	{
	p[i]=li.get(i);
	String spec=p[i].getSpecName();
	Float price=p[i].getPrice();
	imgPath=p[i].getImagePath();%>
	<li><img src="img/<%=imgPath %>" alt="<%=spec%>"></li>
<%
	}
%>
	</ul>
</div><!-- 商品图片存放框结束 -->
	
	</td>

<td><h2 class="text-success"><%=name %></h2></td></tr>
<tr><td rowspan="4">

<form id="form1">
<table class="table table-bordered">
<tr>
	<td><label>种类</label></td>
	<td>
	<select name="specId" id="spe">
	<%for(int i=0;i<p.length;i++){	%>
    <option value="<%=p[i].getSpecId()%>"><%=p[i].getSpecName()%></option>
	<%} %>
	</select>
	</td>
</tr>
<tr><td>价格：</td><td><span id="showPrice"><%=p[0].getPrice() %></span></td></tr>
<tr><td>库存：</td><td><span id="showStock"><%=p[0].getStock() %></span></td></tr>
<tr><td>数量：</td><td><input type="number" id="amount" name="amount" value="1"/></td></tr>
<tr><td colspan="2"><input type="button" id="addCart" value="加入购物车"/></td></tr>
</table>
</form>


</td></tr>

</table>



<!-- 简介 -->
<h4 class="text-info">商品简介</h4>
<div id="detail" class="panel panel-primary">
<div class="panel-body"><%=detail %></div>
</div>
<h4 class="text-info">评论</h4>
<div id="comment">
<%
UserService us=new UserService();
OrderService os=new OrderService();
for(int i=0;i<li.size();i++)
{
Product product=li.get(i);
Integer specId=product.getSpecId();
List<OrderItem> co=os.getCommentBySpec(specId);
if(co==null)
{}
else
{
	for(int j=0;j<co.size();j++)
	{
		OrderItem item=co.get(j);
		String comment=item.getComment();
		String kind=item.getKind();
		Date finishD=item.getCommentTime();
		%>
		<div class="panel panel-default">
			<div class="panel-body">
			<%
			Integer orderId=item.getOrderId();
			Order od=os.getOrderById(orderId);
			Integer userId=od.getUserId();
			String nickName=us.getNickNameById(userId);
			Integer ano=item.getAnonymous();
			if(ano==1) nickName=nickName.substring(0, 1)+"*************";
			%>
			<p>商品种类：<%=kind %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评价日期：<%=finishD %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评价者：<%=nickName %></p>
			<hr/>
			<p>评价：&nbsp;&nbsp;<%=comment %></p>
			</div>
		</div>
		<%
	}
}
}
%>
</div>
</body>
</html>