package org.zsl.testmybatis;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSONObject;



















import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.pojo.Grade;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.GradeService;

public class Test {
	
	public static void main(String[] args) throws IOException {
//	  	ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"});
	      
	  	
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml","spring-mybatis.xml");
    	//IUserService userService = (IUserService)ac.getBean("userService");
    	//User user = userService.getUserById(1);  
    	User user_test = new User();
		user_test.setUserName("zxy");
		user_test.setPassword("123");
		List<Double> class_total = new ArrayList<Double>();
    	//User user = userService.checkUser(user_test);
    	GradeService gradeService = (GradeService)ac.getBean("gradeService");
    	ArrayList<Map<String,Double>> classAvgGradeByPeriod = gradeService.classAvgGradeByPeriod(1);
    	System.out.println(classAvgGradeByPeriod);
    	for(Map<String, Double> obj:classAvgGradeByPeriod){
    		System.out.println(obj.get("total_score_avg"));
    	}
    	/*Map<String, Double> map = classAvgGradeAll.get(0);
    	Double per = (double) 1;
    	System.out.println(map.get("period"));
    	if(map.get("period") == per){
    		System.out.println(1);
    	}*/
    	
    	//System.out.println(classAvgGradeAll.get(0).get("period"));
    	/*if(map.get("period")==1.0){
    		System.out.println(1);
    	}*/
    	//System.out.println(classAvgGradeAll.get(0).get(key));
    	/*ArrayList<Map<String,Double>> avg_grade = gradeService.classAvgGrade();
    	for(int i = 0 ; i < avg_grade.size() ; i++) {
    		System.out.println(avg_grade.get(i).get("total_score_avg"));
    		class_total.add(avg_grade.get(i).get("total_score_avg"));
    		}*/
    	/*List<Grade> grade= gradeService.selectGrade();
    	List<Integer> total = new ArrayList<Integer>();
    	double[] arr = new double[12];
    	for(int i=1;i<12;i++){
    		int param = 0;
    		int num = 0;
    		String link ;
    		for(Grade g:grade){
    			if(Integer.valueOf(g.getPeriod())==i){
    				param = Integer.valueOf(g.getTotalScore())+param;
    				num+=1;
    			}
    		}
    		if(num!=0){
    			param = param/num;
    		}
    		
    		
    		total.add(param);
    		System.out.println(param);
    	}*/
    	/*double num1 = 50123.12E25;
    	double num = 2.014116020414E;*/
    	//BigDecimal db = new BigDecimal("2.014116020414E");  
        //String id_str = db.toPlainString(); 
        //System.out.println(id_str);
/*    	List<Integer> a = total;*/
    	//str = str.substring(0, str.length()-1);
    	//System.out.println(JSON.toJSONString(avg_grade));
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
//        logger.info(JSON.toJSONString(user)); 
    	/*String str = "2.014116020414E";
    	str = str.substring(0, str.length()-1);
    	System.out.println(str.replace(".", ""));*/ 
 	    // 上传位置  
 	    String uploadFilePath = System.getProperty("user.dir")+"/src/main/webapp"+"/file/"; // 设定文件保存的目录  

 	    // 存储要下载的文件名  
 	    Map<String, String> fileNameMap = new HashMap<String, String>();  
 	    // 递归遍历filepath目录下的所有文件和目录，将文件的文件名存储到map集合中  
		/*BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				uploadFilePath));
		byte[] buffer = new byte[in.available()];
		in.read(buffer);
		in.close();
		File file = new File(uploadFilePath);
	    String filename = file.getName();
		//File file = new File(uploadFilePath);
 	    System.out.println(filename);*/
 	    
 	/* //局部变量  
        List<String> files_str=new ArrayList<String>();  
        List<File> files_file=new ArrayList<File>();  
        File dir_file=new File(uploadFilePath);  
        String file_str;  
        //获取文件列表  
        files_file=Arrays.asList(dir_file.listFiles()); 
        for(File file:files_file){  
            //判断：如果是文件，则添加,如果是目录，则递归  
            if(file.isFile()){  
                file_str=file.getAbsolutePath();  
                files_str.add(file_str);  
            } else{  
                //传参和返回值是个重点！！！！  
                files_str=listFiles(uploadFilePath+"\\"+file.getName());  
            }  
        } */ 
 	   Test test = new Test();
 	  String dir_str = System.getProperty("user.dir")+"/src/main/webapp"+"/file/";
 	   test.listFiles(dir_str);
	}

	 private List<String> listFiles(String dir_str){ 
		 	String uploadFilePath = System.getProperty("user.dir")+"/src/main/webapp"+"/file/";
	        //局部变量  
	        List<String> files_str=new ArrayList<String>();  
	        List<File> files_file=new ArrayList<File>();  
	        File dir_file=new File(uploadFilePath);  
	        String file_str;  
	        //获取文件列表  
	        files_file=Arrays.asList(dir_file.listFiles());  
	        //遍历文件列表，获取带绝对路径的文件名  
	        for(File file:files_file){  
	            //判断：如果是文件，则添加,如果是目录，则递归  
	            if(file.isFile()){  
	                file_str=file.getName();
	                files_str.add(file_str);  
	            } else{  
	                //传参和返回值是个重点！！！！  
	                files_str=listFiles(uploadFilePath+"\\"+file.getName());  
	            }  
	        }  
	        System.out.println(files_str);
	        return files_str;  
	    } 

}