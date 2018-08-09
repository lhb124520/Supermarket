package com.icss.Supermarket.StockInfo.domain;

public class StockInfo {
private int StockID;
private String GoodsName;
private String SupplierName;
private String StoreName;
private int StoreNum;
private int WarnNum;

    

public StockInfo() {
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



public int getWarnNum() {
	return WarnNum;
}



public void setWarnNum(int warnNum) {
	WarnNum = warnNum;
}



public StockInfo(int stockID, String goodsName, String supplierName, String storeName, int storeNum, int warnNum) {
	super();
	StockID = stockID;
	GoodsName = goodsName;
	SupplierName = supplierName;
	StoreName = storeName;
	StoreNum = storeNum;
	WarnNum = warnNum;
}



@Override
public String toString() {
	return "StockInfo [StockID=" + StockID + ", GoodsName=" + GoodsName + ", SupplierName=" + SupplierName
			+ ", StoreName=" + StoreName + ", StoreNum=" + StoreNum + ", WarnNum=" + WarnNum + "]";
}






}
