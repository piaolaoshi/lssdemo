package com.cn.hnust.dao;

import com.cn.hnust.pojo.File_util;



public interface FileDao {
    int deleteByPrimaryKey(Integer id);

    int insert(File_util record);

    int insertSelective(File_util record);

    File_util selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(File_util record);

    int updateByPrimaryKey(File_util record);
    
    int upload(File_util fileUtil);
}