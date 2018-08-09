package com.icss.Supermarket.Cashier.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.Supermarket.Cashier.domain.Cashier;
import com.icss.Supermarket.Cashier.domain.GoodsInfo;








public interface IDepartmentDao {
	
    List<Cashier> query(Cashier department);
    List<GoodsInfo> queryGoods();
    GoodsInfo  queryByID(int id);
    int queryGoodsNum(String department);
    void insert(Cashier department);
    Cashier getOne(int id);
    void update(Cashier department);
    public void update1(HashMap<String,Object> map);
   
    void delete(int id);
   
	
    
   
}
