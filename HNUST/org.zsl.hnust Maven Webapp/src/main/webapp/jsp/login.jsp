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
<body class="index">
	<div id="win" class="easyui-window" title="Login"
		style="width: 300px; height: 180px;">
		<form name="login"  action="${pageContext.request.contextPath }/checkUser.action" method="post" style="padding: 10px 20px 10px 40px;">
			<p>
				Name: <input name="id" type="text">
			</p>
			<p>
				Pass: <input name="password" type="password">
			</p>
			<div style="padding: 5px; text-align: center;">
				<input type="submit" value="Ok" class="easyui-linkbutton" id="save" icon="icon-ok"/>
				<a onclick="login.submit()" class="easyui-linkbutton" icon="icon-ok">Ok</a> <a
					href="#" class="easyui-linkbutton" icon="icon-cancel">Cancel</a>
			</div>
		</form>
	</div>
</body>
</html>