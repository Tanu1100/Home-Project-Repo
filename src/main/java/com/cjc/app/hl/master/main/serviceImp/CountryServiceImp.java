package com.cjc.app.hl.master.main.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.hl.master.main.model.Country;
import com.cjc.app.hl.master.main.repository.CountryRepository;
import com.cjc.app.hl.master.main.serviceI.CountryService;
@Service
public class CountryServiceImp implements CountryService {
	@Autowired
	CountryRepository cr;
	@Override
	public Country saveCountryData(Country c) {
		 return cr.save(c);
		 
	}
	@Override
	public List<Country> getAllCountryData() {
		
		return (List<Country>) cr.findAll() ;
	}
	@Override
	public List<Country> deleteRecord(int id) {
		cr.deleteById(id);
		return (List<Country>) cr.findAll() ;
	}
	@Override
	public List<Country> updateRecord(int id, Country c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

