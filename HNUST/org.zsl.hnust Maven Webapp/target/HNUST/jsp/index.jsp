<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/echarts.js"></script>
</head>
<body>
<h2>Hello World!</h2>
${user.id}
${user.userName}
<img  src="${pageContext.request.contextPath }/file/${fileUrl}" />
<div id="chart" style="width:400px;height:400px;"></div>
</body>
<script type="text/javascript">
// 初始化图表标签
var myChart = echarts.init(document.getElementById('chart'));
option = {
	    title: {
	        text: '个人成绩分析图'
	    },
	    tooltip: {},
	    legend: {
	        data: ['平均成绩（Average Scores）', '个人成绩（Personal Score）']
	    },
	    radar: {
	        // shape: 'circle',
	        name: {
	            textStyle: {
	                color: '#fff',
	                backgroundColor: '#999',
	                borderRadius: 3,
	                padding: [3, 5]
	           }
	        },
	        indicator: [
	           { name: '总成绩（Total Score）', max: 300},
	           { name: '排行（Ranking List）', max: 100},
	           { name: '专业课三（Specialized Course 03）', max: 100},
	           { name: '专业课二（Specialized Course 02）', max: 100},
	           { name: '专业课一（Specialized Course 01）', max: 100}
	        ]
	    },
	    series: [{
	        name: '平均 vs 个人（Average vs Personal）',
	        type: 'radar',
	        // areaStyle: {normal: {}},
	        data : [
	            {
	                value : [150, 50, 60, 75, 65],
	                name : '平均成绩（Average Scores）'
	            },
	             {
	                value : [200, 60, 70, 64, 80],
	                name : '个人成绩（Personal Score）'
	            }
	        ]
	    }]
	};
myChart.setOption(option);
</script>
</html>
