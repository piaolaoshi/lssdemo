package com.cn.hnust.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cn.hnust.pojo.Grade;
import com.cn.hnust.pojo.User;


public interface GradeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
    
    List<Grade> selectGrade(User user);
    
    int insertGrade(Grade grade);
    
    List<Grade> selectGradeByPeriod(User user);
    
    ArrayList<Map<String,Double>> classAvgGrade();
    
    ArrayList<Map<String,Double>> classAvgGradeByPeriod(int period);
    
    ArrayList<Map<String,Double>> classAvgGradeAll();
    
    List<Grade> selectGradeByPersonal(User user);
    
    ArrayList<Map<String,Double>> classAvgGradeByPersonal(User user);
}