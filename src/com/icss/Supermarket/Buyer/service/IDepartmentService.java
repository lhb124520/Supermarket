package com.icss.Supermarket.Buyer.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.Buyer.domain.Buyer;






public interface IDepartmentService {	
	
	List<Buyer> queryBook(Buyer dep);
	List<Buyer> queryGoods();
    void AddDepartment(Buyer dep);
    void insert1(Buyer department);
    Buyer getDepartment(int id);
    void updateDepartment(Buyer dep, HttpServletRequest req, HttpServletResponse res);
	void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res);
	 void updateDepartment1(Buyer dep, HttpServletRequest req, HttpServletResponse res);
		void deleteDepartment1(int id, HttpServletRequest req, HttpServletResponse res);
		
	

	
}
