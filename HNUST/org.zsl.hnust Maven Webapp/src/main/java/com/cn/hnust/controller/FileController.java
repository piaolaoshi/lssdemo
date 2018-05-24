package com.cn.hnust.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.cn.hnust.pojo.File_util;
import com.cn.hnust.service.FileService;

@Controller
public class FileController {
	@Resource
	private FileService fileService;
	
	
	@RequestMapping("/upload")
	public String upload(File_util fileUtil,String newApsw,HttpServletRequest request,MultipartFile photo,Model model) throws Exception{
		String fileName = photo.getOriginalFilename();//获取原始文件名
		
		String path = request.getSession().getServletContext().getRealPath("/") +"/file/"+fileName;
		photo.transferTo(new File(path));//保存文件
		fileUtil.setFilename(path);
		fileUtil.setId(Integer.valueOf(request.getParameter("id")));
		int b = fileService.upload(fileUtil);
		System.out.println(path);
		request.setAttribute("ret", 1);
		request.setAttribute("result", "fileUpload");
		model.addAttribute("fileUrl", fileName);  
		return "main_interface/main_interface";
	}
	
	
	@RequestMapping("/downFile")
	protected String doGet(HttpServletRequest request, HttpServletResponse response,Model model) throws ServletException, IOException {
	    //String path = "C:/Users/Public/Pictures/Sample Pictures/iii.jpg";
		String fileName  = request.getParameter("filename");
		System.out.println(fileName);
	    String path = request.getSession().getServletContext().getRealPath("/")+"/file/"+fileName;
	    System.out.println(path);

	    BufferedInputStream in = new BufferedInputStream(new FileInputStream(path));

	    byte[] buffer = new byte[in.available()];  
	       in.read(buffer);
	       in.close();

	       File file = new File(path);
	    String filename = file.getName();

	       response.reset();
	       //String realname = fileName.substring(fileName.indexOf("_") + 1); 
	    response.addHeader("Content-Disposition", "attachment;filename="  
	               + new String(filename.getBytes("UTF-8"),"iso-8859-1"));
	    response.addHeader("Content-Length", "" + file.length()); 
	    response.setContentType("charset=utf-8");
	    /*response.setHeader("content-disposition", "attachment;filename="  
                + URLEncoder.encode(realname, "UTF-8")); */
	    BufferedOutputStream clientout = new BufferedOutputStream(response.getOutputStream());
	    clientout.write(buffer);
	    clientout.flush();
	    clientout.close();
	    request.setAttribute("result", 1);
	    return "files/down_file"; 
	}
	
	
	/*public String listFile(HttpServletRequest request,  
	        HttpServletResponse response) {  
		FileController fc = new FileController();
	    // 获取上传文件的目录  
	    ServletContext sc = request.getSession().getServletContext();  
	    // 上传位置  
	    String uploadFilePath = sc.getRealPath("/file") + "/"; // 设定文件保存的目录  
	    // 存储要下载的文件名  
	    Map<String, String> fileNameMap = new HashMap<String, String>();  
	    // 递归遍历filepath目录下的所有文件和目录，将文件的文件名存储到map集合中  
	    fc.listfile(new File(uploadFilePath), fileNameMap);// File既可以代表一个文件也可以代表一个目录  
	    // 将Map集合发送到listfile.jsp页面进行显示  
	    request.setAttribute("fileNameMap", fileNameMap);  
	    return "listFile";  
	} */ 
	@RequestMapping("/listFile")  
	public String list(HttpServletRequest request,  
	        HttpServletResponse response) {  
		FileController fc = new FileController();
	    // 存储要下载的文件名   
	    // 递归遍历filepath目录下的所有文件和目录，将文件的文件名存储到map集合中  
		List<String> fileNameMap = fc.listFiles("");// File既可以代表一个文件也可以代表一个目录  
	    // 将Map集合发送到listfile.jsp页面进行显示  
	    request.setAttribute("fileNameMap", fileNameMap);  
	    request.setAttribute("result", "listFile");
	    return "main_interface/main_interface";  
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
