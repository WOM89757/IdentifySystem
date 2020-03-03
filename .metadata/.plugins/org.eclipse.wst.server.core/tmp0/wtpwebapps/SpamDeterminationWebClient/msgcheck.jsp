<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>大数据消息-识别页面</title>
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
.dd1{
	width: 100%;
	min-height: 400px;
	height:700px;
}
.dd2{
	width: 600px;
	margin: 0 auto;
}
</style>
</head>
<body>
	<c:import url="header.jsp"/>
	<div style="margin: auto; width: 80%;height: 100px"></div>
	<div class="dd1">
		<div class="dd2">
			<form method="post" action="check">
				<p><h1>请输入要检查的消息：</h1><textarea class="form-control" rows=5 type="text" name="msg"></textarea></p>
				<p><input class="btn btn-success btn-lg" type="submit" value="检查"></p>
			</form>
		</div>
	</div>
	<c:import url="footer.jsp"/>
</body>
</html>