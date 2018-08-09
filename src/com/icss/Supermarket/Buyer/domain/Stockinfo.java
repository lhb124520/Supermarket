package com.icss.Supermarket.Buyer.domain;

public class Stockinfo {
private int StockID;
private String GoodsName;
private String SupplierName;
private String StoreName;
private int StoreNum;


    

public Stockinfo() {
	super();
	// TODO Auto-generated constructor stub
}




public int getStockID() {
	return StockID;
}




public void setStockID(int stockID) {
	StockID = stockID;
}




public String getGoodsName() {
	return GoodsName;
}




public void setGoodsName(String goodsName) {
	GoodsName = goodsName;
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




public int getStoreNum() {
	return StoreNum;
}




public void setStoreNum(int storeNum) {
	StoreNum = storeNum;
}




@Override
public String toString() {
	return "Stockinfo [StockID=" + StockID + ", GoodsName=" + GoodsName + ", SupplierName=" + SupplierName
			+ ", StoreName=" + StoreName + ", StoreNum=" + StoreNum + "]";
}




public Stockinfo(int stockID, String goodsName, String supplierName, String storeName, int storeNum) {
	super();
	StockID = stockID;
	GoodsName = goodsName;
	SupplierName = supplierName;
	StoreName = storeName;
	StoreNum = storeNum;
}












}
