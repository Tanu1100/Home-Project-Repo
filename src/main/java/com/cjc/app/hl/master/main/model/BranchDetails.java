package com.cjc.app.hl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class BranchDetails {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int branchId;
	private String branchName;
	private	String branchType;
	private	String branchIfscCode;
	private Long micrCode;
	private	int branchCode;
	private	Long branchContactNo;
	private	 String branchEmailId;
	@OneToOne(cascade = CascadeType.ALL)
	private	BranchAddressDetails branchAddress;
	private	int branchStatus;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getBranchIfscCode() {
		return branchIfscCode;
	}
	public void setBranchIfscCode(String branchIfscCode) {
		this.branchIfscCode = branchIfscCode;
	}
	public Long getMicrCode() {
		return micrCode;
	}
	public void setMicrCode(Long micrCode) {
		this.micrCode = micrCode;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public Long getBranchContactNo() {
		return branchContactNo;
	}
	public void setBranchContactNo(Long branchContactNo) {
		this.branchContactNo = branchContactNo;
	}
	public String getBranchEmailId() {
		return branchEmailId;
	}
	public void setBranchEmailId(String branchEmailId) {
		this.branchEmailId = branchEmailId;
	}
	public BranchAddressDetails getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(BranchAddressDetails branchAddress) {
		this.branchAddress = branchAddress;
	}
	public int getBranchStatus() {
		return branchStatus;
	}
	public void setBranchStatus(int branchStatus) {
		this.branchStatus = branchStatus;
	}
	@Override
	public String toString() {
		return "BranchDetails [branchId=" + branchId + ", branchName=" + branchName + ", branchType=" + branchType
				+ ", branchIfscCode=" + branchIfscCode + ", micrCode=" + micrCode + ", branchCode=" + branchCode
				+ ", branchContactNo=" + branchContactNo + ", branchEmailId=" + branchEmailId + ", branchAddress="
				+ branchAddress + ", branchStatus=" + branchStatus + "]";
	}




}
