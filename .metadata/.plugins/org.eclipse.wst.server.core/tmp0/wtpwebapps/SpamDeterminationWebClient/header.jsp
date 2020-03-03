<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!-- 引入 Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="js/bootstrap.min.js"></script>
<style>
.d1{
	margin-bottom: 5%;
}
</style>
<!-- 增加导航信息 -->
<!--导航栏盒子-->
<div class="d1">
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid allwidth">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">欢迎${u.name }来到大数据垃圾消息识别系统</a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.jsp">网站首页</a></li>
					<li><a href="login.jsp">登录</a></li>
					<li><a href="regist.jsp">注册</a></li>
					<li><a href="bloglist.action">博客列表</a></li>
					
					<li><a onclick="window.history.go(-1)"
						style="cursor: pointer;">返回</a></li>
						
					<c:if test="${u!=null }">
						<li><a href="logout.action">注销</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> 个人中心<b class="caret"></b>
						</a>
							<ul class="dropdown-menu">
								<li><a href="msgcheck.jsp">检查消息</a></li>
								<li class="divider"></li>
								<li><a href="ubloglist.action">原创博客</a></li>
								<li class="divider"></li>
								<li><a href="#">转载博客</a></li>
								<li class="divider"></li>
								<li><a href="#">经典博客</a></li>
								<li class="divider"></li>

							</ul></li>
					</c:if>
				</ul>
				
			</div>
		</div>
	</nav>
</div>