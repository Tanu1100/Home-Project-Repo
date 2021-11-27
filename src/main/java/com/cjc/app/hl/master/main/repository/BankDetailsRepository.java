package com.cjc.app.hl.master.main.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.hl.master.main.model.BankDetails;


@Repository
public interface BankDetailsRepository extends CrudRepository<BankDetails, Integer> {

//	void deleteBybId(int bId);
	

}
