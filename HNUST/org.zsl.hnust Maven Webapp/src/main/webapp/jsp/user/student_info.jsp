
<%@page import="java.util.ArrayList"%>
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
	  <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/layui-v2.2.5/layui/css/layui.css">
  <script type="text/javascript" src="${pageContext.request.contextPath }/resources/layui-v2.2.5/layui/layui.js"></script>
</head>
<body>
<h2><font size=8>修改学生信息</font></h2>
	<p><font size=6>Modify student information.</font></p>
	<div style="margin:20px 0;"></div>
	<form id="modifyStudent" name="modifyStudent" action="${pageContext.request.contextPath }/modifyUser_skip.action" method="post" enctype="multipart/form-data" style="margin:10% 70% 50% 30%;">
	<table class="easyui-datagrid" title="Basic DataGrid" style="width:650px;height:450px;margin:50% 70% 50% 40%;"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:140,align:'center'">学号</th>
				<th data-options="field:'productid',width:100,align:'center'">姓名</th>
				<th data-options="field:'listprice',width:80,align:'center'">年龄</th>
				<th data-options="field:'unitcost01',width:100,align:'center'">密码</th>
				<th data-options="field:'unitcost02',width:100,align:'center'"></th>
				<th data-options="field:'unitcost03',width:120,align:'center'"></th>
			</tr>
		</thead>
			<c:forEach var="info" items="${student_info}">
				<tr>
					<td name="id">${info.id}</td>
					<td name="name">${info.userName}</td>
					<td name="age">${info.age}</td>
					<td name="password">${info.password}</td>
					<td><a href="${pageContext.request.contextPath }/modifyUser_skip.action?id=${info.id}&name=${info.userName}&age=${info.age}&password=${info.password}">修改</td>
					<td><a href="${pageContext.request.contextPath }/deleteById.action?id=${info.id}">删除</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>