package com.icss.Supermarket.StockInfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.Supermarket.StockInfo.domain.StockInfo;






public interface IDepartmentDao {
    List<StockInfo> query();
    List<StockInfo> queryGoodsName();
    List<StockInfo> queryone();
    void insert(StockInfo department);
    StockInfo getOne(int id);
    void update(StockInfo department);
    void delete(int id);
   
	
    
   
}
