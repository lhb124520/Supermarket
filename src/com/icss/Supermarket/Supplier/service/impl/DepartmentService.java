package com.icss.Supermarket.Supplier.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.Supplier.dao.IDepartmentDao;
import com.icss.Supermarket.Supplier.domain.Supplier;
import com.icss.Supermarket.Supplier.service.IDepartmentService;

public class DepartmentService implements IDepartmentService{
    
    private IDepartmentDao dao;
    
    
    @Override
    public List<Supplier> queryBook() {
        
        
        return dao.query();
    }
   
    
    
    public void setDao(IDepartmentDao dao) {
        this.dao = dao;
    }



	@Override
	public void AddDepartment(Supplier dep) {
		dao.insert(dep);
		
	}



	@Override
	public Supplier getDepartment(int id) {
		 return dao.getOne(id);
	}



	



	



	@Override
	public void updateDepartment(Supplier dep, HttpServletRequest req, HttpServletResponse res) {
		dao.update(dep);
		
	}



	@Override
	public void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res) {
		dao.delete(id);
		
	}


   
    
    
}
