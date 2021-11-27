package com.cjc.app.hl.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.hl.master.main.model.Country;
import com.cjc.app.hl.master.main.serviceI.CountryService;




@RestController
@CrossOrigin("*")
public class CountryController {

	@Autowired
	CountryService cs;
	
@PostMapping("/addcountry")
public String saveCountryData(@RequestBody Country c1)
	{
		System.out.println("SaveData Method called");
	cs.saveCountryData(c1);
		return "succesfully Register CountryData";	}
	
	@GetMapping("/getCountryData")
public List<Country> m2()
	{
		
		System.out.println("GetData");
	List<Country> elist=cs.getAllCountryData();
	return elist;
	}
	@RequestMapping(value = "/deletecountry/{id}", method= RequestMethod.DELETE)
    public List<Country> deleteRecord(@PathVariable("id") int id) {
	System.out.println(id);
	List<Country> elist = cs.deleteRecord(id);
	System.out.println("Record deleted successfully");
		return elist;
	}
}

