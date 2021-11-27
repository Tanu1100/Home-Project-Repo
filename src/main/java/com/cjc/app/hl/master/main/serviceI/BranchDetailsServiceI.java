package com.cjc.app.hl.master.main.serviceI;

import java.util.List;

import com.cjc.app.hl.master.main.model.BranchDetails;

public interface BranchDetailsServiceI {

	List<BranchDetails> getAllDetails();

	BranchDetails saveRecords(BranchDetails bd);

	List<BranchDetails> deleteBranchRecords(int branchId);

	BranchDetails editRecords(int branchId);

	List<BranchDetails> updateRecords(BranchDetails bd);

}
