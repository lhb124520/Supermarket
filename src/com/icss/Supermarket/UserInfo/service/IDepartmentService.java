package com.icss.Supermarket.UserInfo.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.UserInfo.domain.User;


public interface IDepartmentService {	
	
	List<User> queryBook();
    void AddDepartment(User dep);
    User getDepartment(int id);
    void updateDepartment(User dep, HttpServletRequest req, HttpServletResponse res);
	void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res);

	

	
}
