package com.cjc.app.hl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.hl.master.main.model.EmployeeAddressDetails;

@Repository
public interface EmployeeAddressDetailsRepository extends JpaRepository<EmployeeAddressDetails, Integer> {

}
