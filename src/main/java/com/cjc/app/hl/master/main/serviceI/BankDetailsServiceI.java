package com.cjc.app.hl.master.main.serviceI;

import java.util.List;

import com.cjc.app.hl.master.main.model.BankDetails;

public interface BankDetailsServiceI {

	BankDetails registerData(BankDetails bd);

	List<BankDetails> deleteRecord(int bId);

	BankDetails editBankRecords(int bId);

	List<BankDetails> getAllRecords();

	List<BankDetails> updateRecords(BankDetails bd);

}
