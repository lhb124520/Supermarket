package com.icss.Supermarket.ReturngoodsInfo.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.ReturngoodsInfo.dao.IDepartmentDao;
import com.icss.Supermarket.ReturngoodsInfo.domain.ReturngoodsInfo;
import com.icss.Supermarket.ReturngoodsInfo.service.IDepartmentService;





public class DepartmentService implements IDepartmentService{
    
    private IDepartmentDao dao;
    
    
    @Override
    public List<ReturngoodsInfo> queryBook() {
        
        
        return dao.query();
    }
    @Override
    public List<ReturngoodsInfo> queryGoodsName() {
        
        
        return dao.queryGoodsName();
    }
    @Override
    public List<ReturngoodsInfo> queryone() {
        
        
        return dao.queryone();
    }
    
    
    public void setDao(IDepartmentDao dao) {
        this.dao = dao;
    }



	@Override
	public void AddDepartment(ReturngoodsInfo dep) {
		dao.insert(dep);
		
	}



	@Override
	public ReturngoodsInfo getDepartment(int id) {
		 return dao.getOne(id);
	}



	



	



	@Override
	public void updateDepartment(ReturngoodsInfo dep, HttpServletRequest req, HttpServletResponse res) {
		dao.update(dep);
		
	}



	@Override
	public void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res) {
		dao.delete(id);
		
	}


   
    
    
}
