<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
<title>moban</title>  
<script src="http://www.w3school.com.cn/jquery/jquery.js"></script>  
<script type="text/javascript">  
function  showzhi(obj){   
var x = $(obj).parent().parent().parent().find("td");  
var y = x.eq(1).text()  
   alert(y);  
  };  
  
</script>  
</head>  
  
<body>  

<table width="80%" border="1"> 
  <tr>  
    <td>111</td>  
    <td>aaa</td>  
    <td>ddd</td>  
    <td><a onclick="showzhi(this)">保存</a></td>  
  </tr>  
  <tr>  
    <td>222</td>  
    <td>bbb</td>  
    <td>eee</td>  
    <td><a onclick="showzhi(this)">保存</a></td>  
  </tr>  
  <tr>  
    <td>333</td>  
    <td>ccc</td>  
    <td>fff</td>  
    <td><a onclick="showzhi(this)">保存</a></td>  
  </tr>  
</table>  
</body>  
</html> 