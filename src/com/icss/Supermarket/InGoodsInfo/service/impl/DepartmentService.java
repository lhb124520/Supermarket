package com.icss.Supermarket.InGoodsInfo.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.InGoodsInfo.dao.IDepartmentDao;
import com.icss.Supermarket.InGoodsInfo.domain.InGoodsInfo;
import com.icss.Supermarket.InGoodsInfo.service.IDepartmentService;






public class DepartmentService implements IDepartmentService{
    
    private IDepartmentDao dao;
    
    
    @Override
    public List<InGoodsInfo> queryBook() {
        
        
        return dao.query();
    }
    public void setDao(IDepartmentDao dao) {
        this.dao = dao;
    }
   
    
    
}
