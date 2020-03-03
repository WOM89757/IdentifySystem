<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>大数据消息识别-结果页面</title>
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
.dd1 {
	width: 100%;
	min-height: 400px;
	height:700px;
}
.dd2 {
	width: 600px;
	margin: 0 auto;
	font-size: 14px;
}
.s1{
	color: red;
}
.s2{
	color: green;
}
</style>
</head>
<body>
	<c:import url="header.jsp" />

	<div class="dd1">
		<div class="dd2">
			<p>
				<h1>您的消息：</h1>
				<h2>${msg}</h2>
			
			<p class="lead" >
				<h1>是一条 :


				<c:if test="${!flag}">
					<h2 class="s2">${result}✔</h2>
				</c:if>
				<c:if test="${flag}">
					<h2 class="s1">${result}✖</h2>
				</c:if>
				</h1> 
			</p>
		</div>
	</div>
	<c:import url="footer.jsp"/>
</body>
</html>