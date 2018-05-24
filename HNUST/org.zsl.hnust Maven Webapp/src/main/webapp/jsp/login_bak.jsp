<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta name="referrer" content="never">
	<meta charset="UTF-8">
	<title>Basic Layout - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/demo.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/jquery.easyui.min.js"></script>
</head>
<body>
	<h2><font size=8>作业批改系统</font></h2>
	<p><font size=6>登陆页面</font></p>
	<div style="margin:20px 0;"></div>
	<div id="win" class="easyui-window" title="Login"
		style="width: 400px; height: 300px;">
		<form name="login"  action="${pageContext.request.contextPath }/checkUser.action" method="post" style="padding: 10px 30px 10px 40px;">
		<div style="margin-bottom:10px">
			<input name="id" class="easyui-textbox" style="width:100%;height:40px;padding:12px" data-options="prompt:'Username',iconCls:'icon-man',iconWidth:38">
		</div>
		<div style="margin-bottom:20px">
			<input name="password" class="easyui-textbox" type="password" style="width:100%;height:40px;padding:12px" data-options="prompt:'Password',iconCls:'icon-lock',iconWidth:38">
		</div>
		<div style="margin-bottom:20px">
			<input type="checkbox" checked="checked">
			<span>Remember me</span>
		</div>
		<div>
			<a onclick="login.submit()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" style="padding:5px 0px;width:100%;">
				<span onclick="login.submit()" style="font-size:14px;">Login</span>
			</a>
		</div>
		</form>
	</div>
	<script type="text/javascript">
<c:if test="${ret==2}">
        	alert("用户名或密码错误！");
      </c:if> 
</script>
</body>
</html>