package com.icss.Supermarket.Supplier.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.Supermarket.Supplier.domain.Supplier;




public interface IDepartmentDao {
    List<Supplier> query();
   
    void insert(Supplier department);
    Supplier getOne(int id);
    void update(Supplier department);
    void delete(int id);
   
	
    
   
}
