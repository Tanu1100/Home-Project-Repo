package com.cjc.app.hl.master.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.hl.master.main.model.Staus;
import com.cjc.app.hl.master.main.serviceImp.StausServiceImpl;



@RestController
@CrossOrigin("*")
@RequestMapping("MM")
public class HomeStatusController {

	@Autowired
	StausServiceImpl ss;
	
	
	@RequestMapping(value="/saveStaus",method = RequestMethod.POST)
	public String regStaus(@RequestBody Staus s)
	{
		ss.saveStaus(s);
		System.out.println(s.getStatusName());
		return "Data Inserted";
		 
	}
	
	@RequestMapping(value="/getStaus", method = RequestMethod.GET)
	public List<Staus> getallStaus()
	{
	List<Staus> slist=ss.getStaus();
	return slist;
	}
	
	
	
	@RequestMapping(value = "/editStaus/{stausid}",method = RequestMethod.GET)
	public Optional<Staus> editStaus(@PathVariable ("stausid") int stausId)
	{
		return ss.editStausdata(stausId);
	}
	
	@RequestMapping(value = "/updateStaus", method = RequestMethod.PUT)
	public Staus updateStaus(@RequestBody Staus s)
	{
		return ss.updateStausdata(s);
	}
	
	@RequestMapping(value = "/deleteStaus/{stausid}", method = RequestMethod.DELETE)
	public String deleteStaus(@PathVariable ("stausid") int stausId)
	{
		ss.deleteStausdata(stausId);
		return "Deleted successfully";
	}
}
