package com.cjc.app.hl.master.main.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.app.hl.master.main.model.EmployeeDocumentDetails;
import com.cjc.app.hl.master.main.serviceI.EmpDocServiceI;
import com.google.gson.Gson;



@RestController
@CrossOrigin("*")
@RequestMapping("MM")
public class HomeEmpDocController {
	
	@Autowired
	EmpDocServiceI es;
	
	@RequestMapping(value="/saveDoc",method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public List<EmployeeDocumentDetails> regEmployeeDocumentDetails(
			@RequestPart("doc") String doc,
			@RequestPart(required = true, value = "aadharCard") MultipartFile files2,
			@RequestPart(required = true, value = "panCard") MultipartFile files3,
			@RequestPart(required = true, value = "photo") MultipartFile files4) throws IOException
		{
		EmployeeDocumentDetails d=new EmployeeDocumentDetails();
		d.setPhoto(files4.getBytes());
		d.setAadharCard(files2.getBytes());
		d.setPanCard(files3.getBytes());
		
		Gson gson=new Gson();
		
		EmployeeDocumentDetails d1=gson.fromJson(doc, EmployeeDocumentDetails.class);
		d.setEmp_id(d1.getEmp_id());		
		 List<EmployeeDocumentDetails> elist=es.saveDoc(d);
		 return elist;
	}
	
	@RequestMapping(value="/getDoc", method = RequestMethod.GET)
	public List<EmployeeDocumentDetails> getEmployeeDocumentDetails()
	{
	List<EmployeeDocumentDetails> elist=es.getDoc();	
	return elist;
	}

	@RequestMapping(value = "/editDoc/{empId}")
	public Optional<EmployeeDocumentDetails> editEmployeeDocumentDetails(@PathVariable ("empId") int empId)
	{
		return es.editDoc(empId);
	}
	
	public Optional<EmployeeDocumentDetails> updateEmployeeDocumentDetails(@RequestBody EmployeeDocumentDetails e)
	{
		return es.updateDoc(e);
	}
	
	@RequestMapping(value = "/deleteDoc/{empId}", method = RequestMethod.DELETE)
	public String deleteEmployeeDocumentDetails(@PathVariable ("empId") int empId)
	{
		es.deleteDoc(empId);
		return "Deleted successfully";
	}
}
