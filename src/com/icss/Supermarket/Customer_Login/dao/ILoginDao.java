package com.icss.Supermarket.Customer_Login.dao;

import com.icss.Supermarket.Customer_Login.domain.Customer;

public interface ILoginDao {
	Customer getUser(String UserName);
}
