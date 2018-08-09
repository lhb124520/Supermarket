package com.icss.Supermarket.Supplier.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.Supplier.domain.Supplier;
public interface IDepartmentService {	
	
	List<Supplier> queryBook();
	
    void AddDepartment(Supplier dep);
    Supplier getDepartment(int id);
    void updateDepartment(Supplier dep, HttpServletRequest req, HttpServletResponse res);
	void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res);

	

	
}
