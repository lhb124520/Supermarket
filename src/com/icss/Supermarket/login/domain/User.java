package com.icss.Supermarket.login.domain;

public class User {
private String UserID;
private String password;
private String username;
private String Sex;
private String Phone;
private String Address;
private String position;
    

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(String userID, String password, String username, String sex, String phone, String address,
		String position) {
	super();
	UserID = userID;
	this.password = password;
	this.username = username;
	Sex = sex;
	Phone = phone;
	Address = address;
	this.position = position;
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





public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getUserID() {
	return UserID;
}


public void setUserID(String userID) {
	UserID = userID;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}





@Override
public String toString() {
	return "User [UserID=" + UserID + ", password=" + password + ", username=" + username + ", Sex=" + Sex + ", Phone="
			+ Phone + ", Address=" + Address + ", position=" + position + "]";
}




}
