package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insertUser(User user);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User checkUser(User user);
    
    int updateByid(User user);
    
    int insertTeacher(User user);
    
    int updateByTeacherId(User user);
    
    List<User> selectStudentByClasst(User user);
    
    List<User> selectStudent();
    
    List<User> selectTeacher();
    
    int deleteById(User user);
}