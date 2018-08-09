package com.icss.Supermarket.Customer_Login.service.impl;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.icss.Supermarket.Customer_Login.dao.ILoginDao;
import com.icss.Supermarket.Customer_Login.domain.Customer;
import com.icss.Supermarket.Customer_Login.service.ILoginService;



public class LoginService implements ILoginService{
    
    private ILoginDao dao;
    
    /*public LoginService(){
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("/dbConf.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(is).openSession();
        dao = session.getMapper(ILoginDao.class);
    }*/
    
    @Override
    public String login(Customer user) {
       HttpServletRequest req=ServletActionContext.getRequest();
       Customer _user = dao.getUser(user.getUserName());
       
        // logic
        if (_user == null)
            return "has no user " +user.getUserName();
        if (!_user.getPassword().equals(user.getPassword()))
            return "invalida password";
        req.getSession().setAttribute("UserID", user.getUserID());        
        req.getSession().setAttribute("username",  _user.getUserName());
        req.getSession().setAttribute("password",  _user.getPassword());
        req.getSession().setAttribute("Sex",  _user.getSex());
        req.getSession().setAttribute("Phone",  _user.getPhone());
        req.getSession().setAttribute("Address",  _user.getAddress());
        req.getSession().setAttribute("Position",  _user.getPosition());
        
        return "login success";
    }

    public void setDao(ILoginDao dao) {
        this.dao = dao;
    }
}
        