package com.cjc.app.hl.master.main.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int stateId;
private String stateName;
private int stateCode;

@OneToOne(cascade=CascadeType.ALL)
private Country stateCountry;
public int getStateId() {
	return stateId;
}
public void setStateId(int stateId) {
	this.stateId = stateId;
}
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public int getStateCode() {
	return stateCode;
}
public void setStateCode(int stateCode) {
	this.stateCode = stateCode;
}
public Country getStateCountry() {
	return stateCountry;
}
public void setStateCountry(Country stateCountry) {
	this.stateCountry = stateCountry;
}


}
