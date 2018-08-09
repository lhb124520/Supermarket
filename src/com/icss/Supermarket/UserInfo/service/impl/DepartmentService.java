package com.icss.Supermarket.UserInfo.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.UserInfo.dao.IDepartmentDao;
import com.icss.Supermarket.UserInfo.domain.User;
import com.icss.Supermarket.UserInfo.service.IDepartmentService;




public class DepartmentService implements IDepartmentService{
    
    private IDepartmentDao dao;
    
    
    @Override
    public List<User> queryBook() {
        
        
        return dao.query();
    }
    
    
    
    public void setDao(IDepartmentDao dao) {
        this.dao = dao;
    }



	@Override
	public void AddDepartment(User dep) {
		dao.insert(dep);
		
	}



	@Override
	public User getDepartment(int id) {
		 return dao.getOne(id);
	}



	



	



	@Override
	public void updateDepartment(User dep, HttpServletRequest req, HttpServletResponse res) {
		dao.update(dep);
		
	}



	@Override
	public void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res) {
		dao.delete(id);
		
	}


   
    
    
}
