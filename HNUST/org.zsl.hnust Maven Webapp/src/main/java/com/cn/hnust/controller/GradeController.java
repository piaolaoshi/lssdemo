package com.cn.hnust.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;









import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cn.hnust.pojo.Grade;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.GradeService;
import com.mysql.fabric.xmlrpc.base.Array;

@Controller
public class GradeController {
	@Resource
	private GradeService gradeService;
	String result;
	
	@RequestMapping("/selectGrade")
	public String selectGrade(HttpServletRequest request,Model model,HttpSession session){
		//List<Integer> total = new ArrayList<Integer>();
		List<Integer> total = new ArrayList<Integer>();
		List<Double> class_total = new ArrayList<Double>();
		List<Double> class_avg_grade = new ArrayList<Double>();
		List<Grade> grade;
		List<Grade> allgrade;
		int period = Integer.valueOf(request.getParameter("period"));
		double period_bak = Double.parseDouble(request.getParameter("period"));
		System.out.println(period);
		User user = new User();
		User user_bak = new User();
		user_bak = (User) session.getAttribute("user");
		System.out.println(user_bak);
		if(user_bak.getClassT()!=null){
			user.setId(user_bak.getClassT());
		}else{
			user.setId(user_bak.getId());
		}
		user.setAge(user_bak.getAge());
		user.setClassT(user_bak.getClassT());
		//user.setId(user_bak.getId());
		user.setUserName(user_bak.getUserName());
		System.out.println(user);
		if (period>0) {
			user.setPeriod(period);
		}
		
		if (user.getId().length()>7) {
			user.setId(user.getId().substring(0, 11));
		}
		System.out.println(user.getId());
		ArrayList<Map<String,Double>> class_grade_total = gradeService.classAvgGradeAll();
		if(period==0){
			grade = gradeService.selectGrade(user);
			
			class_avg_grade.add(class_grade_total.get(0).get("total_score_avg"));
			class_avg_grade.add(class_grade_total.get(0).get("course_four_avg"));
			class_avg_grade.add(class_grade_total.get(0).get("course_three_avg"));
			class_avg_grade.add(class_grade_total.get(0).get("course_two_avg"));
			class_avg_grade.add(class_grade_total.get(0).get("course_one_avg"));	
		}else{
			ArrayList<Map<String,Double>> classAvgGradeByPeriod = gradeService.classAvgGradeByPeriod(period);
			class_avg_grade.add(classAvgGradeByPeriod.get(0).get("total_score_avg"));
			class_avg_grade.add(classAvgGradeByPeriod.get(0).get("course_four_avg"));
			class_avg_grade.add(classAvgGradeByPeriod.get(0).get("course_three_avg"));
			class_avg_grade.add(classAvgGradeByPeriod.get(0).get("course_two_avg"));
			class_avg_grade.add(classAvgGradeByPeriod.get(0).get("course_one_avg"));	
	    	
			grade = gradeService.selectGradeByPeriod(user);
		}	
		allgrade = gradeService.selectGrade(user);
		System.out.println(allgrade);
		for(int i=1;i<13;i++){
    		int param = 0;
    		int number = 0;
    		for(Grade g:allgrade){
    			if(Integer.valueOf(g.getPeriod())==i){
    				param = Integer.valueOf(g.getTotalScore())+param;
    				number+=1;
    			}
    		}
    		if(number!=0){
    			param = param/number;
    		}
    		total.add(param);
		}
		ArrayList<Map<String, Double>> classAvgGrade = gradeService.classAvgGrade();
		for(int i = 0 ; i < classAvgGrade.size() ; i++) {
    		class_total.add(classAvgGrade.get(i).get("total_score_avg"));
    	}
		request.setAttribute("class_total", total);
		request.setAttribute("class_grade_total", class_total);
		request.setAttribute("class_avg_grade", class_avg_grade);
		request.setAttribute("result", "class_grade");
		//System.out.println(grade);
		model.addAttribute("grade",grade);
		//return "class_performance";
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/selectGradeByPeriod")
	public String selectGradeByPeriod(HttpServletRequest request,Model model,HttpSession session){
		int period = Integer.valueOf(request.getParameter("period"));
		User user = new User();
		user = (User) session.getAttribute("user");
		user.setPeriod(period);
		user.setId(user.getId().substring(0, 11));
		System.out.println(user.getId());
		List<Grade> grade = gradeService.selectGradeByPeriod(user);
		model.addAttribute("grade",grade);
		return "class_performance";
	}
	
	@RequestMapping("/upload_excel")   
    public String  upload(@RequestParam(value="file",required = false)MultipartFile file,HttpServletRequest request, HttpServletResponse response){  
        List<Grade> grade_list = gradeService.readExcelFile(file);  
        int b = 0 ;
        for(Grade grade:grade_list){
        	System.out.println(grade);
        	 b= gradeService.insertGrade(grade);
        }
        if(b!=0){
        	result = "导入成功";
        }else{
        	result = "导入失败";
        }
        request.setAttribute("result", "upload_excel");
        request.setAttribute("ret", 1);
		return "main_interface/main_interface"; 
    }  
	
	@RequestMapping("/selectGradeByPersonal")
	public String selectGradeByPersonal(HttpServletRequest request,Model model,HttpSession session){
		int period = Integer.valueOf(request.getParameter("period"));
		List<Double> class_avg_grade = new ArrayList<Double>();
		List<Double> class_total = new ArrayList<Double>();
		List<Integer> total = new ArrayList<Integer>();
		User user = new User();
		user = (User) session.getAttribute("user");
		user.setPeriod(period);
		System.out.println(user.getId());
		List<Grade> grade = gradeService.selectGradeByPersonal(user);
		for(Grade g:grade){
			total.add(Integer.parseInt(g.getTotalScore()));
		}
		ArrayList<Map<String,Double>> classAvgGradeByPersonal = gradeService.classAvgGradeByPersonal(user);
		ArrayList<Map<String,Double>> class_grade_total = gradeService.classAvgGrade();
		class_avg_grade.add(classAvgGradeByPersonal.get(0).get("total_score_avg"));
		class_avg_grade.add(classAvgGradeByPersonal.get(0).get("course_four_avg"));
		class_avg_grade.add(classAvgGradeByPersonal.get(0).get("course_three_avg"));
		class_avg_grade.add(classAvgGradeByPersonal.get(0).get("course_two_avg"));
		class_avg_grade.add(classAvgGradeByPersonal.get(0).get("course_one_avg"));
		for(int i = 0 ; i < class_grade_total.size() ; i++) {
    		class_total.add(class_grade_total.get(i).get("total_score_avg"));
    	}
		model.addAttribute("grade",grade);
		request.setAttribute("result", "class_grade");
		request.setAttribute("class_grade_total", class_total);
		request.setAttribute("class_avg_grade", class_avg_grade);
		request.setAttribute("class_total", total);
		return "main_interface/main_interface";
	}
}
