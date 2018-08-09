package com.icss.Supermarket.StockInfo.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.StockInfo.domain.StockInfo;


public interface IDepartmentService {	
	
	List<StockInfo> queryBook();
	List<StockInfo> queryGoodsName();
	List<StockInfo> queryone();
    void AddDepartment(StockInfo dep);
    StockInfo getDepartment(int id);
    void updateDepartment(StockInfo dep, HttpServletRequest req, HttpServletResponse res);
	void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res);

	

	
}
