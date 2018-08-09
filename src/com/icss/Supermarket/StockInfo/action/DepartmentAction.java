package com.icss.Supermarket.StockInfo.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.icss.Supermarket.StockInfo.domain.StockInfo;
import com.icss.Supermarket.StockInfo.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;

public class DepartmentAction {    
    private List<StockInfo> result2;
    private List<StockInfo> list;
    private List<StockInfo> list1;
    private StockInfo stockInfo;
    private int id;

    private IDepartmentService service;

    public DepartmentAction() {
    }

    public DepartmentAction(IDepartmentService service) {

        this.service = service;
    }

    public String queryStockInfo() {
    	
        List<StockInfo> department = service
                .queryBook();
        result2 = department;
       
        return "success";
    }
 
     public String queryone() {
    	 HttpServletRequest req=ServletActionContext.getRequest();
    	
        List<StockInfo> department = service
                .queryone();
        
        list = department;
        req.getSession().setAttribute("list", list);
        System.out.println(list.get(0));
        
        List<StockInfo> department1 = service
                .queryGoodsName();
        
        list1 = department1;
        req.getSession().setAttribute("list1", list1);
        System.out.println(list1.get(0));
        return "success";
    }
    public String doAddStockInfo() {
      
    	 service.AddDepartment(stockInfo);
    	 System.out.println(stockInfo.getGoodsName());
    	return queryStockInfo();
    }
   public String doGetStockInfo() {
	   System.out.println("UserID"+id);
	   stockInfo = service.getDepartment(id);
        return "success";
    }

 public String doUpdateStockInfo() {
	 HttpServletRequest req=ServletActionContext.getRequest();
	 HttpServletResponse res=ServletActionContext.getResponse();
	 
	 
	 	service.updateDepartment(stockInfo,req,res);
        return queryStockInfo();
    }

   public String doDeleteStockInfo() {
	   HttpServletRequest req=ServletActionContext.getRequest();
		 HttpServletResponse res=ServletActionContext.getResponse();
        service.deleteDepartment(id,req,res);
        return queryStockInfo();
    }
    


public List<StockInfo> getResult2() {
	return result2;
}

public void setResult2(List<StockInfo> result2) {
	this.result2 = result2;
}

public List<StockInfo> getList1() {
	return list1;
}

public void setList1(List<StockInfo> list1) {
	this.list1 = list1;
}

public List<StockInfo> getList() {
	return list;
}

public void setList(List<StockInfo> list) {
	this.list = list;
}

public StockInfo getStockInfo() {
	return stockInfo;
}

public void setStockInfo(StockInfo stockInfo) {
	this.stockInfo = stockInfo;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

	

	

	


   

}
