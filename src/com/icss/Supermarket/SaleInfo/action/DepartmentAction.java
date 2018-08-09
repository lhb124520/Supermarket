package com.icss.Supermarket.SaleInfo.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.icss.Supermarket.SaleInfo.domain.SaleInfo;
import com.icss.Supermarket.SaleInfo.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;

public class DepartmentAction {    
    private List<SaleInfo> result5;
   
   
   

    private IDepartmentService service;

    public DepartmentAction() {
    }

    public DepartmentAction(IDepartmentService service) {

        this.service = service;
    }

    public String querySaleInfo() {
    	
        List<SaleInfo> department = service
                .queryBook();
        result5 = department;
       
        return "success";
    }

	public List<SaleInfo> getResult5() {
		return result5;
	}

	public void setResult5(List<SaleInfo> result5) {
		this.result5 = result5;
	}

	
	


   

}
