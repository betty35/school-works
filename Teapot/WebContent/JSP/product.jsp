<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="model.bean.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>产品展示</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-2.1.1.js"></script>
</head>

<body>
<jsp:include page="navi.jsp"></jsp:include>
<h3 class="text-success" style="width:100%">查询结果~</h3>
<div>
<%
List<Product> li=(List<Product>)request.getAttribute("searchResult");

if(li==null)
out.println("没有找到相关商品");	

for(int i=0;i<li.size();i++)
{Product t=li.get(i);
%>
<!-- 之后这个div需要加class把它float起来分页 -->
<div style="float:left;margin:20px " class="panel panel-default">
<table><tr><td><div style="height:200px;width:200px">
<a href="Product?productId=<%=t.getProductId()%>&way=byId">
	<img alt="<%=t.getProductName() %>" src="img/<%=t.getImagePath()%>" class="img-rounded" style="width:100%;height:100%;"/>
      </a></div></td></tr>
<tr><td><strong><%=t.getProductName()%></strong></td></tr>
<tr><td>价格：<%=t.getPrice() %></td></tr>
</table>
</div>
<%
}
%>
</div>

</body>
</html>