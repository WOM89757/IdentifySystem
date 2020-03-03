<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息界面</title>
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
	}
	h1{
		color: 	blue;
	}
</style>
</head>
<body>
<c:import url="header.jsp"></c:import>
<div style="text-align: center;width: 100%">
<div style="margin: auto; width: 80%;height: 100px"></div>
	<h1>用户${u.name }您好!</h1>
	<div style="margin: auto; width: 50%;">
		
			<table class="table table-hover">
				<tr><td>用户名：</td><td>${u.name }</td></tr>
				<tr><td>密码：</td><td>${u.pass }</td></tr>
				<tr><td>性别：</td><td>${u.sex }</td></tr>
				<tr><td>年龄：</td><td>${u.age }</td></tr>
				<tr><td>生日：</td><td>${u.birthday }</td></tr>
				<tr><td colspan="2" style="text-align: center"><button class="btn btn-primary btn-lg" onclick="javascript:history.back(-1)">返回</button></td></tr>
			</table>
		
	</div>
</div>
</body>
</html>