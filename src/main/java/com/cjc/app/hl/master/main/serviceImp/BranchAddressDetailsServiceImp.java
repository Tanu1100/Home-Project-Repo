package com.cjc.app.hl.master.main.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cjc.app.hl.master.main.model.BranchAddressDetails;
import com.cjc.app.hl.master.main.repository.BranchAddressRepository;
import com.cjc.app.hl.master.main.serviceI.BranchAddressDetailsServiceI;

@Service
public class BranchAddressDetailsServiceImp implements BranchAddressDetailsServiceI {
	@Autowired
	BranchAddressRepository hr;

	@Override
	public List<BranchAddressDetails> getAllBranchaddress() {
		// TODO Auto-generated method stub
		
		return (List<BranchAddressDetails>) hr.findAll();
	}

	@Override
	public BranchAddressDetails saveRecords(BranchAddressDetails bAddr) {
		// TODO Auto-generated method stub
		
		return hr.save(bAddr);
	}

	@Override
	public List<BranchAddressDetails> deleteRecords(int branchAddressId) {
		
		hr.deleteById(branchAddressId);
		
		return (List<BranchAddressDetails>) hr.findAll();
		// TODO Auto-generated method stub
		
	}

	@Override
	public BranchAddressDetails editRecords(int branchAddressId) {
		// TODO Auto-generated method stub
		return hr.findById(branchAddressId).get();
	}

	@Override
	public List<BranchAddressDetails> updateRecords(BranchAddressDetails bAddr) {
		// TODO Auto-generated method stub
		hr.save(bAddr);
		return (List<BranchAddressDetails>) hr.findAll();
	}

	
	

}
