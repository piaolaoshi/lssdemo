package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.FileDao;
import com.cn.hnust.pojo.File_util;
import com.cn.hnust.service.FileService;
@Service("fileService")
public class FileServiceImpl implements FileService {
	@Resource 
	FileDao fileDao;
	
	@Override
	public int upload(File_util fileutil) {
		// TODO Auto-generated method stub
		return fileDao.upload(fileutil);
	}

	@Override
	public int download() {
		// TODO Auto-generated method stub
		return 0;
	}

}
