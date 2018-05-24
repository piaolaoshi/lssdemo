package org.zsl.testmybatis;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;

public class Test_StudentNumber {
	
	private static final String PROPERTIES_NAME = System.getProperty("user.dir")+"/src/main/resources/collegeNumber.properties";
	
	static{
		FileInputStream in = null;
		String str = "20141160204-1";
		String value = "";
		try{
			Properties properties = new Properties();
			//in = new FileInputStream(PROPERTIES_NAME);
			//System.out.println(str.substring(4, 9));
			properties.load(new InputStreamReader(new FileInputStream(PROPERTIES_NAME), "UTF-8"));
			//DB_DRIVER = properties.getProperty("driver");
			//properties.load(new InputStreamReader(Object.class.getResourceAsStream("StudentNumber.properties"), "UTF-8"));
		    //value = properties.get("110").toString();
			System.out.println("读取配置信息成功！");
			System.out.println(str);
			System.out.println(properties.getProperty(str));
			//System.out.println(new InputStreamReader(new FileInputStream(PROPERTIES_NAME), "UTF-8"));
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
	}
	
	
	
	public static void main(String[] args) {/*
		// TODO Auto-generated method stub
		//ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml","spring-mybatis.xml");
		String param = "2014116020418";
		String str = param.substring(4,9);
		System.out.println(str);
		final String PROPERTIES_NAME = "StudentNumber.properties";
		FileInputStream in = null;
			try{
				Properties properties = new Properties();
				in = new FileInputStream(PROPERTIES_NAME);
				properties.load(in);
				//DB_DRIVER = properties.getProperty("driver");
				System.out.println("读取配置信息成功！");
				//showConfig();
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
	*/}
	
	

}
