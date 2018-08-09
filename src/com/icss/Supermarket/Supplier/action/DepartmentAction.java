package com.icss.Supermarket.Supplier.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.icss.Supermarket.Supplier.domain.Supplier;
import com.icss.Supermarket.Supplier.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;

public class DepartmentAction {    
    private List<Supplier> result1;
    
    private Supplier supplier;
    private int id;

    private IDepartmentService service;

    public DepartmentAction() {
    }

    public DepartmentAction(IDepartmentService service) {

        this.service = service;
    }

    public String querySupplier() {
    	
        List<Supplier> department = service
                .queryBook();
        result1 = department;
       
        return "success";
    }
    
    public String doAddSupplier() {
      
    	 service.AddDepartment(supplier);
    	return querySupplier();
    }
   public String doGetSupplier() {
	   System.out.println("UserID"+id);
	   supplier = service.getDepartment(id);
        return "success";
    }

 public String doUpdateSupplier() {
	 HttpServletRequest req=ServletActionContext.getRequest();
	 HttpServletResponse res=ServletActionContext.getResponse();
	 
	 
	 	service.updateDepartment(supplier,req,res);
        return querySupplier();
    }

   public String doDeleteSupplier() {
	   HttpServletRequest req=ServletActionContext.getRequest();
		 HttpServletResponse res=ServletActionContext.getResponse();
        service.deleteDepartment(id,req,res);
        return querySupplier();
    }
    
	public List<Supplier> getResult1() {
	return result1;
}

public void setResult1(List<Supplier> result1) {
	this.result1 = result1;
}

	

	public Supplier getSupplier() {
	return supplier;
}

public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	


   

}
