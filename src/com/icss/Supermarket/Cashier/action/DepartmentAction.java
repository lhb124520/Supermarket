package com.icss.Supermarket.Cashier.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.icss.Supermarket.Cashier.domain.Cashier;
import com.icss.Supermarket.Cashier.domain.GoodsInfo;
import com.icss.Supermarket.Cashier.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;

public class DepartmentAction { 
	private String dep;
    private List<Cashier> result;
    private List<GoodsInfo> result1;
    private List<GoodsInfo> result2;
    private Cashier cashier;
    private GoodsInfo goodsInfo;
    private int id;
    private String GoodName;
    private int Balance;
    private int GoodsId;

    private IDepartmentService service;

    public DepartmentAction() {
    }

    public DepartmentAction(IDepartmentService service) {

        this.service = service;
    }

    public String queryCashier() {
    	
        List<Cashier> department = service
                .queryBook(new Cashier(0,dep,null,0,0,null));
        result = department;
        
        return "success";
    }
public String queryGoods() {
	HttpServletRequest req=ServletActionContext.getRequest();
        List<GoodsInfo> department = service
                .queryGoods();
        result1 = department;
        System.out.println(GoodsId);
        goodsInfo=service.queryByID(GoodsId);
        /*req.setAttribute("r1", result1);*/
        /*req.getSession().setAttribute("r1", result1);*/
        return "success";
    }


public String queryGoodsNum() {
	HttpServletRequest req=ServletActionContext.getRequest();
	
	
	int Num=service.queryGoodsNum(GoodName);

	req.setAttribute("Num", Num);
        return "success";
    }

    public String doAddCashier() {
      
    	 service.AddDepartment(cashier);
    	 service.updateDepartment1(Balance,cashier.getGoodsName());
    	return queryCashier();
    }
   public String doGetCashier() {
	  
	   cashier = service.getDepartment(id);
        return "success";
    }

 public String doUpdateCashier() {
	 HttpServletRequest req=ServletActionContext.getRequest();
	 HttpServletResponse res=ServletActionContext.getResponse();
	 
	 
	 	service.updateDepartment(cashier,req,res);
	 	service.updateDepartment1(Balance,cashier.getGoodsName());
        return queryCashier();
    }

   public String doDeleteCashier() {
	   HttpServletRequest req=ServletActionContext.getRequest();
		 HttpServletResponse res=ServletActionContext.getResponse();
        service.deleteDepartment(id,req,res);
        return queryCashier();
    }
    
	

	public List<Cashier> getResult() {
	return result;
}

public void setResult(List<Cashier> result) {
	this.result = result;
}

public List<GoodsInfo> getResult1() {
	return result1;
}

public void setResult1(List<GoodsInfo> result1) {
	this.result1 = result1;
}

public Cashier getCashier() {
	return cashier;
}

public void setCashier(Cashier cashier) {
	this.cashier = cashier;
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

	public String getGoodName() {
		return GoodName;
	}

	public void setGoodName(String goodName) {
		GoodName = goodName;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public int getGoodsId() {
		return GoodsId;
	}

	public void setGoodsId(int goodsId) {
		GoodsId = goodsId;
	}

	public GoodsInfo getInGoodsInfo() {
		return goodsInfo;
	}

	public void setInGoodsInfo(GoodsInfo inGoodsInfo) {
		this.goodsInfo = inGoodsInfo;
	}

	public List<GoodsInfo> getResult2() {
		return result2;
	}

	public void setResult2(List<GoodsInfo> result2) {
		this.result2 = result2;
	}

	public GoodsInfo getGoodsInfo() {
		return goodsInfo;
	}

	public void setGoodsInfo(GoodsInfo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	





	

	


   

}
