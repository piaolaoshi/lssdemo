<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basic Layout - jQuery EasyUI Demo</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/demo.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/echarts.js"></script>
</head>
<body>
	<h2></h2>
	<p></p>
	<div style="margin: 20px 0;"></div>
	<div style="margin:10% 70% 50% 40%;">
	<div class="easyui-panel" title="信息类" style="width:500px;padding:30px 60px;">
	<c:if test="${result.equals('insertUser')}">
					<form name="add"  action="${pageContext.request.contextPath }/insertUser.action" method="post" style="padding: 10px 20px 10px 40px;">
	</c:if>
	<c:if test="${result.equals('modifyUser')}">
					<form name="add"  action="${pageContext.request.contextPath }/modifyUser.action" method="post" style="padding: 10px 20px 10px 40px;">
	</c:if>
	<c:if test="${result.equals('insertTeacher')}">
					<form name="add"  action="${pageContext.request.contextPath }/insertTeacher.action" method="post" style="padding: 10px 20px 10px 40px;">
	</c:if>
	<c:if test="${result.equals('selectTeacher')}">
					<form name="add"  action="${pageContext.request.contextPath }/modifyTeacher.action" method="post" style="padding: 10px 20px 10px 40px;">
	</c:if>
		<div style="margin-bottom:20px">
			<div><font size=6>学号:</font></div>
			<input name="id" class="easyui-textbox"  style="width:100%;height:32px" value="${user_modify.id}">
		</div>
		<div style="margin-bottom:20px">
			<font size=6><div>姓名:</div></font>
			<input name="name" class="easyui-textbox" style="width:100%;height:32px" value="${user_modify.userName}">
		</div>
		<div style="margin-bottom:20px">
			<font size=6><div>密码:</div></font>
			<input name="password" class="easyui-textbox" style="width:100%;height:32px" value="${user_modify.password}">
		</div>
		<div style="margin-bottom:20px">
			<font size=6><div>年龄:</div></font>
			<input name="age" class="easyui-textbox" style="width:100%;height:32px" value="${user_modify.age}">
		</div>
		
		<c:if test="${result.equals('selectTeacher')||result.equals('modifyTeacher')}">
					<div style="margin-bottom:20px">
			<font size=6><div>管理班级编码:</div></font>
			<input name="classT" class="easyui-textbox" style="width:100%;height:32px" value="${user_modify.classT}">
			
			<font size=6><div>权限等级:</div></font>
			<input name="classT" class="easyui-textbox"  style="width:100%;height:32px;" value="${user_modify.power}">
		</div>
		</c:if>
		
		</form>
	</div>
	</div>
		<script type="text/javascript">
<c:if test="${ret==1}">
        	alert("添加成功！");
      </c:if> 
</script>
</body>
</html>