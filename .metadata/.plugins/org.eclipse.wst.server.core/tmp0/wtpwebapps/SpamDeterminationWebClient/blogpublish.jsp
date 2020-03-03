<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>写博客</title>
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

.a {
	position: relative;
	margin: 100px 200px;
	width:100%;
}
.a1 {
	position: relative;
	margin: -90px 400px;
	width:50%;
}
.a2 {
	position: relative;
	margin: 100px 400px;
	width:50%;
}
.a3 {
	position: relative;
	margin: -90px 400px;
	width:50%;
}
</style>
</head>
<body >
	<c:import url="header.jsp"></c:import>
	<div style="margin: auto; width: 80%;height: 20px"></div>
	<div class="a">
	<form action="addblogs.action" method="post">
	<div class="a1" >
	当前用户：${u.name }<textarea style="display:none;" name="uid">${u.id }</textarea>
	
	</div>
		<div class="a2">
			<p>
			<h5>标题：</h5>
			< class="form-control" cols=100 name="Title" class="inputtext" placeholder="请输入标题"></textarea>
			</p>

   			<p>
			<h5>概述：</h5>
			<textarea class="form-control" cols=100  name="Schema" class="inputtext"
				placeholder="请输入概述"></textarea>
			</p>
			
			<p>
			<h5>内容：</h5>
			<textarea class="form-control" cols=100 rows=15 name="Content" class="inputtext"
				placeholder="请输入内容"></textarea>
			</p>
		</div>
		<div class="a3">
			
			<input class="btn btn-success btn-lg" type="submit"  value="发表">
		
		</div>
	</div>
	</form>





</body>
</html>