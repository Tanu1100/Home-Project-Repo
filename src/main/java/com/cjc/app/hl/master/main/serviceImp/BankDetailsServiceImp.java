package com.cjc.app.hl.master.main.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.hl.master.main.model.BankDetails;
import com.cjc.app.hl.master.main.repository.BankDetailsRepository;
import com.cjc.app.hl.master.main.serviceI.BankDetailsServiceI;

@Service
public class BankDetailsServiceImp implements BankDetailsServiceI {
	
	@Autowired
	BankDetailsRepository hr;

	@Override
	public BankDetails registerData(BankDetails bd) {
		// TODO Auto-generated method stub
	
		return hr.save(bd);
	}

	@Override
	public List<BankDetails> deleteRecord(int bId) {
		// TODO Auto-generated method stub
		
		 hr.deleteById(bId);
		 return (List<BankDetails>) hr.findAll();
		
	}

	@Override
	public BankDetails editBankRecords(int bId) {
		// TODO Auto-generated method stub
		
		return hr.findById(bId).get();
	}

	@Override
	public List<BankDetails> getAllRecords() {
		// TODO Auto-generated method stub
		return (List<BankDetails>) hr.findAll();
	}

	@Override
	public List<BankDetails> updateRecords(BankDetails bd) {
		// TODO Auto-generated method stub
		hr.save(bd);
		return (List<BankDetails>) hr.findAll();
	}

}
