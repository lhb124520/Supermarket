package com.icss.Supermarket.UserInfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.Supermarket.UserInfo.domain.User;


public interface IDepartmentDao {
    List<User> query();
    void insert(User department);
    User getOne(int id);
    void update(User department);
    void delete(int id);
   
	
    
   
}
