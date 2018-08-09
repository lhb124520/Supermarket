package com.icss.Supermarket.Buyer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.Supermarket.Buyer.domain.Buyer;








public interface IDepartmentDao {
    List<Buyer> query(Buyer department);
    List<Buyer> querySupplierName();
    void insert(Buyer department);
    void insert1(Buyer department);
    Buyer getOne(int id);
    void update(Buyer department);
    void delete(int id);
    void update1(Buyer department);
    void delete1(int id);
	
    
   
}
