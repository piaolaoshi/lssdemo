
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
<h2><font size=8>修改教师信息</font></h2>
	<p><font size=6>Modify teacher information.</font></p>
	<div style="margin:20px 0;"></div>
	<form id="modifyStudent" name="modifyStudent" action="${pageContext.request.contextPath }/modifyUser_skip.action" method="post" enctype="multipart/form-data" style="margin:10% 70% 50% 30%;">
	<table class="easyui-datagrid" title="教师信息修改" style="width:790px;height:450px;margin:50% 70% 50% 40%;"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:100,align:'center'">工号</th>
				<th data-options="field:'productid',width:100,align:'center'">姓名</th>
				<th data-options="field:'listprice',width:80,align:'center'">年龄</th>
				<th data-options="field:'unitcost01',width:110,align:'center'">密码</th>
				<th data-options="field:'unitcost02',width:110,align:'center'">负责班级编号</th>
				<th data-options="field:'unitcost03',width:80,align:'center'">权限等级</th>
				<th data-options="field:'unitcost04',width:100,align:'center'"></th>
				<th data-options="field:'unitcost05',width:100,align:'center'"></th>
			</tr>
		</thead>
			<c:forEach var="info" items="${teacher_info}">
				<tr>
					<td>${info.id}</td>
					<td>${info.userName}</td>
					<td>${info.age}</td>
					<td>${info.password}</td>
					<td>${info.classT}</td>
					<td>${info.power}</td>
					<td><a href="${pageContext.request.contextPath }/modifyTeacher_skip.action?id=${info.id}&name=${info.userName}&age=${info.age}&password=${info.password}&classT=${info.classT}&power=${info.power}">查看</td>
					<td><a href="${pageContext.request.contextPath }/deleteById.action?id=${info.id}">删除</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>