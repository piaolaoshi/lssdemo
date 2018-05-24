package com.cn.hnust.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cn.hnust.dao.GradeDao;
import com.cn.hnust.pojo.Grade;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.GradeService;
import com.cn.hnust.util.ReadExcel;
@Service("gradeService")
public class GradeServiceImpl implements GradeService {
	@Resource
	private GradeDao gradeDao;
	int total = 0;
	int rank_list = 0;
	Map<String,Integer> map = new TreeMap<String,Integer>();
	String id = null;
	ArrayList<Grade> result_grade = new ArrayList<Grade>();
	@Override
	public List<Grade> selectGrade(User user) {
		// TODO Auto-generated method stub
		return gradeDao.selectGrade(user);
	}

	@Override
	public List<Grade> readExcelFile(MultipartFile file) {
		String result = "";
		// 创建处理EXCEL的类
		ReadExcel readExcel = new ReadExcel();
		// 解析excel，获取上传的事件单
		List<Grade> gradeList = readExcel.getExcelInfo(file);
		// 至此已经将excel中的数据转换到list里面了,接下来就可以操作list,可以进行保存到数据库,或者其他操作,
		// 和你具体业务有关,这里不做具体的示范
		// System.out.println(gradeList);
		for (Grade data : gradeList) {
			//System.out.println(data);
			total = Integer.valueOf(data.getCourseOne())
					+ Integer.valueOf(data.getCourseTwo())
					+ Integer.valueOf(data.getCourseThree())
					+ Integer.valueOf(data.getCourseFour());
			id = data.getId();
			map.put(id, total);
		}
		// 升序比较器
		Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue() - o1.getValue();
			}
		};

		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
				map.entrySet());
		Collections.sort(list, valueComparator);
		// System.out.println(map);
		System.out.println("------------map按照value升序排序--------------------");
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			rank_list = rank_list + 1;
			for (Grade data : gradeList) {
				Grade param = new Grade();
				if(entry.getKey()==data.getId()){
					String id = null;
					id = data.getId();
					id = id.substring(0, id.length()-1);
					id = id.replace(".", "");
					//BigDecimal db = new BigDecimal(id);  
			        //String id_str = db.toPlainString(); 
					param.setId(id);
					param.setCourseOne(data.getCourseOne());
					param.setCourseTwo(data.getCourseTwo());
					param.setCourseThree(data.getCourseThree());
					param.setCourseFour(data.getCourseFour());
					param.setName(data.getName());
					param.setRankingList(Integer.toString(rank_list));
					param.setTotalScore(Integer.toString(entry.getValue()));
					param.setPeriod(data.getPeriod());
				}
				if(param.getId()!=null){
					result_grade.add(param);
				}
			}
		}
			if (gradeList != null && !gradeList.isEmpty()) {
				result = "上传成功";
			} else {
				result = "上传失败";
			}
		System.out.println(result_grade);
		return result_grade;
	}

	@Override
	public int insertGrade(Grade grade) {
		// TODO Auto-generated method stub
		return gradeDao.insertGrade(grade);
	}

	@Override
	public List<Grade> selectGradeByPeriod(User user) {
		// TODO Auto-generated method stub
		return gradeDao.selectGradeByPeriod(user);
	}

	@Override
	public ArrayList<Map<String,Double>> classAvgGrade() {
		// TODO Auto-generated method stub
		return  gradeDao.classAvgGrade();
	}

	@Override
	public ArrayList<Map<String,Double>> classAvgGradeByPeriod(int period) {
		// TODO Auto-generated method stub
		return gradeDao.classAvgGradeByPeriod(period);
	}

	@Override
	public ArrayList<Map<String,Double>> classAvgGradeAll() {
		// TODO Auto-generated method stub
		return gradeDao.classAvgGradeAll();
	}

	@Override
	public List<Grade> selectGradeByPersonal(User user) {
		// TODO Auto-generated method stub
		return gradeDao.selectGradeByPersonal(user);
	}

	@Override
	public ArrayList<Map<String, Double>> classAvgGradeByPersonal(User user) {
		// TODO Auto-generated method stub
		return gradeDao.classAvgGradeByPersonal(user);
	}

	
	

}
