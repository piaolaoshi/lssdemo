package com.cn.hnust.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.cn.hnust.pojo.Grade;
import com.cn.hnust.pojo.User;

public interface GradeService {
	List<Grade> selectGrade(User user);
	
	/**
	 * 读取excel中的数据,生成list
	 */
	List<Grade> readExcelFile(MultipartFile file); 
	
	int insertGrade(Grade grade);
	
	List<Grade> selectGradeByPeriod(User user);
	
	ArrayList<Map<String,Double>> classAvgGrade();
    
	ArrayList<Map<String,Double>> classAvgGradeByPeriod(int period);
    
    ArrayList<Map<String,Double>> classAvgGradeAll();
    
    List<Grade> selectGradeByPersonal(User user);
    
    ArrayList<Map<String,Double>> classAvgGradeByPersonal(User user);
    

}
