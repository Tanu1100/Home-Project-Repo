package com.cjc.app.hl.master.main.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BranchAddressDetails {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	int branchAddressId;
	private	String branchHouseNo;
	private	String branchStreetName;
	private String branchArea;
	private	String branchLandmark;
	@OneToOne(cascade = CascadeType.ALL)
	private City branchCity;
	private String branchTaluka;
	private	String branchDistrict;
	private	String branchState;
	private	String branchCountry;
	private	int branchPincode;
	public int getBranchAddressId() {
		return branchAddressId;
	}
	public void setBranchAddressId(int branchAddressId) {
		this.branchAddressId = branchAddressId;
	}
	public String getBranchHouseNo() {
		return branchHouseNo;
	}
	public void setBranchHouseNo(String branchHouseNo) {
		this.branchHouseNo = branchHouseNo;
	}
	public String getBranchStreetName() {
		return branchStreetName;
	}
	public void setBranchStreetName(String branchStreetName) {
		this.branchStreetName = branchStreetName;
	}
	public String getBranchArea() {
		return branchArea;
	}
	public void setBranchArea(String branchArea) {
		this.branchArea = branchArea;
	}
	public String getBranchLandmark() {
		return branchLandmark;
	}
	public void setBranchLandmark(String branchLandmark) {
		this.branchLandmark = branchLandmark;
	}
	public City getBranchCity() {
		return branchCity;
	}
	public void setBranchCity(City branchCity) {
		this.branchCity = branchCity;
	}
	public String getBranchTaluka() {
		return branchTaluka;
	}
	public void setBranchTaluka(String branchTaluka) {
		this.branchTaluka = branchTaluka;
	}
	public String getBranchDistrict() {
		return branchDistrict;
	}
	public void setBranchDistrict(String branchDistrict) {
		this.branchDistrict = branchDistrict;
	}
	public String getBranchState() {
		return branchState;
	}
	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}
	public String getBranchCountry() {
		return branchCountry;
	}
	public void setBranchCountry(String branchCountry) {
		this.branchCountry = branchCountry;
	}
	public int getBranchPincode() {
		return branchPincode;
	}
	public void setBranchPincode(int branchPincode) {
		this.branchPincode = branchPincode;
	}
	@Override
	public String toString() {
		return "BranchAddressDetails [branchAddressId=" + branchAddressId + ", branchHouseNo=" + branchHouseNo
				+ ", branchStreetName=" + branchStreetName + ", branchArea=" + branchArea + ", branchLandmark="
				+ branchLandmark + ", branchCity=" + branchCity + ", branchTaluka=" + branchTaluka + ", branchDistrict="
				+ branchDistrict + ", branchState=" + branchState + ", branchCountry=" + branchCountry
				+ ", branchPincode=" + branchPincode + "]";
	}
	
	
	
	

}
