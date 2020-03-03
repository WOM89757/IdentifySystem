<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
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
 

	.ol_box {
	   
	    overflow: visible;
	    box-shadow: 0 0 10px rgba(0,0,0,0.3);
	  
	    
	    
	}
	.ol_box div {
    	overflow: visible;
    	 
    	
	}
</style>
</head>
<body >

<c:import url="header.jsp"></c:import>
<div style=" width: 100%;height:700px">
<div style="margin: auto; width: 80%;height: 150px"></div>
	<div id="ec_login" class="ol_box" style="visibility: visible;  top: 40px;  z-index: 5000;margin:auto; width: 500px;">
		<div style="margin: auto; width: 80%;height: 20px"></div>
		<div align="center">
		<h1 ><strong>welcome into OA system</strong></h1>
		<a href="login.jsp"  class="btn btn-primary btn-lg " role="button">登录</a>&nbsp;&nbsp;
		<a href="userlist.action" class="btn btn-info btn-lg" style="display:none;">进入用户列表</a>&nbsp;&nbsp;
		<a href="bloglist.action"  class="btn btn-info btn-lg" role="button">进入博客列表</a>&nbsp;&nbsp;
		<a href="regist.jsp" class="btn btn-info btn-lg" role="button">进入用户注册</a>&nbsp;&nbsp;
		</div>

		<div style="margin: auto; width: 80%;height: 25px"></div>
	</div>
</div>

	<c:import url="footer.jsp"/>


</body>
</html>