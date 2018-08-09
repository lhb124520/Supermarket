package com.icss.Supermarket.UserInfo.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.icss.Supermarket.UserInfo.domain.User;
import com.icss.Supermarket.UserInfo.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;

public class DepartmentAction {    
    private List<User> result;
    private User user;
    private int id;

    private IDepartmentService service;

    public DepartmentAction() {
    }

    public DepartmentAction(IDepartmentService service) {

        this.service = service;
    }

    public String queryBook() {
    	
        List<User> department = service
                .queryBook();
        result = department;
       
        return "success";
    }
    public String doAddDepartment() {
      
    	 service.AddDepartment(user);
    	return queryBook();
    }
   public String doGetDepartment() {
	   System.out.println("UserID"+id);
	   user = service.getDepartment(id);
        return "success";
    }

 public String doUpdateDepartment() {
	 HttpServletRequest req=ServletActionContext.getRequest();
	 HttpServletResponse res=ServletActionContext.getResponse();
	 
	 
	 	service.updateDepartment(user,req,res);
        return queryBook();
    }

   public String doDeleteDepartment() {
	   HttpServletRequest req=ServletActionContext.getRequest();
		 HttpServletResponse res=ServletActionContext.getResponse();
        service.deleteDepartment(id,req,res);
        return queryBook();
    }
    

  

    

	public List<User> getResult() {
        return result;
    }

    public void setResult(List<User> result) {
        this.result = result;
    }

    

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	


   

}
