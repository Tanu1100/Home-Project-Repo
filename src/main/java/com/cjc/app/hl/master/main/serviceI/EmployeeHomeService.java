package com.cjc.app.hl.master.main.serviceI;

import java.util.List;

import com.cjc.app.hl.master.main.model.EmployeeDetails;

public interface EmployeeHomeService {

	public void saveEmployeeDetails(EmployeeDetails e);

	public List<EmployeeDetails> getallEmployeeDetails();

	public EmployeeDetails editEmployee(int empId);

	public void updateEmployee(EmployeeDetails e);

	public void deleteEmployee(int empId);

}
