package com.icss.Supermarket.SaleInfo.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.SaleInfo.dao.IDepartmentDao;
import com.icss.Supermarket.SaleInfo.domain.SaleInfo;
import com.icss.Supermarket.SaleInfo.service.IDepartmentService;






public class DepartmentService implements IDepartmentService{
    
    private IDepartmentDao dao;
    
    
    @Override
    public List<SaleInfo> queryBook() {
        
        
        return dao.query();
    }
    public void setDao(IDepartmentDao dao) {
        this.dao = dao;
    }
   
    
    
}
