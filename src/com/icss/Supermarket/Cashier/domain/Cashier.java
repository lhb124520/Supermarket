package com.icss.Supermarket.Cashier.domain;

public class Cashier {
private int SaleID;
private String UserName;
private String GoodsName;
private float GoodsInPrice;
private int GoodsNum;
private String GoodsTime;


    

public Cashier() {
	super();
	// TODO Auto-generated constructor stub
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




public String getGoodsName() {
	return GoodsName;
}




public void setGoodsName(String goodsName) {
	GoodsName = goodsName;
}




public float getGoodsInPrice() {
	return GoodsInPrice;
}




public void setGoodsInPrice(float goodsInPrice) {
	GoodsInPrice = goodsInPrice;
}




public int getGoodsNum() {
	return GoodsNum;
}




public void setGoodsNum(int goodsNum) {
	GoodsNum = goodsNum;
}




public String getGoodsTime() {
	return GoodsTime;
}




public void setGoodsTime(String goodsTime) {
	GoodsTime = goodsTime;
}




@Override
public String toString() {
	return "SaleInfo [SaleID=" + SaleID + ", UserName=" + UserName + ", GoodsName=" + GoodsName + ", GoodsInPrice="
			+ GoodsInPrice + ", GoodsNum=" + GoodsNum + ", GoodsTime=" + GoodsTime + "]";
}




public Cashier(int saleID, String userName, String goodsName, float goodsInPrice, int goodsNum, String goodsTime) {
	super();
	SaleID = saleID;
	UserName = userName;
	GoodsName = goodsName;
	GoodsInPrice = goodsInPrice;
	GoodsNum = goodsNum;
	GoodsTime = goodsTime;
}







}
