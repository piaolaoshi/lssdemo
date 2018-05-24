package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	//用户登陆
	public User checkUser(User user);
	
	int insertUser(User user);
	
	int updateByid(User user);
	
	int insertTeacher(User user);
    
    int updateByTeacherId(User user);
    
    List<User> selectStudentByClasst(User user);
    
    List<User> selectTeacher();
    
    int deleteById(User user);
    
    List<User> selectStudent();
}
