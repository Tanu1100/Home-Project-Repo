package com.cjc.app.hl.master.main.serviceI;

import java.util.List;

import com.cjc.app.hl.master.main.model.Country;



public interface CountryService {
	public Country saveCountryData(Country c) ;
	public List<Country> getAllCountryData();
	 public List<Country> deleteRecord(int id);
		public List<Country> updateRecord(int id, Country c);
}
