package com.cjc.app.hl.master.main.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.hl.master.main.model.BranchDetails;
import com.cjc.app.hl.master.main.repository.BranchDetailsRepository;
import com.cjc.app.hl.master.main.serviceI.BranchDetailsServiceI;

@Service
public class BranchDetailsServiceImp implements BranchDetailsServiceI {
	
	@Autowired
	BranchDetailsRepository hr;

	@Override
	public List<BranchDetails> getAllDetails() {
		// TODO Auto-generated method stub
		
		return (List<BranchDetails>) hr.findAll();
	}

	@Override
	public BranchDetails saveRecords(BranchDetails bd) {
		// TODO Auto-generated method stub
		
		return hr.save(bd);
	}

	@Override
	public List<BranchDetails> deleteBranchRecords(int branchId) {
		// TODO Auto-generated method stub
		hr.deleteById(branchId);
		return (List<BranchDetails>) hr.findAll();
	}

	@Override
	public BranchDetails editRecords(int branchId) {
		// TODO Auto-generated method stub
		
		return hr.findById(branchId).get();
	}

	@Override
	public List<BranchDetails> updateRecords(BranchDetails bd) {
		// TODO Auto-generated method stub
		hr.save(bd);
		return (List<BranchDetails>) hr.findAll();
	}

}
