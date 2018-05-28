<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/layui-v2.2.5/layui/css/layui.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/layui-v2.2.5/layui/layui.js"></script> --%>
</head>
<body>

        <%--  <c:url value="/downFile" var="downurl">  
            <c:param name="filename" value="新建文本文档 (5).txt"></c:param>  
        </c:url>  
		<a href="${downurl}">下载</a>  
        <br/> --%>
        <div style="margin:10% 70% 50% 30%;width:100%;">
        
		<c:forEach var="me" items="${fileNameMap}">  
        <c:url value="/downFile" var="downurl">  
            <c:param name="filename" value="${me}"></c:param>  
        </c:url>  
        
        <font size=6>${me}</font><a href="${downurl}">&nbsp&nbsp下载</a>  
        
        <br/>
        
    </c:forEach> 
    </div>
<script type="text/javascript">
<c:if test="${result==1}">
        	alert("添加成功！");
      </c:if> 
</script>
</body>
</html>