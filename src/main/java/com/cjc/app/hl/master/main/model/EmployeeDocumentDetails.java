package com.cjc.app.hl.master.main.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class EmployeeDocumentDetails {

	@Id
	private int emp_id;
	
	@Lob
	private byte[] aadharCard;
	
	@Lob
	private byte[] panCard;
	
	@Lob
	private byte[] photo;

	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public byte[] getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(byte[] aadharCard) {
		this.aadharCard = aadharCard;
	}

	public byte[] getPanCard() {
		return panCard;
	}

	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "EmployeeDocumentDetails [empId=" + emp_id + ", aadharCard=" + Arrays.toString(aadharCard) + ", panCard="
				+ Arrays.toString(panCard) + ", photo=" + Arrays.toString(photo) + "]";
	}
	
	
	
}
