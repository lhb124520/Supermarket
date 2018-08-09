package com.icss.Supermarket.Customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.Supermarket.Customer.domain.Customer;








public interface IDepartmentDao {
    List<Customer> query(Customer department);
    List<Customer> querySaleID();
    void insert(Customer department);
    Customer getOne(int id);
    void update(Customer department);
    void delete(int id);
   
	
    
   
}
