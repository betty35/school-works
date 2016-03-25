<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>操作失败</title>
</head>
<body>
<h3>操作失败/或者查询失败，如需返回继续操作，请点击以下链接</h3>
<a href="<%=request.getParameter("returnURL")==null?"#":request.getParameter("returnURL") %>">点我返回</a>
</body>
</html>