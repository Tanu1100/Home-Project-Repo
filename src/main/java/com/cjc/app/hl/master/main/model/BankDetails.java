package com.cjc.app.hl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class BankDetails {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bId;
	private  String bankAccountNo;
	private String bankAccountHolderName;
	@OneToOne(cascade = CascadeType.ALL)
	private BranchDetails bankBranch;
	private  int status;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}
	public void setBankAccountHolderName(String bankAccountHolderName) {
		this.bankAccountHolderName = bankAccountHolderName;
	}
	public BranchDetails getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(BranchDetails bankBranch) {
		this.bankBranch = bankBranch;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BankDetails [bId=" + bId + ", bankAccountNo=" + bankAccountNo + ", bankAccountHolderName="
				+ bankAccountHolderName + ", bankBranch=" + bankBranch + ", status=" + status + "]";
	}




}
