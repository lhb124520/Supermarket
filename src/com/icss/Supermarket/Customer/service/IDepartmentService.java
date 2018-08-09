package com.icss.Supermarket.Customer.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.Customer.domain.Customer;








public interface IDepartmentService {	
	
	List<Customer> queryBook(Customer dep);
	List<Customer> querySaleID();
    void AddDepartment(Customer dep);
    Customer getDepartment(int id);
    void updateDepartment(Customer dep, HttpServletRequest req, HttpServletResponse res);
	void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res);

	

	
}
