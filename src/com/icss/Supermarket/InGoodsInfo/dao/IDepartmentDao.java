package com.icss.Supermarket.InGoodsInfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.Supermarket.InGoodsInfo.domain.InGoodsInfo;










public interface IDepartmentDao {
    List<InGoodsInfo> query();
    
   
	
    
   
}
