package com.cjc.app.hl.master.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.hl.master.main.model.Tenure;
import com.cjc.app.hl.master.main.serviceI.HomeService;


@RestController
@RequestMapping("Tenure")
@CrossOrigin("*")
public class TenureController {

	@Autowired
	private HomeService hs;
	

	@RequestMapping(value="/gett", method = RequestMethod.GET)
	public List<Tenure> getAllData() 
	{
		List<Tenure>tlist=hs.getAlltenure();
//		Tenure t =new Tenure();
//		t.setTenureId(1);
//		t.setNoOfYears(2000);
//		t.setStatus(1);
//		tlist.add(t);
		
		return tlist;
	}

	@RequestMapping(value="/postt", method = RequestMethod.POST)
	public Tenure savedata(@RequestBody Tenure t) 
	{
		Tenure t1=hs.saveData(t);
		System.out.println(t.getTenureId());
		System.out.println(t.getNoOfYears());
		System.out.println(t.getStatus());
		
		
	
		
		return t1;
	}
	

	@RequestMapping(value="/delete/{tenureId}", method = RequestMethod.DELETE)
	public List<Tenure> deletedata(@PathVariable("tenureId")int tenureId)
	{
		List<Tenure> tlist=hs.deleteRecord(tenureId);
		
		
		return tlist;
			
	}
	@RequestMapping(value="/edit/{tenureId}",method=RequestMethod.GET)
	public Tenure editData(@PathVariable("tenureId")int tenureId)
	{
		Tenure t=hs.editData(tenureId);
		
		return t;
			
	}
	@RequestMapping(value="/updatet", method = RequestMethod.PUT)
	public List<Tenure> updateData(@RequestBody Tenure t)
	{
		List<Tenure> tlist= hs.updateData(t);
		
		return tlist;
			
	}
}
