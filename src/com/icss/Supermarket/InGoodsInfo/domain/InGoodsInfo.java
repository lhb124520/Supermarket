package com.icss.Supermarket.InGoodsInfo.domain;

public class InGoodsInfo {
private int GoodsID;
private String UserName;
private String SupplierName;
private String StoreName;
private String GoodsName;
private float GoodsInPrice;
private int GoodsNum;

    

public InGoodsInfo() {
	super();
	// TODO Auto-generated constructor stub
}



public int getGoodsID() {
	return GoodsID;
}



public void setGoodsID(int goodsID) {
	GoodsID = goodsID;
}



public String getUserName() {
	return UserName;
}



public void setUserName(String userName) {
	UserName = userName;
}



public String getSupplierName() {
	return SupplierName;
}



public void setSupplierName(String supplierName) {
	SupplierName = supplierName;
}



public String getStoreName() {
	return StoreName;
}



public void setStoreName(String storeName) {
	StoreName = storeName;
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



@Override
public String toString() {
	return "InGoodsInfo [GoodsID=" + GoodsID + ", UserName=" + UserName + ", SupplierName=" + SupplierName
			+ ", StoreName=" + StoreName + ", GoodsName=" + GoodsName + ", GoodsInPrice=" + GoodsInPrice + ", GoodsNum="
			+ GoodsNum + "]";
}



public InGoodsInfo(int goodsID, String userName, String supplierName, String storeName, String goodsName,
		float goodsInPrice, int goodsNum) {
	super();
	GoodsID = goodsID;
	UserName = userName;
	SupplierName = supplierName;
	StoreName = storeName;
	GoodsName = goodsName;
	GoodsInPrice = goodsInPrice;
	GoodsNum = goodsNum;
}











}
