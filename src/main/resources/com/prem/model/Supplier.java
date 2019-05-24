package com.prem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="sup")
public class Supplier {
	@Id
	int supplierId;
	 @Column
	private String supplierName;
	 @Column
	 private String supplierDiscription;
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierDiscription() {
		return supplierDiscription;
	}
	public void setCategoryDiscription(String supplierDiscription) {
		this.supplierDiscription = supplierDiscription;
	}
	
	}
	
