package com.icss.Supermarket.StockInfo.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.StockInfo.dao.IDepartmentDao;
import com.icss.Supermarket.StockInfo.domain.StockInfo;
import com.icss.Supermarket.StockInfo.service.IDepartmentService;



public class DepartmentService implements IDepartmentService{
    
    private IDepartmentDao dao;
    
    
    @Override
    public List<StockInfo> queryBook() {
        
        
        return dao.query();
    }
    @Override
    public List<StockInfo> queryGoodsName() {
        
        
        return dao.queryGoodsName();
    }
    @Override
    public List<StockInfo> queryone() {
        
        
        return dao.queryone();
    }
    
    
    public void setDao(IDepartmentDao dao) {
        this.dao = dao;
    }



	@Override
	public void AddDepartment(StockInfo dep) {
		dao.insert(dep);
		
	}



	@Override
	public StockInfo getDepartment(int id) {
		 return dao.getOne(id);
	}



	



	



	@Override
	public void updateDepartment(StockInfo dep, HttpServletRequest req, HttpServletResponse res) {
		dao.update(dep);
		
	}



	@Override
	public void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res) {
		dao.delete(id);
		
	}


   
    
    
}
