package com.icss.Supermarket.ReturngoodsInfo.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.icss.Supermarket.ReturngoodsInfo.domain.ReturngoodsInfo;
import com.icss.Supermarket.ReturngoodsInfo.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;

public class DepartmentAction {    
    private List<ReturngoodsInfo> result3;
    private List<ReturngoodsInfo> list_1;
    private List<ReturngoodsInfo> list_2;
    private ReturngoodsInfo returngoodsInfo;
    private int id;

    private IDepartmentService service;

    public DepartmentAction() {
    }

    public DepartmentAction(IDepartmentService service) {

        this.service = service;
    }

    public String queryReturngoodsInfo() {
    	
        List<ReturngoodsInfo> department = service
                .queryBook();
        result3 = department;
       
        return "success";
    }
 
     public String querytwo() {
    	 HttpServletRequest req=ServletActionContext.getRequest();
    	
        List<ReturngoodsInfo> department = service
                .queryone();
        
        list_1 = department;
        req.getSession().setAttribute("list_1", list_1);
        System.out.println(list_1.get(0));
        
        List<ReturngoodsInfo> department1 = service
                .queryGoodsName();
        
        list_2 = department1;
        req.getSession().setAttribute("list_2", list_2);
        System.out.println(list_2.get(0));
        return "success";
    }
    public String doAddReturngoodsInfo() {
      
    	 service.AddDepartment(returngoodsInfo);
    	
    	return queryReturngoodsInfo();
    }
   public String doGetReturngoodsInfo() {
	   System.out.println("UserID"+id);
	   returngoodsInfo = service.getDepartment(id);
        return "success";
    }

 public String doUpdateReturngoodsInfo() {
	 HttpServletRequest req=ServletActionContext.getRequest();
	 HttpServletResponse res=ServletActionContext.getResponse();
	 
	 
	 	service.updateDepartment(returngoodsInfo,req,res);
        return queryReturngoodsInfo();
    }

   public String doDeleteReturngoodsInfo() {
	   HttpServletRequest req=ServletActionContext.getRequest();
		 HttpServletResponse res=ServletActionContext.getResponse();
        service.deleteDepartment(id,req,res);
        return queryReturngoodsInfo();
    }
    






public List<ReturngoodsInfo> getResult3() {
	return result3;
}

public void setResult3(List<ReturngoodsInfo> result3) {
	this.result3 = result3;
}

public List<ReturngoodsInfo> getList_1() {
	return list_1;
}

public void setList_1(List<ReturngoodsInfo> list_1) {
	this.list_1 = list_1;
}

public List<ReturngoodsInfo> getList_2() {
	return list_2;
}

public void setList_2(List<ReturngoodsInfo> list_2) {
	this.list_2 = list_2;
}

public ReturngoodsInfo getReturngoodsInfo() {
	return returngoodsInfo;
}

public void setReturngoodsInfo(ReturngoodsInfo returngoodsInfo) {
	this.returngoodsInfo = returngoodsInfo;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

	

	

	


   

}
