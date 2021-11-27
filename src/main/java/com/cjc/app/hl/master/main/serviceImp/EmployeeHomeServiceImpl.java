package com.cjc.app.hl.master.main.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.hl.master.main.model.EmployeeDetails;
import com.cjc.app.hl.master.main.repository.EmployeeDetailsRepository;
import com.cjc.app.hl.master.main.serviceI.EmployeeHomeService;


@Service
public class EmployeeHomeServiceImpl implements EmployeeHomeService
{

	@Autowired
	EmployeeDetailsRepository edr;
	
	@Override
	public void saveEmployeeDetails(EmployeeDetails e) {
		// TODO Auto-generated method stub
		edr.save(e);
	}

	@Override
	public List<EmployeeDetails> getallEmployeeDetails() {
		// TODO Auto-generated method stub
		return edr.findAll();
	}

	@Override
	public EmployeeDetails editEmployee(int empId) {
		// TODO Auto-generated method stub
		return edr.findByEmpId(empId);
	}

	@Override
	public void updateEmployee(EmployeeDetails e) 
	{
		// TODO Auto-generated method stub
		edr.save(e);
		
	}

	@Override
	public void deleteEmployee(int empId) 
	{
		// TODO Auto-generated method stub
		edr.deleteById(empId);
	}

}
