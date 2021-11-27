package com.cjc.app.hl.master.main.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int cityId;
private String cityName;
private int cityCode;

@OneToOne(cascade=CascadeType.ALL)
private State cityState;

public int getCityId() {
	return cityId;
}
public void setCityId(int cityId) {
	this.cityId = cityId;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public int getCityCode() {
	return cityCode;
}
public void setCityCode(int cityCode) {
	this.cityCode = cityCode;
}
public State getCityState() {
	return cityState;
}
public void setCityState(State cityState) {
	this.cityState = cityState;
}
@Override
public String toString() {
	return "City [cityId=" + cityId + ", cityName=" + cityName + ", cityCode=" + cityCode + ", cityState=" + cityState
			+ "]";
}


}
