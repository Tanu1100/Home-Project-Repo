package com.cjc.app.hl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Designation {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int designationId;
	
	private String designationName;
	private int designationStatusCode;
	private String designationStatusRemark;
	
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public int getDesignationStatusCode() {
		return designationStatusCode;
	}
	public void setDesignationStatusCode(int designationStatusCode) {
		this.designationStatusCode = designationStatusCode;
	}
	public String getDesignationStatusRemark() {
		return designationStatusRemark;
	}
	public void setDesignationStatusRemark(String designationStatusRemark) {
		this.designationStatusRemark = designationStatusRemark;
	}

	
	
	@Override
	public String toString() {
		return "Designation [designationId=" + designationId + ", designationName=" + designationName
				+ ", designationStatusCode=" + designationStatusCode + ", designationStatusRemark="
				+ designationStatusRemark + "]";
	}


}
