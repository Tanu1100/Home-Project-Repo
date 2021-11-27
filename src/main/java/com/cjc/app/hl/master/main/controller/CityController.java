package com.cjc.app.hl.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.hl.master.main.model.City;
import com.cjc.app.hl.master.main.serviceI.CityService;


@RestController
@CrossOrigin("*")
public class CityController {

	@Autowired
	CityService cs;
	
	@PostMapping("/addcity")
	public String saveCityData(@RequestBody City c)
		{
			System.out.println("SaveData Method called");
			cs.saveCityData(c);
			return "succesfully Register City";
		}
	
	@GetMapping("/getCityData")
	public List<City> m1()
	{
		
		System.out.println("GetData");
		List<City> elist=cs.getAllCityData();
		return elist;
	}	
//	@RequestMapping(value = "/deleletcity/{id}", method= RequestMethod.DELETE)
//    public void deleteRecord(@PathVariable("id") int cityId) {
//	System.out.println(cityId);
//	 cs.deleteRecord(cityId);
//	System.out.println("Record deleted successfully");
//		//return elist;
//}

	
	
}

