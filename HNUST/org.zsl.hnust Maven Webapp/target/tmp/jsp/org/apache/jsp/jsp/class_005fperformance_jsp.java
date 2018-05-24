package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class class_005fperformance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Basic Layout - jQuery EasyUI Demo</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-easyui-1.5/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-easyui-1.5/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-easyui-1.5/demo.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-easyui-1.5/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-easyui-1.5/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/echarts.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2><font size=8>班级成绩查询</font></h2>\r\n");
      out.write("\t<p><font size=6>Class performance query.</font></p>\r\n");
      out.write("\t<div style=\"margin: 20px 0;\"></div>\r\n");
      out.write("\t<div class=\"easyui-layout\"\r\n");
      out.write("\t\tstyle=\"width: 1850px; height: 700px; margin: 5% 70% 50% 1%;\">\r\n");
      out.write("\t\t<div data-options=\"region:'north'\" style=\"height: 50px\">\r\n");
      out.write("\t\t\t<div style=\"margin: 20px 0\"></div>\r\n");
      out.write("\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/selectGrade.action\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t<select name=\"period\" class=\"easyui-combobox\" name=\"state\" style=\"width: 200px;\" onchange=\"show_sub(this.options[this.options.selectedIndex].value)\">\r\n");
      out.write("\t\t\t\t<option value=\"0\">请选择</option>\r\n");
      out.write("\t\t\t\t<option value=\"1\">第1周</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">第2周</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">第3周</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">第4周</option>\r\n");
      out.write("\t\t\t\t<option value=\"5\">第5周</option>\r\n");
      out.write("\t\t\t\t<option value=\"6\">第6周</option>\r\n");
      out.write("\t\t\t\t<option value=\"7\">第7周</option>\r\n");
      out.write("\t\t\t\t<option value=\"8\">第8周</option>\r\n");
      out.write("\t\t\t\t<option value=\"9\">第9周</option>\r\n");
      out.write("\t\t\t\t<option value=\"10\">第10周</option>\r\n");
      out.write("\t\t\t\t<option value=\"11\">第11周</option>\r\n");
      out.write("\t\t\t\t<option value=\"12\">第12周</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"查询\" class=\"easyui-linkbutton\" id=\"save\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'south',split:true\" style=\"height: 70px;\">\r\n");
      out.write("\t\t\t<h2>专业课程由各个专业自行择定，总成绩为四科总和，排行仅为专业排行</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'east',split:true\" title=\"个人成绩\"\r\n");
      out.write("\t\t\tstyle=\"width: 550px;\">\r\n");
      out.write("\t\t\t<div id=\"chart\" style=\"width: 500px; height: 500px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'west',split:true\" title=\"West\"\r\n");
      out.write("\t\t\tstyle=\"width: 550px;\">\r\n");
      out.write("\t\t\t<div id=\"chart_west\" style=\"width: 500px; height: 500px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'center',title:'成绩查询',iconCls:'icon-ok'\">\r\n");
      out.write("\t\t\t<table name=\"info\" class=\"easyui-datagrid\"\r\n");
      out.write("\t\t\t\tdata-options=\"url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'itemid',align:'center'\" width=\"120\">学号</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'productid',align:'center'\" width=\"80\">姓名</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'listprice01',align:'center'\" width=\"80\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course01}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'listprice02',align:'center'\" width=\"80\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course02}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'listprice03',align:'center'\" width=\"80\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course03}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'listprice04',align:'center'\" width=\"80\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course04}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'listprice',align:'center'\" width=\"80\">总成绩</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'attr1',align:'center'\" width=\"50\">排行</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'period',align:'center'\" width=\"50\">周期数</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'attr',align:'center'\" width=\"90\"></th>\r\n");
      out.write("\t\t\t\t\t\t<!-- <th data-options=\"field:'status',align:'center'\" width=\"50\">班级排名</th> -->\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar class_total = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${class_total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\tvar class_grade_total = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${class_grade_total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("; \r\n");
      out.write("\tvar class_avg_grade = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${class_avg_grade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t// 初始化图表标签\r\n");
      out.write("\tvar Chart_west = echarts.init(document.getElementById('chart_west'));\r\n");
      out.write("\t/* var class_total=document.getElementsByName(\"class_total\"); */\r\n");
      out.write("\t/* function show_sub(v) {\r\n");
      out.write("\t\talert(v);\r\n");
      out.write("\t} */\r\n");
      out.write("\tfunction showzhi(obj) {\r\n");
      out.write("\t\tvar myChart = echarts.init(document.getElementById('chart'));\r\n");
      out.write("\t\tvar specialty01;\r\n");
      out.write("\t\tvar specialty02;\r\n");
      out.write("\t\tvar specialty03;\r\n");
      out.write("\t\tvar total_score;\r\n");
      out.write("\t\tvar specialty04;\r\n");
      out.write("\t\tvar course01 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course01}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\tvar course02 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course02}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\tvar course03 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course03}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\tvar course04 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course04}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\tvar x = $(obj).parent().parent().parent().find(\"td\");\r\n");
      out.write("\t\tvar length = x.length;\r\n");
      out.write("\t\tfor (var i = 2; i < length - 1; i++) {\r\n");
      out.write("\t\t\tif (i == 2) {\r\n");
      out.write("\t\t\t\tvar specialty01 = x.eq(i).text();\r\n");
      out.write("\t\t\t} else if (i == 3) {\r\n");
      out.write("\t\t\t\tvar specialty02 = x.eq(i).text();\r\n");
      out.write("\t\t\t} else if (i == 4) {\r\n");
      out.write("\t\t\t\tvar specialty03 = x.eq(i).text();\r\n");
      out.write("\t\t\t} else if (i == 5) {\r\n");
      out.write("\t\t\t\tvar specialty04 = x.eq(i).text();\r\n");
      out.write("\t\t\t} else if (i == 6) {\r\n");
      out.write("\t\t\t\tvar total_score = x.eq(i).text();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/* var myChart = echarts.init(document.getElementById('chart')); */\r\n");
      out.write("\t\toption = {\r\n");
      out.write("\t\t\t/* title : {\r\n");
      out.write("\t\t\t\ttext : '个人成绩分析图'\r\n");
      out.write("\t\t\t}, */\r\n");
      out.write("\t\t\ttooltip : {},\r\n");
      out.write("\t\t\tlegend : {\r\n");
      out.write("\t\t\t\tdata : [ '平均成绩（Average Scores）', '个人成绩（Personal Score）' ]\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tradar : {\r\n");
      out.write("\t\t\t\t// shape: 'circle',\r\n");
      out.write("\t\t\t\tname : {\r\n");
      out.write("\t\t\t\t\ttextStyle : {\r\n");
      out.write("\t\t\t\t\t\tcolor : '#fff',\r\n");
      out.write("\t\t\t\t\t\tbackgroundColor : '#999',\r\n");
      out.write("\t\t\t\t\t\tborderRadius : 3,\r\n");
      out.write("\t\t\t\t\t\tpadding : [ 3, 5 ]\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tindicator : [ {\r\n");
      out.write("\t\t\t\t\tname : '总成绩',\r\n");
      out.write("\t\t\t\t\tmax : 400\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : course04,\r\n");
      out.write("\t\t\t\t\tmax : 100\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : course03,\r\n");
      out.write("\t\t\t\t\tmax : 100\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : course02,\r\n");
      out.write("\t\t\t\t\tmax : 100\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : course01,\r\n");
      out.write("\t\t\t\t\tmax : 100\r\n");
      out.write("\t\t\t\t} ]\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\tname : '平均 vs 个人（Average vs Personal）',\r\n");
      out.write("\t\t\t\ttype : 'radar',\r\n");
      out.write("\t\t\t\t// areaStyle: {normal: {}},\r\n");
      out.write("\t\t\t\tdata : [\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tvalue : class_avg_grade,\r\n");
      out.write("\t\t\t\t\t\t\tname : '平均成绩（Average Scores）'\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tvalue : [ total_score,specialty04,specialty03,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  specialty02,specialty01 ],\r\n");
      out.write("\t\t\t\t\t\t\tname : '个人成绩（Personal Score）'\r\n");
      out.write("\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tmyChart.setOption(option);\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\toption_west = {\r\n");
      out.write("\t\ttooltip : {\r\n");
      out.write("\t\t\ttrigger : 'axis',\r\n");
      out.write("\t\t\taxisPointer : {\r\n");
      out.write("\t\t\t\ttype : 'cross',\r\n");
      out.write("\t\t\t\tcrossStyle : {\r\n");
      out.write("\t\t\t\t\tcolor : '#999'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\ttoolbox : {\r\n");
      out.write("\t\t\tfeature : {\r\n");
      out.write("\t\t\t\tdataView : {\r\n");
      out.write("\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\treadOnly : false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tmagicType : {\r\n");
      out.write("\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\ttype : [ 'line', 'bar' ]\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\trestore : {\r\n");
      out.write("\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsaveAsImage : {\r\n");
      out.write("\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tlegend : {\r\n");
      out.write("\t\t\tdata : [ '班级平均成绩', '年级平均成绩' ]\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\txAxis : [ {\r\n");
      out.write("\t\t\ttype : 'category',\r\n");
      out.write("\t\t\tdata : [ '第1周', '第2周', '第3周', '第4周', '第5周', '第6周', '第7周', '第8周',\r\n");
      out.write("\t\t\t\t\t'第9周', '第9周', '第10周', '第11周' ],\r\n");
      out.write("\t\t\taxisPointer : {\r\n");
      out.write("\t\t\t\ttype : 'shadow'\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} ],\r\n");
      out.write("\t\tyAxis : [ {\r\n");
      out.write("\t\t\ttype : 'value',\r\n");
      out.write("\t\t\tname : '成绩',\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 400,\r\n");
      out.write("\t\t\tinterval : 50,\r\n");
      out.write("\t\t\taxisLabel : {\r\n");
      out.write("\t\t\t\tformatter : '{value} 分'\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\ttype : 'value',\r\n");
      out.write("\t\t\tname : '成绩',\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 400,\r\n");
      out.write("\t\t\tinterval : 50,\r\n");
      out.write("\t\t\taxisLabel : {\r\n");
      out.write("\t\t\t\tformatter : '{value} 分'\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} ],\r\n");
      out.write("\t\tseries : [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tname : '班级平均成绩',\r\n");
      out.write("\t\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\t\tdata : class_total\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tname : '年级平均成绩',\r\n");
      out.write("\t\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\t\tdata : class_grade_total\r\n");
      out.write("\t\t\t\t} ]\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\tChart_west.setOption(option_west);\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("info");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${grade}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td><font size=3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</font></td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info.courseOne}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info.courseTwo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info.courseThree}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info.courseFour}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info.courseOne+info.courseTwo+info.courseThree+info.courseFour}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info.rankingList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info.period}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td><a onclick=\"showzhi(this)\">查看</td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
