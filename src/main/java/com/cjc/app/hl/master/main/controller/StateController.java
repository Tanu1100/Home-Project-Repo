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

import com.cjc.app.hl.master.main.model.State;
import com.cjc.app.hl.master.main.serviceI.StateService;



@RestController
@CrossOrigin("*")
public class StateController {

	@Autowired
	StateService ss;
	
	@PostMapping("/addstate")
public String saveStateData(@RequestBody State s)
	{
		System.out.println("SaveData_Method ");
		ss.saveStateData(s);
		return "succesfully Register State";
	}
	
	@GetMapping("/getStateData")
public List<State> m3()
	{
		List<State> elist=ss.getAllStateData();
       return elist;
}
	
	@RequestMapping(value = "/deleletestate/{id}", method= RequestMethod.DELETE)
    public List<State>deleteRecord(@PathVariable("id") int id) {
	System.out.println(id);
	List<State> elist = ss.deleteRecord(id);
	System.out.println("State_Record deleted successfully");
		return elist;
}
}