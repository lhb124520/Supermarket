package com.icss.Supermarket.login.action;

import com.icss.Supermarket.login.domain.User;
import com.icss.Supermarket.login.service.ILoginService;

public class LoginAction {
	private String UserID;
    private String password;
    private String username;
    private String Sex;
    private String Phone;
    private String Address;
    private String position;
    private String tip; 
    
    private ILoginService service;
    
 public String login() {
        
        /*service = (ILoginService) WebApplicationContextUtils
                .getWebApplicationContext(
                        ServletActionContext.getServletContext())
                .getBean("lservice");*/
        String result = service.login(new User(UserID, password,username,Sex,Phone,Address,position));
        System.out.println(UserID);
        System.out.println(password);
        System.out.println(username);
        if ("login Admin".equals(result)) {
        	
            return "login Admin";
        }
        if ("login Cashier".equals(result)) {
        	
            return "login Cashier";
        }
        if ("login Buyer".equals(result)) {
	
        	return "login Buyer";
        }
        if ("login Customer".equals(result)) {
	
        	return "login customer";
}
        if ("login success".equals(result)) {
        	
            return "success";
        }
        tip = result;
        
        return "failure";
    }
    
	public void setService(ILoginService service) {
		this.service = service;
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
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
	
	
    
}
