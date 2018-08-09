package com.icss.Supermarket.Cashier.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.Cashier.dao.IDepartmentDao;
import com.icss.Supermarket.Cashier.domain.Cashier;
import com.icss.Supermarket.Cashier.domain.GoodsInfo;
import com.icss.Supermarket.Cashier.service.IDepartmentService;



public class DepartmentService implements IDepartmentService{
    
    private IDepartmentDao dao;
    
    
    @Override
    public List<Cashier> queryBook(Cashier dep) {
        
        
        return dao.query(dep);
    }
    @Override
    public GoodsInfo  queryByID(int id) {
        
        
        return dao.queryByID(id);
    }
   
    @Override
    public List<GoodsInfo> queryGoods() {
        
        
        return dao.queryGoods();
    }
  
    
    public void setDao(IDepartmentDao dao) {
        this.dao = dao;
    }



	@Override
	public void AddDepartment(Cashier dep) {
		dao.insert(dep);
		
	}



	@Override
	public Cashier getDepartment(int id) {
		 return dao.getOne(id);
	}



	



	



	@Override
	public void updateDepartment(Cashier dep, HttpServletRequest req, HttpServletResponse res) {
		dao.update(dep);
		
	}
	@Override
	public void updateDepartment1(int balance,String GoodName) {
		System.out.println(GoodName);
		/*int a=Integer.parseInt(GoodName);
		System.out.println(a);*/
		HashMap<String,Object> hashMap =new HashMap<String,Object>();
		hashMap.put("GoodName",GoodName);
		hashMap.put("balance",balance);
		
		
		System.out.println("updateDepartment1 balance"+hashMap.get("balance"));
		System.out.println("updateDepartment1  GoodName"+hashMap.get("GoodName"));
		dao.update1(hashMap);
		
	}


	@Override
	public void deleteDepartment(int id, HttpServletRequest req, HttpServletResponse res) {
		dao.delete(id);
		
	}
	@Override
	public int queryGoodsNum(String department) {
		
		return dao.queryGoodsNum(department);
		
	}


   
    
    
}
