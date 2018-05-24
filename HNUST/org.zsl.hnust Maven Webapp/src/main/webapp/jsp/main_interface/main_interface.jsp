<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>layout 后台大布局 - Layui</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/layui-v2.2.5/layui/css/layui.css">
  <script type="text/javascript" src="${pageContext.request.contextPath }/resources/layui-v2.2.5/layui/layui.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo"><font size=5>作业批改系统</font></div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
    <c:if test="${user.power==1}">
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath }/selectGradeByPersonal.action?period=0"><font size=6>个人成绩查询</font></a></li>
    </c:if>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath }/selectGrade.action?period=0">班级成绩查询</a></li>
      <!-- <li class="layui-nav-item"><a href="">用户</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li> -->
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          ${user.userName}
        </a>
        <dl class="layui-nav-child">
          <dd><a href="${pageContext.request.contextPath }/selectUserInformation.action">基本资料</a></dd>
          <!-- <dd><a href="">安全设置</a></dd> -->
        </dl>
      </li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/exit.action">退出登录</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">文件上传下载</a>
          <dl class="layui-nav-child">
            <dd><a href="${pageContext.request.contextPath }/fileUpload.action">作业上传</a></dd>
            <dd><a href="${pageContext.request.contextPath }/listFile.action">作业下载</a></dd>
            <c:if test="${user.power>=2}">
            <dd><a href="${pageContext.request.contextPath }/uploadExcel.action">成绩导入</a></dd>
            </c:if>
            <!-- <dd><a href="">超链接</a></dd> -->
          </dl>
        </li>
        <c:if test="${user.power>=2}">
        <li class="layui-nav-item">
          <a href="javascript:;">学生信息改动</a>
          <dl class="layui-nav-child">
            <dd><a href="${pageContext.request.contextPath }/addUser.action">新增学生</a></dd>
            <dd><a href="${pageContext.request.contextPath }/selectStudentByClasst.action">修改学生信息</a></dd>
          </dl>
        </li>
        </c:if>
        <c:if test="${user.power>=2}">
        <li class="layui-nav-item">
          <a href="javascript:;">教师信息改动</a>
          <dl class="layui-nav-child">
            <dd><a href="${pageContext.request.contextPath }/addTeacher.action">新增教师</a></dd>
            <dd><a href="${pageContext.request.contextPath }/selectTeacher.action">修改教师信息</a></dd>
          </dl>
        </li>
        </c:if>
       <%--  <li class="layui-nav-item"><a href="${pageContext.request.contextPath }/fileUpload.action">作业上传</a></li>
        <li class="layui-nav-item"><a href="">发布商品</a></li> --%>
      </ul>
    </div>
  </div>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div id="main_content" style="padding: 15px;">
				<c:if test="${result.equals('class_grade')}">
					<c:import url="../class_performance.jsp"></c:import>
				</c:if>
				<c:if test="${result.equals('fileUpload')}">
					<c:import url="../files/files_upload.jsp"></c:import>
				</c:if>
				<c:if test="${result.equals('upload_excel')}">
					<c:import url="../files/excel_upload.jsp"></c:import>
				</c:if>
				<c:if test="${result.equals('listFile')}">
					<c:import url="../files/down_file.jsp"></c:import>
				</c:if>
				<c:if test="${result.equals('insertUser')||result.equals('modifyUser')||result.equals('insertTeacher')||result.equals('modifyTeacher')}">
					<c:import url="../user/information.jsp"></c:import>
				</c:if>
				<c:if test="${result.equals('student_info')}">
					<c:import url="../user/student_info.jsp"></c:import>
				</c:if>
				<c:if test="${result.equals('teacher_info')}">
					<c:import url="../user/teacher_info.jsp"></c:import>
				</c:if>
				<c:if test="${result.equals('selectTeacher')||result.equals('selectStudent')}">
					<c:import url="../user/information_bak.jsp"></c:import>
				</c:if>
			</div>
		</div>

		<div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>
<script src="../src/layui.js"></script>
<script type="text/javascript">
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});


</script>
</body>
</html>