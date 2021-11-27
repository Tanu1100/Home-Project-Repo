package com.cjc.app.hl.master.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.hl.master.main.model.BranchAddressDetails;
@Repository
public interface BranchAddressRepository extends CrudRepository<BranchAddressDetails, Integer> {

//	void deleteByBranchAddressId(int branchAddressId);

	
}
