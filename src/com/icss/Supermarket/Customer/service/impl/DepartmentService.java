package com.icss.Supermarket.Customer.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.Customer.dao.IDepartmentDao;
import com.icss.Supermarket.Customer.domain.Customer;
import com.icss.Supermarket.Customer.service.IDepartmentService;


public class DepartmentService implements IDepartmentService{
    
    private IDepartmentDao dao;
    
    
    @Override
    public List<Customer> queryBook(Customer dep) {
        
        
        return dao.query(dep);
    }
    @Override
    public List<Customer> querySaleID() {
        
        
        return dao.querySaleID();
    }
  
    
    public void setDao(IDepartmentDao dao) {
        this.dao = dao;
    }



	@Override
	public void AddDepartment(Customer dep) {
		dao.insert(dep);
		
	}



	@Override
	public Customer getDepartment(int id) {
		 return dao.getOne(id);
	}



	



	



	@Override
	public void updateDepartment(Customer dep, HttpServletRequest req, HttpServletResponse res) {
		dao.update(dep);
		
	}



	@Override
	public void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res) {
		dao.delete(id);
		
	}


   
    
    
}
