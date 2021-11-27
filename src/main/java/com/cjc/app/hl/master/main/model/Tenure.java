package com.cjc.app.hl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tenure {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tenureId;	
	
	private int noOfYears;	
	private int status;
	public int getTenureId() {
		return tenureId;
	}
	public void setTenureId(int tenureId) {
		this.tenureId = tenureId;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Tenure [tenureId=" + tenureId + ", noOfYears=" + noOfYears + ", status=" + status + "]";
	}
	

	

}
