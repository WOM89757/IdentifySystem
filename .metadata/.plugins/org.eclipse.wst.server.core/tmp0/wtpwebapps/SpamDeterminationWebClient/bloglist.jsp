<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>博客列表页面</title>
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
table {
	border-collapse: collapse;
	width: 100%;
}

table tr td {
	padding: 10px 20px;
}
</style>

</head>
<body>
	<c:import url="header.jsp"></c:import>
	<div style="width: 100%">
		<div style="margin: auto; width: 80%">
			<nobr>
				<h1>博客列表</h1>
				<button type="button" class="btn btn-primary btn-lg"
					onclick="window.location.href='blogpublish.jsp'">写博客</button>
			</nobr>
			<table class="table table-hover">
				<tr>
					<th>博客类型</th>
					<th>用户ID</th>
					<th>标题</th>
					<th>点击量</th>
					<th>发表日期</th>
				<c:if test="${u.id==1 }">	<th>操作</th> </c:if>
				</tr>
				<c:forEach items="${bloglist }" var="blog">
					<tr
						onclick="javascript:window.location.href='bloginfo.action?bkid=${blog.id}'">
						<td>${blog.kid}</td>
						<td>${blog.uid }</td>
						<td>${blog.title }</td>
						<td>${blog.clicks }</td>
						<td>${blog.datatime }</td>
					<c:if test="${u.id==1 }">	<td><a href="blogdelete.action?bkid=${blog.id }">删除</a></td> </c:if>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>