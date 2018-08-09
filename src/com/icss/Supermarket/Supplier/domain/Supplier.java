package com.icss.Supermarket.Supplier.domain;

public class Supplier {
private int SupplierID;
private String SupplierName;
private String ContactsName;
private String ContactsPhone;
private String SupplierAddress;
private String Remarks;

    

public Supplier() {
	super();
	// TODO Auto-generated constructor stub
}



public int getSupplierID() {
	return SupplierID;
}



public void setSupplierID(int supplierID) {
	SupplierID = supplierID;
}



public String getSupplierName() {
	return SupplierName;
}



public void setSupplierName(String supplierName) {
	SupplierName = supplierName;
}



public String getContactsName() {
	return ContactsName;
}



public void setContactsName(String contactsName) {
	ContactsName = contactsName;
}



public String getContactsPhone() {
	return ContactsPhone;
}



public void setContactsPhone(String contactsPhone) {
	ContactsPhone = contactsPhone;
}



public String getSupplierAddress() {
	return SupplierAddress;
}



public void setSupplierAddress(String supplierAddress) {
	SupplierAddress = supplierAddress;
}



public String getRemarks() {
	return Remarks;
}



public void setRemarks(String remarks) {
	Remarks = remarks;
}



public Supplier(int supplierID, String supplierName, String contactsName, String contactsPhone, String supplierAddress,
		String remarks) {
	super();
	SupplierID = supplierID;
	SupplierName = supplierName;
	ContactsName = contactsName;
	ContactsPhone = contactsPhone;
	SupplierAddress = supplierAddress;
	Remarks = remarks;
}



@Override
public String toString() {
	return "Supplier [SupplierID=" + SupplierID + ", SupplierName=" + SupplierName + ", ContactsName=" + ContactsName
			+ ", ContactsPhone=" + ContactsPhone + ", SupplierAddress=" + SupplierAddress + ", Remarks=" + Remarks
			+ "]";
}




}
