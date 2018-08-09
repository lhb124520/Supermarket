package com.icss.Supermarket.Buyer.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.icss.Supermarket.Buyer.domain.Buyer;
import com.icss.Supermarket.Buyer.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;

public class DepartmentAction { 
	private String dep;
    private List<Buyer> result;
    private List<Buyer> result1;
    private Buyer buyer;
    private int id;

    private IDepartmentService service;

    public DepartmentAction() {
    }

    public DepartmentAction(IDepartmentService service) {

        this.service = service;
    }

    public String queryBuyer() {
    	System.out.println("dep:"+dep);
        List<Buyer> department = service
                .queryBook(new Buyer(0,dep,null,null,null,0,0));
        result = department;
       
        return "success";
    }
public String querySupplierName() {
	HttpServletRequest req=ServletActionContext.getRequest();
        List<Buyer> department = service
                .queryGoods();
        result1 = department;
        req.getSession().setAttribute("r1", result1);
        return "success";
    }
    public String doAddBuyer() {
      
    	 service.AddDepartment(buyer);
    	 service.insert1(buyer);
    	return queryBuyer();
    }
   public String doGetBuyer() {
	   System.out.println("UserID"+id);
	   buyer = service.getDepartment(id);
        return "success";
    }

 public String doUpdateBuyer() {
	 HttpServletRequest req=ServletActionContext.getRequest();
	 HttpServletResponse res=ServletActionContext.getResponse();
	 
	 
	 	service.updateDepartment(buyer,req,res);
	 	service.updateDepartment1(buyer,req,res);
        return queryBuyer();
    }

   public String doDeleteBuyer() {
	   HttpServletRequest req=ServletActionContext.getRequest();
		 HttpServletResponse res=ServletActionContext.getResponse();
        service.deleteDepartment(id,req,res);
        service.deleteDepartment1(id,req,res);
        return queryBuyer();
    }
    
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public List<Buyer> getResult() {
		return result;
	}

	public void setResult(List<Buyer> result) {
		this.result = result;
	}

	public List<Buyer> getResult1() {
		return result1;
	}

	public void setResult1(List<Buyer> result1) {
		this.result1 = result1;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	

	


   

}
