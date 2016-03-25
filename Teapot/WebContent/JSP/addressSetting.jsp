<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.*" %>
<%@ page import="bll.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>收货地址</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
<script src='../js/jquery-2.1.1.js'></script>
</head>
<body>
<jsp:include page="navi.jsp"></jsp:include>
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
{
	AddressService as=new AddressService();
	user=(User)request.getSession().getAttribute("user");
	Integer userId=user.getUserId();
	List<Address> li=as.getAddressByUser(userId);
	if(li!=null)
	{
		for(int i=0;i<li.size();i++)
		{
			Address t=li.get(i);
			String sheng=t.getSheng();
			String shi=t.getShi();
			String address=t.getAddress();
			Integer addressId=t.getId();
			String zipcode=t.getZipcode();
%>
<div style="float:left;margin:20px;" class="panel panel-info">
	<div class="panel-heading">
      <h3 class="panel-title">收货地址</h3>
   </div>
   <form id="<%=addressId%>">
   <div class="panel-body">
	<p>地址：&nbsp;&nbsp;省：<input type="text" name="sheng" value="<%=sheng%>">
	&nbsp;&nbsp;市：<input type="text" name="shi" value="<%=shi%>">
	&nbsp;&nbsp;地址：<input type="text" name="address" value="<%=address%>"></p>
	<p>收件人：<input type="text" name="linkman" value="<%=t.getLinkman() %>">
	<span style="width:20px"></span>联系电话：<input type="text" name="linkphone" value="<%=t.getLinkphone() %>"></p>
	<p>邮编：<input type="text" name="zipcode" value=<%=zipcode %>></p>
	<br><button class="btn btn-link" name="update" value="<%=addressId%>">更新</button>
	<span style="width:10px"></span>
	<button class="btn btn-link" name="delete" value="<%=addressId%>">删除</button>
	</div>
	</form>
</div>
<%		}
	}
%>
	<div style="float:left;margin:20px;" class="panel panel-info">
	<div class="panel-heading">
      <h3 class="panel-title">收货地址</h3>
   </div>
   <form id="newAddress">
   <div class="panel-body">
	<p>省：<input type="text" name="sheng">
	&nbsp;&nbsp;市：<input type="text" name="shi" >
	&nbsp;&nbsp;地址：<input type="text" name="address" ></p>
	<p>收件人：<input type="text" name="linkman" >
	<span style="width:20px"></span>联系电话：<input type="text" name="linkphone" ></p>
	<p>邮编：<input type="text" name="zipcode"></p>
	<br><button class="btn btn-link" name="new">新建收货地址</button>
	</div>
	</form>
</div>
<%
} 
%>
<script type="text/javascript">
$(document).ready(function(){
	$("button").click(function(){
		var way=$(this).attr("name");
		if(way=="new")
		{
			var q=$("#newAddress").serialize();
			q=q+"&way=new";
			$.post("../AddressServlet",q,function(data,status){
				alert(data);
				if(status=="success") location.href="addressSetting.jsp";
			});
		}
		else if(way=="update")
		{
			var id=$(this).val();
			var q2=$("#"+id).serialize();
			q2=q2+"&way=update&id="+id;
			$.post("../AddressServlet",q2,function(data,status){
				alert(data);
				if(status=="success") location.href="addressSetting.jsp";
			});
		}
		else if(way=="delete")
		{
			var id2=$(this).val();
			var q3="&way=delete&id="+id2;
			$.post("../AddressServlet",q3,function(data,status){
				alert(data);
				if(status=="success") location.href="addressSetting.jsp";
			});
		}
	});
});
</script>
</body>
</html>