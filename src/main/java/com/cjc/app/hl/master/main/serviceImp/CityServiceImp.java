package com.cjc.app.hl.master.main.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.hl.master.main.model.City;
import com.cjc.app.hl.master.main.repository.CityRepository;
import com.cjc.app.hl.master.main.serviceI.CityService;




@Service
public class CityServiceImp implements CityService {
	@Autowired
	CityRepository crr;
	@Override
	public City saveCityData(City c) {
		  return crr.save(c);
		  }
	@Override
	public List<City> getAllCityData() {
		
		return (List<City>) crr.findAll() ;
	}
	@Override
	public void deleteData(int id) {
		
		crr.deleteById(id);
	
		
	}
	@Override
	public List<City> getdata(int cityid) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
