package com.icss.Supermarket.Customer_Login.action;

import com.icss.Supermarket.Customer_Login.domain.Customer;
import com.icss.Supermarket.Customer_Login.service.ILoginService;

public class LoginAction {
	private String UserID;
	private String UserName;
	private String Password;
	private String Sex;
	private String Phone;
	private String Address;
	private String position;
    private String tip; 
    
    private ILoginService service;
    
 public String login_Customer() {
        
        /*service = (ILoginService) WebApplicationContextUtils
                .getWebApplicationContext(
                        ServletActionContext.getServletContext())
                .getBean("lservice");*/
        String result = service.login(new Customer(UserID, UserName,Password,Sex,Phone,Address,position));
        System.out.println(UserID);
        System.out.println(UserName);
        System.out.println(Password);
     
        if ("login success".equals(result)) {
        	
            return "success";
        }
        tip = result;
        
        return "failure";
    }
    
	public void setService(ILoginService service) {
		this.service = service;
	}
	
	
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}

	
	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
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
	
	
    
}
