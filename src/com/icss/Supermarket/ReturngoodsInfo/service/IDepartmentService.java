package com.icss.Supermarket.ReturngoodsInfo.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.ReturngoodsInfo.domain.ReturngoodsInfo;




public interface IDepartmentService {	
	
	List<ReturngoodsInfo> queryBook();
	List<ReturngoodsInfo> queryGoodsName();
	List<ReturngoodsInfo> queryone();
    void AddDepartment(ReturngoodsInfo dep);
    ReturngoodsInfo getDepartment(int id);
    void updateDepartment(ReturngoodsInfo dep, HttpServletRequest req, HttpServletResponse res);
	void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res);

	

	
}
