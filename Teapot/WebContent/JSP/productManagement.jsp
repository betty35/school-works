<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="../css/tabPage.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-2.1.1.js"></script>
<script src="../js/tabPage.js"></script>
<title>商品管理</title>

</head>

<!--  script....ajax联动下拉菜单-->
 <script language="JavaScript" > 
 function test() {
		var obj1=document.getElementById("fc");
		var index = obj1.selectedIndex;
  var id = obj1.options[index].value;
  req = new ActiveXObject("Microsoft.XMLHTTP"); 
  //设置属性，当后台处理完成后，回来调用myDeal方法。 
  req.onreadystatechange = myDeal; 
  //发出请求 
  req.open("GET", "../secondC?id=" + id, "false"); 
  req.send(null); 
} 
function myDeal() { 
  if (req.readyState == 4) { 
          //接收服务端返回的数据 
          var ret = req.responseText; 
          //处理数据 
          var obj = document.getElementById("sc"); 
          for (var i = obj.options.length - 1; i >= 0; i--) { 
                  obj.options.remove(i); //从后往前删除 
          } 
          
          var ops = ret.split("|"); 
          for (var i = 0; i < ops.length; i++) { 
                  var op = ops[i]; 
                  var ss = op.split(","); 
                  var oOption = document.createElement("OPTION"); //创建一个OPTION节点 
                  oOption.innerText = ss[1];    //设置选择展示的信息 
                  oOption.value = ss[0];         //设置选项的值 
                  obj.options.add(oOption);    //将节点加入sc选项中     
          } 
          
  } 
} 


function findproduct() {
	var obj1=document.getElementById("sc");
	var index = obj1.selectedIndex;
 var id = obj1.options[index].value;
 req = new ActiveXObject("Microsoft.XMLHTTP"); 
 //设置属性，当后台处理完成后，回来调用myDeal方法。 
 req.onreadystatechange = showIt; 
 //发出请求 
 req.open("GET", "../Product?secId="+ id +"&way=byCategory&how=ajaxP", "false"); 
 req.send(null); 
} 

        
    function showIt() { 
            if (req.readyState == 4) {  
                    var ret = req.responseText; //接收服务端返回的数据 
                    var obj = document.getElementById("showIt"); 
                    obj.innerHTML=ret;} 
    }     
        
        function getSecondId(){
        	var obj=document.getElementById("scId");
        	var obj1=document.getElementById("sc");
    		var index = obj1.selectedIndex;
            var id = obj1.options[index].value;
            obj.value=id;
        }
</script> 


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
	<div>
	<ul class="list-inline">
  		<li><a href="myShop.jsp">首页</a></li>
  		<li><a href="productManagement.jsp">商品种类管理</a></li>
  		<li><a href="productManagement2.jsp">品种与库存</a></li>
  		<li><a href="orderManagement.jsp">订单管理</a></li>
	</ul>
	</div>
	
	<h3 class="text-info text-center">商品种类管理</h3>
	
	<div class="tab1 text-center" id="tab1">
	<div class="menu">
		<ul>
			<li id="one1" onclick="setTab('one',1)">管理商品分类</li>
			<li id="one2" onclick="setTab('one',2)">该分类商品清单</li>
			<li id="one3" onclick="setTab('one',3)">添加该分类商品</li>
			<li id="one4" onclick="setTab('one',4)">为商品添加种类</li>
		</ul>
	</div>
	
	<div class="menudiv">
	<div id="con_one_1">
		<div class="text-center">
		<p class="text-info">查看第一级商品分类：</p>
			<select  id="fc" name="fc" onChange="test();">
				<option value="0">请选择</option>
				<option value="1">冲饮</option>
				<option value="2">直饮</option>
				<option value="3">杯子/壶</option>
				</select>
		<p class="text-info">查看第二级商品分类:</p>
			<select id="sc" name="sc" onChange="findproduct()"></select>
	</div>
	</div>
	<div id="con_one_2" style="display:none;">
		<div id="showIt"></div>
	</div>
	<div id="con_one_3" style="display:none;">
		<form action="../ProductChange" method="Post" name="productForm" class="form-horizontal">
		<label class="text-info">&nbsp;&nbsp;商品名:</label><input type="text" name="productName"></input>
		<br><label class="text-info">商品简介：</label><input type="text" name="detail"></input>
		<input type="hidden" name="secondCategoryId" id="scId"></input>
		<input type="hidden" name="method" value="NP"></input>
		<br><input type="submit" onClick="getSecondId();" value="提交新商品"></input>
		</form>
	</div>
	
	<div id="con_one_4" style="display:none;">
		<form action="../ProductChange" method="post" name="specForm">
		<label class="text-info">商品表ID：</label><input type="text" name="productId"/>
		<br><label class="text-info">种类名称：</label><input type="text" name="specName"/>
		<br><label class="text-info">价格&nbsp;&nbsp;&nbsp;&nbsp;：</label><input type="text" name="price"/>
		<br><label class="text-info">厂商&nbsp;&nbsp;&nbsp;&nbsp;：</label><input type="text" name="brand"/>
		<br><label class="text-info">图片选择：</label><input type="file" name="imagePath"/>
		<br><label class="text-info">初次库存：</label><input type="text" name="stock"/>
		<input type="hidden" name="method" value="NS"/>
		<br><input type="submit" value="&nbsp;&nbsp;提&nbsp;&nbsp;交&nbsp;&nbsp;"><input type="reset" value="&nbsp;&nbsp;重&nbsp;&nbsp;置&nbsp;&nbsp;">
		</form>
	</div>
	
	</div>
</div>
	
	
</body>
</html>