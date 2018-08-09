package com.icss.Supermarket.login.service.impl;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.icss.Supermarket.login.dao.ILoginDao;
import com.icss.Supermarket.login.domain.User;
import com.icss.Supermarket.login.service.ILoginService;

public class LoginService implements ILoginService{
    
    private ILoginDao dao;
    
    /*public LoginService(){
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("/dbConf.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(is).openSession();
        dao = session.getMapper(ILoginDao.class);
    }*/
    
    @Override
    public String login(User user) {
       HttpServletRequest req=ServletActionContext.getRequest();
        User _user = dao.getUserByName(user.getUserID());
       
        // logic
        if (_user == null)
            return "has no user " +user.getUserID();
        if (!_user.getPassword().equals(user.getPassword()))
            return "invalida password";
        req.getSession().setAttribute("UserID", user.getUserID());        
        req.getSession().setAttribute("username",  _user.getUsername());
        req.getSession().setAttribute("password",  _user.getPassword());
        req.getSession().setAttribute("Sex",  _user.getSex());
        req.getSession().setAttribute("Phone",  _user.getPhone());
        req.getSession().setAttribute("Address",  _user.getAddress());
        req.getSession().setAttribute("Position",  _user.getPosition());
        if (_user.getPosition().equals("系统管理员"))
            return "login Admin";
        if (_user.getPosition().equals("收银员"))
            return "login Cashier";
        if (_user.getPosition().equals("采购员"))
            return "login Buyer";
        if (_user.getPosition().equals("顾客"))
            return "login Customer";
        return "login success";
    }

    public void setDao(ILoginDao dao) {
        this.dao = dao;
    }
}
        