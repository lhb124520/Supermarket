package com.icss.Supermarket.Cashier.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.Supermarket.Cashier.domain.Cashier;
import com.icss.Supermarket.Cashier.domain.GoodsInfo;





public interface IDepartmentService {	
	
	List<Cashier> queryBook(Cashier dep);
	List<GoodsInfo> queryGoods();
	GoodsInfo  queryByID(int id);
	int queryGoodsNum(String department);
    void AddDepartment(Cashier dep);
    Cashier getDepartment(int id);
    void updateDepartment(Cashier dep, HttpServletRequest req, HttpServletResponse res);
    public void updateDepartment1(int balance,String GoodName);
    void deleteDepartment(int id,  HttpServletRequest req, HttpServletResponse res);

	

	
}
