package com.cjc.app.hl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeAddressDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String employeeHouseNo;
	private String employeeStreetName;
	private String employeeArea;
	private String employeeLandmark;
	private String employeeCity;
	private String employeeTaluka;
	private String employeeDistrict;
	private String employeeState;
	private int employeePincode;
	private String employeeCountry;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeHouseNo() {
		return employeeHouseNo;
	}
	public void setEmployeeHouseNo(String employeeHouseNo) {
		this.employeeHouseNo = employeeHouseNo;
	}
	public String getEmployeeStreetName() {
		return employeeStreetName;
	}
	public void setEmployeeStreetName(String employeeStreetName) {
		this.employeeStreetName = employeeStreetName;
	}
	public String getEmployeeArea() {
		return employeeArea;
	}
	public void setEmployeeArea(String employeeArea) {
		this.employeeArea = employeeArea;
	}
	public String getEmployeeLandmark() {
		return employeeLandmark;
	}
	public void setEmployeeLandmark(String employeeLandmark) {
		this.employeeLandmark = employeeLandmark;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	public String getEmployeeTaluka() {
		return employeeTaluka;
	}
	public void setEmployeeTaluka(String employeeTaluka) {
		this.employeeTaluka = employeeTaluka;
	}
	public String getEmployeeDistrict() {
		return employeeDistrict;
	}
	public void setEmployeeDistrict(String employeeDistrict) {
		this.employeeDistrict = employeeDistrict;
	}
	public String getEmployeeState() {
		return employeeState;
	}
	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}
	public int getEmployeePincode() {
		return employeePincode;
	}
	public void setEmployeePincode(int employeePincode) {
		this.employeePincode = employeePincode;
	}
	public String getEmployeeCountry() {
		return employeeCountry;
	}
	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}
	@Override
	public String toString() {
		return "EmployeeAddressDetails [empId=" + empId + ", employeeHouseNo=" + employeeHouseNo
				+ ", employeeStreetName=" + employeeStreetName + ", employeeArea=" + employeeArea
				+ ", employeeLandmark=" + employeeLandmark + ", employeeCity=" + employeeCity + ", employeeTaluka="
				+ employeeTaluka + ", employeeDistrict=" + employeeDistrict + ", employeeState=" + employeeState
				+ ", employeePincode=" + employeePincode + ", employeeCountry=" + employeeCountry + "]";
	}


}
