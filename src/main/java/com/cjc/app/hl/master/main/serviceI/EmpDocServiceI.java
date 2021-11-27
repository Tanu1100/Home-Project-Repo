package com.cjc.app.hl.master.main.serviceI;

import java.util.List;
import java.util.Optional;

import com.cjc.app.hl.master.main.model.EmployeeDocumentDetails;

public interface EmpDocServiceI {
	
	public List<EmployeeDocumentDetails> saveDoc(EmployeeDocumentDetails d);

	public List<EmployeeDocumentDetails> getDoc();
	
    public Optional<EmployeeDocumentDetails> editDoc(int id);
	
	public Optional<EmployeeDocumentDetails> updateDoc(EmployeeDocumentDetails e);
	
	public void deleteDoc(int id);
}
