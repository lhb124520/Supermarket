package com.icss.Supermarket.InGoodsInfo.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.icss.Supermarket.InGoodsInfo.domain.InGoodsInfo;
import com.icss.Supermarket.InGoodsInfo.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;

public class DepartmentAction {    
    private List<InGoodsInfo> result4;
   
    private InGoodsInfo returngoodsInfo;
   

    private IDepartmentService service;

    public DepartmentAction() {
    }

    public DepartmentAction(IDepartmentService service) {

        this.service = service;
    }

    public String queryInGoodsInfo() {
    	
        List<InGoodsInfo> department = service
                .queryBook();
        result4 = department;
       
        return "success";
    }

	public List<InGoodsInfo> getResult4() {
		return result4;
	}

	public void setResult4(List<InGoodsInfo> result4) {
		this.result4 = result4;
	}

	public InGoodsInfo getReturngoodsInfo() {
		return returngoodsInfo;
	}

	public void setReturngoodsInfo(InGoodsInfo returngoodsInfo) {
		this.returngoodsInfo = returngoodsInfo;
	}
 
     




	

	

	


   

}
