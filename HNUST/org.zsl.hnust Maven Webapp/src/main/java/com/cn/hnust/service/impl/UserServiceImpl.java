package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao iuserdao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.iuserdao.selectByPrimaryKey(userId);
	}
	@Override
	public User checkUser(User user) {
		// TODO Auto-generated method stub
		return this.iuserdao.checkUser(user);
	}
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return iuserdao.insertUser(user);
	}
	@Override
	public int updateByid(User user) {
		// TODO Auto-generated method stub
		return iuserdao.updateByid(user);
	}
	@Override
	public int insertTeacher(User user) {
		// TODO Auto-generated method stub
		return iuserdao.insertTeacher(user);
	}
	@Override
	public int updateByTeacherId(User user) {
		// TODO Auto-generated method stub
		return iuserdao.updateByTeacherId(user);
	}
	@Override
	public List<User> selectStudentByClasst(User user) {
		// TODO Auto-generated method stub
		return iuserdao.selectStudentByClasst(user);
	}
	@Override
	public List<User> selectTeacher() {
		// TODO Auto-generated method stub
		return iuserdao.selectTeacher();
	}
	@Override
	public int deleteById(User user) {
		// TODO Auto-generated method stub
		return iuserdao.deleteById(user);
	}
	@Override
	public List<User> selectStudent() {
		// TODO Auto-generated method stub
		return iuserdao.selectStudent();
	}

}
