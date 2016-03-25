<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="../css/star.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-2.1.1.js"></script>
</head>
<body>
	<form id="123">
	<br><label>what</label><input type="hidden" name="what" value="bbb">
	</form>
	<div id="456"></div>
	<input type="submit" name="line" value="123" id="test">
	
	<button value="567" id="tryIt">尝试</button>
<script type="text/javascript">
$(document).ready(function(){
	$("#test").click(function(){
		var n=$(this).val();
		var q=$("#"+n).serialize(); 
		$.post("../TestServlet",q,function(data){$("#456").html(data);});
		});
	});
	
$(document).ready(function(){
	$("#tryIt").click(function(){
		var n=$(this).val();
		alert("你点了另一个按钮"+n);
	});
	
});
</script>
<br><br><br><br><br><br><br>
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
    	<a href="#5" class="star star_5" title="好"><label for="starScore5">好</label></a>
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

</body>
</html>