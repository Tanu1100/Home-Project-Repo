package com.cjc.app.hl.master.main.serviceI;

import java.util.List;

import com.cjc.app.hl.master.main.model.City;



public interface CityService {
	public City saveCityData(City c) ;
	public List<City> getAllCityData();
   
    public void deleteData(int id);
	public List<City> getdata(int cityid);

}
