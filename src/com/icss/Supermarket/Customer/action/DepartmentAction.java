package com.icss.Supermarket.Customer.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.icss.Supermarket.Customer.domain.Customer;
import com.icss.Supermarket.Customer.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;

public class DepartmentAction { 
	private String dep;
    private List<Customer> result;
    private List<Customer> result1;
    private Customer customer;
    private int id;

    private IDepartmentService service;

    public DepartmentAction() {
    }

    public DepartmentAction(IDepartmentService service) {

        this.service = service;
    }

    public String queryCustomer() {
    	System.out.println("dep:"+dep);
        List<Customer> department = service
                .queryBook(new Customer(0,dep,0,0,0,null,null));
        result = department;
       
        return "success";
    }
public String querySaleID() {
	HttpServletRequest req=ServletActionContext.getRequest();
        List<Customer> department = service
                .querySaleID();
        result1 = department;
        req.getSession().setAttribute("Customer", result1);
        return "success";
    }
    public String doAddCustomer() {
      
    	 service.AddDepartment(customer);
    	return queryCustomer();
    }
   public String doGetCustomer() {
	   System.out.println("UserID"+id);
	   customer = service.getDepartment(id);
        return "success";
    }

 public String doUpdateCustomer() {
	 HttpServletRequest req=ServletActionContext.getRequest();
	 HttpServletResponse res=ServletActionContext.getResponse();
	 
	 
	 	service.updateDepartment(customer,req,res);
        return queryCustomer();
    }

   public String doDeleteCustomer() {
	   HttpServletRequest req=ServletActionContext.getRequest();
		 HttpServletResponse res=ServletActionContext.getResponse();
        service.deleteDepartment(id,req,res);
        return queryCustomer();
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

	public List<Customer> getResult() {
		return result;
	}

	public void setResult(List<Customer> result) {
		this.result = result;
	}

	public List<Customer> getResult1() {
		return result1;
	}

	public void setResult1(List<Customer> result1) {
		this.result1 = result1;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

	


   

}
