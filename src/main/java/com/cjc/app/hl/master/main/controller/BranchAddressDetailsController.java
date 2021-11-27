package com.cjc.app.hl.master.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.hl.master.main.model.BranchAddressDetails;
import com.cjc.app.hl.master.main.serviceI.BranchAddressDetailsServiceI;

@RestController
@CrossOrigin("*")
public class BranchAddressDetailsController {
	
	@Autowired
	BranchAddressDetailsServiceI hs;
	
	@GetMapping(value = "/getBA")
	public List<BranchAddressDetails> getAllBranchAddressDetails()
	{
		List<BranchAddressDetails> lst=hs.getAllBranchaddress();		
		return lst;		
	}
	
	@PostMapping(value = "/regBA")
	public BranchAddressDetails saveBranchAddressDetails(@RequestBody BranchAddressDetails bAddr)
	{
		BranchAddressDetails ba=hs.saveRecords(bAddr);
		return ba;
	}
	
	@DeleteMapping(value = "/delBA/{branchAddressId}")
	public List<BranchAddressDetails>deleteBranchAddress(@PathVariable("branchAddressId")int branchAddressId)
	{
		List<BranchAddressDetails>lst=hs.deleteRecords(branchAddressId);		
		return lst;
	}
	
	@GetMapping(value = "/editBA/{branchAddressId}")
	public BranchAddressDetails editBranchAddressDetails(@PathVariable("branchAddressId") int branchAddressId)
	{
		BranchAddressDetails ba=hs.editRecords(branchAddressId);
		return ba;
	}
	
	@PutMapping(value = "/upBA")
	public List<BranchAddressDetails>updateBranchAddress(@RequestBody BranchAddressDetails bAddr)
	{
		List<BranchAddressDetails>lst=hs.updateRecords(bAddr);		
		return lst;
	}
}
