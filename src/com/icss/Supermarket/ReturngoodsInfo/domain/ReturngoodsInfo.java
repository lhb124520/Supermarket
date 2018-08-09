package com.icss.Supermarket.ReturngoodsInfo.domain;

public class ReturngoodsInfo {
private int ReturngoodsID;
private String UserName;
private int SaleID;
private float ReturnGoodsInPrice;
private int ReturnGoodsNum;
private String ReturnGoodsReason;
private String advice;

    

public ReturngoodsInfo() {
	super();
	// TODO Auto-generated constructor stub
}



public int getReturngoodsID() {
	return ReturngoodsID;
}



public void setReturngoodsID(int returngoodsID) {
	ReturngoodsID = returngoodsID;
}



public int getSaleID() {
	return SaleID;
}



public void setSaleID(int saleID) {
	SaleID = saleID;
}






public String getUserName() {
	return UserName;
}



public void setUserName(String userName) {
	UserName = userName;
}



public float getReturnGoodsInPrice() {
	return ReturnGoodsInPrice;
}



public void setReturnGoodsInPrice(float returnGoodsInPrice) {
	ReturnGoodsInPrice = returnGoodsInPrice;
}



public int getReturnGoodsNum() {
	return ReturnGoodsNum;
}



public void setReturnGoodsNum(int returnGoodsNum) {
	ReturnGoodsNum = returnGoodsNum;
}



public String getReturnGoodsReason() {
	return ReturnGoodsReason;
}



public void setReturnGoodsReason(String returnGoodsReason) {
	ReturnGoodsReason = returnGoodsReason;
}



public String getAdvice() {
	return advice;
}



public void setAdvice(String advice) {
	this.advice = advice;
}



@Override
public String toString() {
	return "ReturngoodsInfo [ReturngoodsID=" + ReturngoodsID + ", UserName=" + UserName + ", SaleID=" + SaleID
			+ ", ReturnGoodsInPrice=" + ReturnGoodsInPrice + ", ReturnGoodsNum=" + ReturnGoodsNum
			+ ", ReturnGoodsReason=" + ReturnGoodsReason + ", advice=" + advice + "]";
}



public ReturngoodsInfo(int returngoodsID, String userName, int saleID, float returnGoodsInPrice, int returnGoodsNum,
		String returnGoodsReason, String advice) {
	super();
	ReturngoodsID = returngoodsID;
	UserName = userName;
	SaleID = saleID;
	ReturnGoodsInPrice = returnGoodsInPrice;
	ReturnGoodsNum = returnGoodsNum;
	ReturnGoodsReason = returnGoodsReason;
	this.advice = advice;
}












}
