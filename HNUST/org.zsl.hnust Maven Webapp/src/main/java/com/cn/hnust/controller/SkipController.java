package com.cn.hnust.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;

@Controller
public class SkipController {
	
	@RequestMapping("/fileUpload")
	public String fileUpload(HttpServletRequest request){
		request.setAttribute("result", "fileUpload");
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/uploadExcel")
	public String uploadExcel(HttpServletRequest request){
		request.setAttribute("result", "upload_excel");
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request){
		request.setAttribute("result", "insertUser");
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/modifyUser_skip")
	public String modifyUser(HttpServletRequest request,HttpSession session){
		request.setAttribute("result", "modifyUser");
		//User user = (User) session.getAttribute("user");
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setPassword(request.getParameter("password"));
		user.setUserName(request.getParameter("name"));
		request.setAttribute("user_modify", user);
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/addTeacher")
	public String addTeacher(HttpServletRequest request){
		request.setAttribute("result", "insertTeacher");
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/modifyTeacher_skip")
	public String modifyTeacher_skip(HttpServletRequest request,HttpSession session){
		request.setAttribute("result", "modifyTeacher");
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setPassword(request.getParameter("password"));
		user.setUserName(request.getParameter("name"));
		user.setClassT(request.getParameter("classT"));
		user.setPower(request.getParameter("power"));
		request.setAttribute("user_modify", user);
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/selectUserInformation")
	public String selectUserInformation(HttpServletRequest request,HttpSession session){
		request.setAttribute("result", "modifyUser");
		request.setAttribute("result_bak", "info");
		User user = (User) session.getAttribute("user");
		request.setAttribute("user_modify", user);
		System.out.println(user.getClassT());
		if(user.getClassT()!=null){
			request.setAttribute("result", "selectTeacher");
		}else{
			request.setAttribute("result", "selectStudent");
		}
		return "main_interface/main_interface";
	}
	
	
}
