package com.cjc.app.hl.master.main.controller;


import java.util.ArrayList;
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

import com.cjc.app.hl.master.main.model.BranchDetails;
import com.cjc.app.hl.master.main.serviceI.BranchDetailsServiceI;

@RestController
@CrossOrigin("*")
public class BranchDetailsController {
	
	@Autowired
	BranchDetailsServiceI hs;
	
	
	@GetMapping(value = "/getBD")
	public List<BranchDetails> getAllBranchDetails()
	{
	List<BranchDetails> lst=hs.getAllDetails();
		
		return lst;		
	}
	
	@PostMapping(value = "/regBD")
	public BranchDetails saveBranchDetails(@RequestBody BranchDetails bd)
	{
		BranchDetails bb=hs.saveRecords(bd);
		return bb;		
	}
	
	@DeleteMapping(value = "/delBD/{branchId}")
	public List<BranchDetails>deleteBranchDetails(@PathVariable ("branchId") int branchId)
	{
		List<BranchDetails>lst=hs.deleteBranchRecords(branchId);
		return lst;
	}
	
	@GetMapping(value = "/editBD/{branchId}")
	public BranchDetails editBranchDetails(@PathVariable ("branchId") int branchId)
	{
		BranchDetails bb=hs.editRecords(branchId);
		return bb;		
	}
	
	@PutMapping(value = "/upBD")
	public List<BranchDetails>updateBranchDetails(@RequestBody BranchDetails bd)
	{
		List<BranchDetails>lst=hs.updateRecords(bd);
		return lst;
	}

}
