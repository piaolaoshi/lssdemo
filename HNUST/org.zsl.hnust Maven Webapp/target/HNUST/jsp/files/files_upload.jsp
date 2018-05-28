<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>Basic Layout - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/demo.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/jquery-easyui-1.5/jquery.easyui.min.js"></script>
</head>
<body>
	<h2><font size=8>作业上传</font></h2>
	<p><font size=6>Homework uploading.</font></p>
	<div style="margin:20px 0;"></div>
	<form id="upload" name="upload" action="${pageContext.request.contextPath }/upload.action" method="post" enctype="multipart/form-data" style="margin:10% 70% 50% 30%;">
	<div class="easyui-panel" title="上传文件" style="width:600px;padding:30px 70px 50px 70px">
		<div style="margin-bottom:20px">
			<div><font size=8>Name:</font></div>
			<input name="id" class="easyui-textbox" style="width:100%;height:100px">
		</div>
		<div style="margin-bottom:20px">
			<div><font size=8>File1:</font></div>
			<!-- <input class="easyui-filebox" name="photo" data-options="prompt:'Choose a file...'" style="width:100%;height:100px"> -->
			<input class="easyui-filebox" name="photo"  style="width:100%;height:100px">
		</div>
		
		<div>
			<%-- <a href="${pageContext.request.contextPath }/upload.action"  class="easyui-linkbutton" style="width:100%" >Upload</a> --%>
			<font size=8><input type="submit" value="Upload" class="easyui-linkbutton" id="save"/></font>
		</div>
	</div>
	</form>
	
	<script type="text/javascript">
<c:if test="${ret==1}">
        	alert("添加成功！");
      </c:if> 
</script>
      
</body>

</html>