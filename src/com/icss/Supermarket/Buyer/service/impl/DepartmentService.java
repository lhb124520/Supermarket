package com.icss.Supermarket.Buyer.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.Buyer.dao.IDepartmentDao;
import com.icss.Supermarket.Buyer.domain.Buyer;
import com.icss.Supermarket.Buyer.service.IDepartmentService;





public class DepartmentService implements IDepartmentService{
    
    private IDepartmentDao dao;
    
    
    @Override
    public List<Buyer> queryBook(Buyer dep) {
        
        
        return dao.query(dep);
    }
    @Override
    public List<Buyer> queryGoods() {
        
        
        return dao.querySupplierName();
    }
  
    
    public void setDao(IDepartmentDao dao) {
        this.dao = dao;
    }



	@Override
	public void AddDepartment(Buyer dep) {
		dao.insert(dep);
		
	}
	@Override
	public void insert1(Buyer dep) {
		dao.insert1(dep);
		
	}


	@Override
	public Buyer getDepartment(int id) {
		 return dao.getOne(id);
	}



	



	



	@Override
	public void updateDepartment(Buyer dep, HttpServletRequest req, HttpServletResponse res) {
		dao.update(dep);
		
	}



	@Override
	public void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res) {
		dao.delete(id);
		
	}
	@Override
	public void updateDepartment1(Buyer dep, HttpServletRequest req, HttpServletResponse res) {
		dao.update1(dep);
		
	}



	@Override
	public void deleteDepartment1(int id, HttpServletRequest req, HttpServletResponse res) {
		dao.delete1(id);
		
	}

   
    
    
}
