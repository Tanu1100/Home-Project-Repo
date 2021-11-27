package com.cjc.app.hl.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.hl.master.main.model.EmployeeDetails;
import com.cjc.app.hl.master.main.serviceI.EmployeeHomeService;


@CrossOrigin
@RestController
public class HomeController 
{

	@Autowired
	EmployeeHomeService hs;
	
	@RequestMapping(value = "/saveemp", method = RequestMethod.POST)
	public String saveEmployee(@RequestBody EmployeeDetails e)
	{
		hs.saveEmployeeDetails(e);
		return "Employee Data inserted successfully";	
	}
	
	@RequestMapping(value="/getallemp",method = RequestMethod.GET)
	public List<EmployeeDetails> getEmployee()
	{
		List<EmployeeDetails> elist=hs.getallEmployeeDetails();
		return elist;
	}
	
	@RequestMapping(value="/editemp/{empId}", method = RequestMethod.GET)
	public EmployeeDetails editEmployeeDetails(@PathVariable ("empId") int empId )
	{
	
		EmployeeDetails emp=hs.editEmployee(empId);
		return emp;
	}
	
	@RequestMapping(value = "/updateemp", method = RequestMethod.PUT)
	public String updateEmployeDeatils(@RequestBody EmployeeDetails e)
	{
		hs.updateEmployee(e);
		return "Employee Details updated successfully";
	}
	
	@RequestMapping(value = "/deleteemp/{empId}", method = RequestMethod.DELETE)
	public String deleteEmployeeDetails(@PathVariable ("empId") int empId)
	{
		hs.deleteEmployee(empId);
		return "Employee Deleted successfully";
	}
	
	
}
