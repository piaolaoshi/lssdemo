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
</head>
<body>
	<h2><font size=8>班级成绩查询</font></h2>
	<p><font size=6>Class performance query.</font></p>
	<div style="margin: 20px 0;"></div>
	<div class="easyui-layout"
		style="width: 1850px; height: 700px; margin: 5% 70% 50% 1%;">
		<div data-options="region:'north'" style="height: 50px">
			<div style="margin: 20px 0"></div>
			<form action="${pageContext.request.contextPath }/selectGrade.action">
			<div>
			<select name="period" class="easyui-combobox" name="state" style="width: 200px;" onchange="show_sub(this.options[this.options.selectedIndex].value)">
				<option value="0">请选择</option>
				<option value="1">第1周</option>
				<option value="2">第2周</option>
				<option value="3">第3周</option>
				<option value="4">第4周</option>
				<option value="5">第5周</option>
				<option value="6">第6周</option>
				<option value="7">第7周</option>
				<option value="8">第8周</option>
				<option value="9">第9周</option>
				<option value="10">第10周</option>
				<option value="11">第11周</option>
				<option value="12">第12周</option>
			</select>
			
			<input type="submit" value="查询" class="easyui-linkbutton" id="save"/>
		</div>
		</form>
		</div>
		<div data-options="region:'south',split:true" style="height: 70px;">
			<h2>专业课程由各个专业自行择定，总成绩为四科总和，排行仅为专业排行</h2>
		</div>
		<div data-options="region:'east',split:true" title="个人成绩"
			style="width: 550px;">
			<div id="chart" style="width: 500px; height: 500px;"></div>
		</div>
		<div data-options="region:'west',split:true" title="West"
			style="width: 550px;">
			<div id="chart_west" style="width: 500px; height: 500px;"></div>
		</div>
		<div data-options="region:'center',title:'成绩查询',iconCls:'icon-ok'">
			<table name="info" class="easyui-datagrid"
				data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
				<thead>
					<tr>
						<th data-options="field:'itemid',align:'center'" width="120">学号</th>
						<th data-options="field:'productid',align:'center'" width="80">姓名</th>
						<th data-options="field:'listprice01',align:'center'" width="80">${course01}</th>
						<th data-options="field:'listprice02',align:'center'" width="80">${course02}</th>
						<th data-options="field:'listprice03',align:'center'" width="80">${course03}</th>
						<th data-options="field:'listprice04',align:'center'" width="80">${course04}</th>
						<th data-options="field:'listprice',align:'center'" width="80">总成绩</th>
						<th data-options="field:'attr1',align:'center'" width="50">排行</th>
						<th data-options="field:'period',align:'center'" width="50">周期数</th>
						<th data-options="field:'attr',align:'center'" width="90"></th>
						<!-- <th data-options="field:'status',align:'center'" width="50">班级排名</th> -->
					</tr>
				</thead>
				<c:forEach var="info" items="${grade}">
					<tr>
						<td>${info.id}</td>
						<td><font size=3>${info.name}</font></td>
						<td>${info.courseOne}</td>
						<td>${info.courseTwo}</td>
						<td>${info.courseThree}</td>
						<td>${info.courseFour}</td>
						<td>${info.courseOne+info.courseTwo+info.courseThree+info.courseFour}</td>
						<td>${info.rankingList}</td>
						<td>${info.period}</td>
						<td><a onclick="showzhi(this)">查看</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
<%-- <h2>${class_total} </h2> --%>
</body>

<script type="text/javascript">
	var class_total = ${class_total};
	var class_grade_total = ${class_grade_total}; 
	var class_avg_grade = ${class_avg_grade};
	// 初始化图表标签
	var Chart_west = echarts.init(document.getElementById('chart_west'));
	/* var class_total=document.getElementsByName("class_total"); */
	/* function show_sub(v) {
		alert(v);
	} */
	function showzhi(obj) {
		var myChart = echarts.init(document.getElementById('chart'));
		var specialty01;
		var specialty02;
		var specialty03;
		var total_score;
		var specialty04;
		var course01 = ${course01};
		var course02 = ${course02};
		var course03 = ${course03};
		var course04 = ${course04};
		var x = $(obj).parent().parent().parent().find("td");
		var length = x.length;
		for (var i = 2; i < length - 1; i++) {
			if (i == 2) {
				var specialty01 = x.eq(i).text();
			} else if (i == 3) {
				var specialty02 = x.eq(i).text();
			} else if (i == 4) {
				var specialty03 = x.eq(i).text();
			} else if (i == 5) {
				var specialty04 = x.eq(i).text();
			} else if (i == 6) {
				var total_score = x.eq(i).text();
			}
		}

		/* var myChart = echarts.init(document.getElementById('chart')); */
		option = {
			/* title : {
				text : '个人成绩分析图'
			}, */
			tooltip : {},
			legend : {
				data : [ '平均成绩（Average Scores）', '个人成绩（Personal Score）' ]
			},
			radar : {
				// shape: 'circle',
				name : {
					textStyle : {
						color : '#fff',
						backgroundColor : '#999',
						borderRadius : 3,
						padding : [ 3, 5 ]
					}
				},
				indicator : [ {
					name : '总成绩',
					max : 400
				}, {
					name : course04,
					max : 100
				}, {
					name : course03,
					max : 100
				}, {
					name : course02,
					max : 100
				}, {
					name : course01,
					max : 100
				} ]
			},
			series : [ {
				name : '平均 vs 个人（Average vs Personal）',
				type : 'radar',
				// areaStyle: {normal: {}},
				data : [
						{
							value : class_avg_grade,
							name : '平均成绩（Average Scores）'
						},
						{
							value : [ total_score,specialty04,specialty03,
									  specialty02,specialty01 ],
							name : '个人成绩（Personal Score）'
						} ]
			} ]

		};
		myChart.setOption(option);
	};

	option_west = {
		tooltip : {
			trigger : 'axis',
			axisPointer : {
				type : 'cross',
				crossStyle : {
					color : '#999'
				}
			}
		},
		toolbox : {
			feature : {
				dataView : {
					show : true,
					readOnly : false
				},
				magicType : {
					show : true,
					type : [ 'line', 'bar' ]
				},
				restore : {
					show : true
				},
				saveAsImage : {
					show : true
				}
			}
		},
		legend : {
			data : [ '班级平均成绩', '年级平均成绩' ]
		},
		xAxis : [ {
			type : 'category',
			data : [ '第1周', '第2周', '第3周', '第4周', '第5周', '第6周', '第7周', '第8周',
					'第9周', '第9周', '第10周', '第11周' ],
			axisPointer : {
				type : 'shadow'
			}
		} ],
		yAxis : [ {
			type : 'value',
			name : '成绩',
			min : 0,
			max : 400,
			interval : 50,
			axisLabel : {
				formatter : '{value} 分'
			}
		}, {
			type : 'value',
			name : '成绩',
			min : 0,
			max : 400,
			interval : 50,
			axisLabel : {
				formatter : '{value} 分'
			}
		} ],
		series : [
				{
					name : '班级平均成绩',
					type : 'bar',
					data : class_total
				},
				{
					name : '年级平均成绩',
					type : 'bar',
					data : class_grade_total
				} ]
	};

	Chart_west.setOption(option_west);
</script>
</html>