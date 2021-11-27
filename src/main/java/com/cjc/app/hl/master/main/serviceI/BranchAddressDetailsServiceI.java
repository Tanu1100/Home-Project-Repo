package com.cjc.app.hl.master.main.serviceI;

import java.util.List;

import com.cjc.app.hl.master.main.model.BranchAddressDetails;

public interface BranchAddressDetailsServiceI {

	List<BranchAddressDetails> getAllBranchaddress();

	BranchAddressDetails saveRecords(BranchAddressDetails bAddr);

	List<BranchAddressDetails> deleteRecords(int branchAddressId);

	BranchAddressDetails editRecords(int branchAddressId);

	List<BranchAddressDetails> updateRecords(BranchAddressDetails bAddr);

}
