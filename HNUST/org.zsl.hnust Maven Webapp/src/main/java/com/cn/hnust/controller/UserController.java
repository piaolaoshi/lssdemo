package com.cn.hnust.controller;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model,HttpSession session){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		//model.addAttribute("user", user);
		session.setAttribute("user", user);
		return "login";
	}
	
	@RequestMapping("/checkUser")
	public String checkUser(HttpServletRequest request,Model model,HttpSession session){
		User user = new User();
		String course01 = "";
		String course02 = "";
		String course03 = "";
		String course04 = "";
		user.setId(request.getParameter("id"));
		user.setPassword(request.getParameter("password"));
		User user_check = this.userService.checkUser(user);
		System.out.println(user_check);
		if(user_check==null){
			request.setAttribute("ret", 2);
			return "login_bak";
		}
		
		final String PROPERTIES_NAME = System.getProperty("user.dir")+"/src/main/resources/collegeNumber.properties";
		
		FileInputStream in = null;
		/*if(user_check.getClassT()!=null){
			user_check.setId(user_check.getClassT());
		}*/
			StringBuffer strbuffer = new StringBuffer();
			String value = "";
			try{
				Properties properties = new Properties();
				//System.out.println(str.substring(4, 9));
				properties.load(new InputStreamReader(new FileInputStream(PROPERTIES_NAME), "UTF-8"));
				System.out.println("读取配置信息成功！");
				for(int i = 1;i<5;i++){
					String str;
					if(user_check.getClassT()!=null){
						 str = user_check.getClassT();
					}else{
						 str = user_check.getId();
					}
					//String str = user_check.getId();
					str = str.substring(0, 11);
					if(i==1){
						str = str +"-"+i;
						course01 = properties.getProperty(str);
					}if(i==2){
						str = str +"-"+i;
						course02 = properties.getProperty(str);
					}if(i==3){
						str = str +"-"+i;
						course03 = properties.getProperty(str);
					}if(i==4){
						str = str +"-"+i;
						course04 = properties.getProperty(str);
					}
				}
				
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("读取配置信息失败！");
			}finally{
				if(in != null){
					try{
						in.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		
		
		
		
		
		
		if(user_check!=null){
			session.setAttribute("user", user_check);
			session.setAttribute("course01", course01);
			session.setAttribute("course02", course02);
			session.setAttribute("course03", course03);
			session.setAttribute("course04", course04);
			//model.addAttribute("user", user_check);
			return "main_interface/main_interface";
		}else{
			request.setAttribute("ret", 2);
			return "login_bak";
		}
		
	}
	
	@RequestMapping("/insertUser")
	public String insertUser(HttpServletRequest request,Model model,HttpSession session){
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setPassword(request.getParameter("password"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setUserName(request.getParameter("name"));
		int i = this.userService.insertUser(user);
		//model.addAttribute("user", user);
		request.setAttribute("ret", 1);
		request.setAttribute("result", "insertUser");
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/modifyUser")
	public String modifyUser(HttpServletRequest request,Model model,HttpSession session){
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setPassword(request.getParameter("password"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setUserName(request.getParameter("name"));
		//int i = this.userService.insertUser(user);
		int updateByid = userService.updateByid(user);
		//model.addAttribute("user", user);
		request.setAttribute("ret", 2);
		request.setAttribute("result", "modifyUser");
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/insertTeacher")
	public String insertTeacher(HttpServletRequest request,Model model,HttpSession session){
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setPassword(request.getParameter("password"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setUserName(request.getParameter("name"));
		user.setClassT(request.getParameter("classT"));
		user.setPower(request.getParameter("power"));
		int i = this.userService.insertTeacher(user);
		//model.addAttribute("user", user);
		request.setAttribute("ret", 1);
		request.setAttribute("result", "insertTeacher");
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/modifyTeacher")
	public String modifyTeacher(HttpServletRequest request,Model model,HttpSession session){
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setPassword(request.getParameter("password"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setUserName(request.getParameter("name"));
		user.setClassT(request.getParameter("classT"));
		user.setPower(request.getParameter("power"));
		System.out.println(user);
		//int i = this.userService.insertUser(user);
		int updateByid = userService.updateByTeacherId(user);
		//model.addAttribute("user", user);
		request.setAttribute("ret", 2);
		request.setAttribute("result", "modifyTeacher");
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/selectStudentByClasst")
	public String selectStudentByClasst(HttpServletRequest request,Model model,HttpSession session){
		User user_bak = new User();
		user_bak = (User) session.getAttribute("user");
		System.out.println(user_bak);
		List<User> student_info = this.userService.selectStudent();
		//model.addAttribute("user", user);
		//session.setAttribute("student_info", student_info);
		System.out.println(student_info);
		request.setAttribute("student_info", student_info);
		request.setAttribute("result", "student_info");
		return "main_interface/main_interface";
	}
	
	@RequestMapping("/selectTeacher")
	public String selectTeacher(HttpServletRequest request,Model model,HttpSession session){
		List<User> teacher_info = this.userService.selectTeacher();
		//model.addAttribute("user", user);
		//session.setAttribute("student_info", student_info);
		System.out.println(teacher_info);
		request.setAttribute("teacher_info", teacher_info);
		request.setAttribute("result", "teacher_info");
		return "main_interface/main_interface";
	}
	
	//退出功能
		@RequestMapping("/exit")
		public String exit(HttpSession session,HttpServletRequest request){
			 session = request.getSession(false);//防止创建Session
			if(session == null){
				return "redirect:jsp/login_bak.jsp";
			}
			//log.info(session.getAttribute("aname")+":退出！");
			//session.removeAttribute("aname");
			session.invalidate();//销毁跟用户关联session
			return "redirect:jsp/login_bak.jsp";
		}
		
		@RequestMapping("/deleteById")
		public String deleteById(HttpServletRequest request){
			User user = new User();
			user.setId(request.getParameter("id"));
			userService.deleteById(user);
			return "main_interface/main_interface";
		}
}
