package com.icss.Supermarket.SaleInfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.Supermarket.SaleInfo.domain.SaleInfo;










public interface IDepartmentDao {
    List<SaleInfo> query();
    
   
	
    
   
}
