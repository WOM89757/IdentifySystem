<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表页面</title>
<style type="text/css">
	 body {
		 background: url("1.1.jpg");
		 background-repeat: norepeat;
		 background-attachment: fixed;
		 background-repeat: no-repeat;
		 background-size: cover;
		 -moz-background-size: cover;
		 -webkit-background-size: cover;
	}
	table{
		border-collapse: collapse;
		width: 100%;
	}
	table tr td{
		padding: 10px 20px;


	
</style>
</head>
<body >
<c:import url="header.jsp"></c:import>
<div style="width:100%" >
	<div style="margin: auto;width: 80%">
	<h1 >用户列表</h1>
	<table class="table table-hover" >
		<tr><th>用户名</th><th>密码</th><th>性別</th><th>年龄</th><th>电话</th><th>操作</th></tr>
		<c:forEach items="${list }" var="user">
			<tr><td>${user.name }</td><td>${user.pass }</td><td>${user.sex }</td><td>${user.age }</td><td>${user.tel }</td><td><a href="delete.action?id=${user.id }" >删除</a></td></tr>
		</c:forEach>
	</table>
	</div>
</div>	
</body>
</html>