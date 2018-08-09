package com.icss.Supermarket.ReturngoodsInfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.Supermarket.ReturngoodsInfo.domain.ReturngoodsInfo;








public interface IDepartmentDao {
    List<ReturngoodsInfo> query();
    List<ReturngoodsInfo> queryGoodsName();
    List<ReturngoodsInfo> queryone();
    void insert(ReturngoodsInfo department);
    ReturngoodsInfo getOne(int id);
    void update(ReturngoodsInfo department);
    void delete(int id);
   
	
    
   
}
