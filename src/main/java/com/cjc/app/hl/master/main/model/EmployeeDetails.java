package com.cjc.app.hl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmployeeDetails 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String employeeName;	
	private String employeeMobileNo;
	private String employeeEmailId;
	private String employeeGender;
	private String employeeDoB;
	private String employeeDoJ;
	private String maritalStatus;
	private int statusCode;
	
	@JoinColumn(name="Emp_designationId")
	@OneToOne(cascade = CascadeType.ALL)
	private Designation employeeDesignation;	
	
	@JoinColumn(name="Emp_Addressid")
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeAddressDetails employeeAddress;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMobileNo() {
		return employeeMobileNo;
	}

	public void setEmployeeMobileNo(String employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}

	public String getEmployeeEmailId() {
		return employeeEmailId;
	}

	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeeDoB() {
		return employeeDoB;
	}

	public void setEmployeeDoB(String employeeDoB) {
		this.employeeDoB = employeeDoB;
	}

	public String getEmployeeDoJ() {
		return employeeDoJ;
	}

	public void setEmployeeDoJ(String employeeDoJ) {
		this.employeeDoJ = employeeDoJ;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Designation getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(Designation employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public EmployeeAddressDetails getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(EmployeeAddressDetails employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() 
	{
		return "EmployeeDetails [empId=" + empId + ", employeeName=" + employeeName + ", employeeMobileNo="
				+ employeeMobileNo + ", employeeEmailId=" + employeeEmailId + ", employeeGender=" + employeeGender
				+ ", employeeDoB=" + employeeDoB + ", employeeDoJ=" + employeeDoJ + ", maritalStatus=" + maritalStatus
				+ ", statusCode=" + statusCode + ", employeeDesignation=" + employeeDesignation + ", employeeAddress="
				+ employeeAddress + "]";
	}
	
	

}
