package com.icss.Supermarket.register.action;

import java.util.List;

import com.icss.Supermarket.register.domain.User;
import com.icss.Supermarket.register.service.IRegisterService;

public class RegisterAction {
	private int UserID;
	private String UserName;
	private String Password;
	private String Sex;
	private String Phone;
	private String Address;
	private String position;
	private IRegisterService service;
	
	



	public RegisterAction(int userID, String userName, String password, String sex, String phone, String address,
			String position) {
		super();
		UserID = userID;
		UserName = userName;
		Password = password;
		Sex = sex;
		Phone = phone;
		Address = address;
		this.position = position;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public RegisterAction(IRegisterService service) {
		super();
		this.service = service;
	}

	public String register(){
		
		
	    service.insert(new User(0,UserName,Password,Sex,Phone,Address,"¹Ë¿Í"));
		
		return "success";
	}

}
