<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>栗子饮品铺</title>

<!--各种css-->
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet" type="text/css"><!-- bootstrap-->
<link rel="stylesheet" href="<%=basePath %>/css/reset.css"> <!-- CSS reset(下拉菜单用的一部分css) -->
<link rel="stylesheet" href="<%=basePath %>/css/style.css"> <!-- Resource style (下拉菜单的主要css)-->
<!--屏幕响应式-->
<script src="<%=basePath %>/js/respond.min.js"></script>
<script src='<%=basePath %>/js/jquery-2.1.1.js'></script>
<script src="<%=basePath %>/js/main.js"></script> <!-- 这个是此菜单专用 -->

</head>

<body>
<div class="gridContainer clearfix">
<jsp:include page="navi.jsp"></jsp:include>
	<div class="cd-dropdown-wrapper">
			<a class="cd-dropdown-trigger" href="#0">有事找导航 click me!</a>
			<nav class="cd-dropdown">
				<h5>这里是万能的导航</h5>
				<a href="#0" class="cd-close">Close</a>
				<ul class="cd-dropdown-content">
					<li>
						<form class="cd-search" action="../Product" method="get">
							<input type="search" name="searchLine" placeholder="商品查询..."/>
							<input type="hidden" name="way" value="search"/>
						</form>
					</li>
					<li class="has-children">
						<a href="#">所有商品</a>
<!--下面是二级菜单-->
						<ul class="cd-secondary-dropdown is-hidden">
							<li class="go-back"><a href="#0">菜单</a></li>
							<li class="see-all"><a href="#">所有商品</a></li>
							<!--三级菜单/商品分类-->
							<li class="has-children">
								<a href="#" >冲饮</a>

								<ul class="is-hidden">
									<li class="go-back"><a href="#0">所有商品</a></li>
									<li class="see-all"><a href="../Product?way=search&searchLine=" >查看全部</a></li>
									<li><a href="../Product?way=byCate&secId=1">茶</a>
									<li><a href="../Product?way=byCate&secId=2" >中药饮片</a></li>
									<li><a href="../Product?way=byCate&secId=4" >冲饮粉类</a></li>
									<li><a href="../Product?way=byCate&secId=5" >调味</a></li>
								</ul>
							</li>

							<li class="has-children">
								<a href="#" >直饮</a>

								<ul class="is-hidden">
									<li class="go-back"><a href="#0">所有商品</a></li>
									<li class="see-all"><a href="#">查看全部</a></li>
									<li><a href="../Product?way=byCate&secId=6">加糖</a></li>
									<li><a href="../Product?way=byCate&secId=3">无糖</a></li>
								</ul>
							</li>

							<li class="has-children">
								<a href="#" >水杯&壶</a>

								<ul class="is-hidden">
									<li class="go-back"><a href="#0">所有商品</a></li>
									<li class="see-all"><a href="#">查看全部</a></li>
									<li><a href="../Product?way=byCate&secId=7">水杯</a></li>
									<li><a href="../Product?way=byCate&secId=9">茶壶</a></li>
									<li><a href="../Product?way=byCate&secId=10">其他工具</a></li>
								</ul>
							</li>

							
						</ul> <!-- .cd-secondary-dropdown -->
					</li> <!-- .has-children -->

					<li class="has-children">
						<a href="http://www.htmleaf.com/" >服务</a>
						<ul class="cd-dropdown-icons is-hidden">
							<li class="go-back"><a href="#0">Menu</a></li>
							<li class="see-all"><a href="http://www.htmleaf.com/" >Browse Services</a></li>
							<li>
								<a class="cd-dropdown-item item-1" href="MyCart.jsp" >
									<h4>购物车</h4>
									<p>查看购物车</p>
								</a>
							</li>
							
							<li>
								<a class="cd-dropdown-item item-3" href="showMyOrders.jsp" >
									<h4>订单</h4>
									<p>查看自己的订单</p>
								</a>
							</li>

							<li>
								<a class="cd-dropdown-item item-7" href="UserSetting.jsp" >
									<h4>用户信息管理</h4>
									<p>修改基本用户信息</p>
								</a>
							</li>

							<li>
								<a class="cd-dropdown-item item-12" href="productManagement.jsp" >
									<h4>管理员选项</h4>
									<p>工作人员专用通道</p>
								</a>
							</li>

						</ul> <!-- .cd-dropdown-icons -->
					</li> <!-- .has-children -->

					<li class="cd-divider">其他导航</li>

					<li><a href="#" >运费说明</a></li>
					<li><a href="#" >店铺故事</a></li>
				</ul> <!-- .cd-dropdown-content -->
			</nav> <!-- .cd-dropdown -->
		</div> <!-- .cd-dropdown-wrapper -->



<div id="mainPart">

<img src="../img/teapot.jpg"/>

</div>

<jsp:include page="footer.jsp"/>
</div>



</body>
</html>