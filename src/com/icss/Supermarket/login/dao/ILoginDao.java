package com.icss.Supermarket.login.dao;

import com.icss.Supermarket.login.domain.User;

public interface ILoginDao {
	User getUserByName(String UserID);
}
