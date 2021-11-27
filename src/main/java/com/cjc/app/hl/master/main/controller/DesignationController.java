package com.cjc.app.hl.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.hl.master.main.model.Designation;
import com.cjc.app.hl.master.main.serviceI.HomeService;


@RestController 
@RequestMapping("Designation")
@CrossOrigin("*")
public class DesignationController {

	@Autowired
	HomeService hs;
	
	@RequestMapping(value="/get", method = RequestMethod.GET)
	public List<Designation> getAlldata() 
	{
		List<Designation>dlist=hs.getAlldesignation();
		return dlist;
	}

	@RequestMapping(value="/post", method = RequestMethod.POST)
	public Designation savedata(@RequestBody Designation d) 
	{
		Designation d1=hs.savedata(d);
		System.out.println(d.getDesignationId());
		System.out.println(d.getDesignationName());
		System.out.println(d.getDesignationStatusCode());
		System.out.println(d.getDesignationStatusRemark());
		
		
	
		
		return d1;
	}
	

	@RequestMapping(value="/delete/{designationId}", method = RequestMethod.DELETE)
	public List<Designation> deletedata(@PathVariable("designationId")int designationId)
	{
		List<Designation> dlist=hs.deleterecord(designationId);
		
		
		return dlist;
			
	}
	@RequestMapping(value="/edit/{designationId}", method = RequestMethod.GET)
	public Designation editdata(@PathVariable("designationId")int designationId)
	{
		Designation d=hs.editdata(designationId);
		
		return d;
			
	}
	@RequestMapping(value="/update", method = RequestMethod.PUT)
	public List<Designation> updatedata(@RequestBody Designation d)
	{
		List<Designation> dlist= hs.updatedata(d);
		
		return dlist;
			
	}
}
