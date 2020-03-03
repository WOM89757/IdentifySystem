<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>

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
	/* 	color: blue; */
		text-align: center;
	}
	.ol_box {
	  
	    overflow: visible;
	    box-shadow: 0 0 10px rgba(0,0,0,0.1);
	
	    
	}
	.ol_box div {
    	overflow: visible;
    	
	}


</style>
</head>
<body >
<c:import url="header.jsp"></c:import>
 <div style="width: 100%;">
 <div style="margin: auto; width: 80%;height: 150px"></div>
 	<div id="ec_login" class="ol_box" style="visibility: visible;  top: 19.5px;  z-index: 5000;margin:auto; width: 500px;">
 		<div style="margin: auto; width: 80%;height: 20px"></div>
 		<p class="text-center"><h1>登录</h1></p>
	 	<div style="margin:auto;width:80%">
			
			<form action="login.action" method="post">
				<table class=".table-striped">

					<tr><td>用户名</td><td><input type="text" class="form-control" name="n"  placeholder="请输入用户名"></td></tr>
					<tr><td>密码</td><td><input type="password" class="form-control" name="p"  placeholder="请输入密码"></td></tr>
					<tr><td><input class="btn btn-success" type="submit"  value="登录"></td><td><input class="btn btn-info" type="reset" value="重置" ">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="regist.jsp" >注册新账号</a></td></tr>
				</table>
				<p style="color: red">${mess }</p>
			</form>
		</div>
		
		<div style="margin: auto; width: 80%;height: 20px"></div>
	</div>

 </div>
</body>
</html>