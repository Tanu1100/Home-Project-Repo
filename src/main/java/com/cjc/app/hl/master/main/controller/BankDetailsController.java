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

import com.cjc.app.hl.master.main.model.BankDetails;
import com.cjc.app.hl.master.main.model.BranchAddressDetails;
import com.cjc.app.hl.master.main.model.BranchDetails;
import com.cjc.app.hl.master.main.model.City;
import com.cjc.app.hl.master.main.model.Country;
import com.cjc.app.hl.master.main.model.State;
import com.cjc.app.hl.master.main.serviceI.BankDetailsServiceI;

@RestController
@CrossOrigin("*")
public class BankDetailsController {
	
	@Autowired
	BankDetailsServiceI hs;
	
	System.out.println("Controller class of Bank Details");
	
	@GetMapping(value = "/getBankDetails")
	public List<BankDetails> getAllBankDetails()
	{
		List<BankDetails> lst= hs.getAllRecords();
//		 new ArrayList<BankDetails>();
//		 
//		 Country c1=  new Country();
//		 c1.setCountryId(1);
//		 c1.setCountryName("country 1");
//		 c1.setCountryCode("countryCode 1");
//		 
//		 State s= new State();
//		 s.setStateId(1);
//		 s.setStateName("state1");
//		 s.setStateCountry(c1);
//		 
//		 City c= new City();
//		 c.setCityId(1);
//		 c.setCityName("City1");
//		 c.setCityState(s);
//		 c.setCityCode(1);
//		 
//		BranchAddressDetails ba= new BranchAddressDetails();
//		ba.setBranchAddressId(13);
//		ba.setBranchHouseNo("1");
//		ba.setBranchStreetName("1");
//		ba.setBranchArea("1");
//		ba.setBranchLandmark("1");
//		ba.setBranchTaluka("1");
//		ba.setBranchDistrict("1");
//		ba.setBranchState("1");
//		ba.setBranchCountry("1");
//		ba.setBranchPincode(1);
//		ba.setBranchCity(c);
//
//		
//		BranchDetails bd= new BranchDetails();
//		bd.setBranchId(13);
//		bd.setBranchName("1");
//		bd.setBranchType("13");
//		bd.setBranchIfscCode("13");
//		bd.setMicrCode(13L);
//		bd.setBranchCode(13);
//		bd.setBranchContactNo(1L);
//		bd.setBranchEmailId("1@com");
//		bd.setBranchAddress(ba);
//		bd.setBranchStatus(13);
//		
//		
//		
//		BankDetails b= new BankDetails();
//		b.setbId(13);
//		b.setBankAccountHolderName("Tanu");
//		b.setBankAccountNo("13");
//		b.setBankBranch(bd);
//		b.setStatus(13);
//		lst.add(b);
		return lst;
		
	}

	@PostMapping(value = "/regBankDetails")
	public BankDetails saveBankDetails(@RequestBody BankDetails bd)
	{
		BankDetails b= hs.registerData(bd);
		return b;
	}
	
	
	@DeleteMapping(value = "/delBankDetails/{bId}")
	public List<BankDetails> deleteBankDetails(@PathVariable ("bId") int bId)
	{
		List<BankDetails>lst=hs.deleteRecord(bId);
		
		return lst;
		
	}
	
	@GetMapping(value = "/editBankDetails/{bId}")
	public BankDetails editBankDetails(@PathVariable ("bId") int bId)
	{
		BankDetails bd=hs.editBankRecords(bId);
		return bd;
		
	}
	@PutMapping(value = "/upBankDetails")
	public List<BankDetails> updateBankDetails(@RequestBody BankDetails bd)
	{
		List<BankDetails>lst=hs.updateRecords(bd);
		return lst;
	}
	
	
}
