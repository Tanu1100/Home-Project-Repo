package com.cjc.app.hl.master.main.serviceImp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.app.hl.master.main.model.EmployeeDocumentDetails;
import com.cjc.app.hl.master.main.repository.EmpDocRepository;
import com.cjc.app.hl.master.main.serviceI.EmpDocServiceI;

@Service
public class EmpDocServiceImpl implements EmpDocServiceI {

	@Autowired
	EmpDocRepository er;
	@Override
	public List<EmployeeDocumentDetails> saveDoc(EmployeeDocumentDetails d) {
		er.save(d);
		List<EmployeeDocumentDetails> eList=(List<EmployeeDocumentDetails>) er.findAll();
		return eList;
	}

	@Override
	public List<EmployeeDocumentDetails> getDoc() {
		return (List<EmployeeDocumentDetails>) er.findAll();
	}

	@Override
	public Optional<EmployeeDocumentDetails> editDoc(int id) {
		return er.findById(id);
	}

	@Override
	public Optional<EmployeeDocumentDetails> updateDoc(EmployeeDocumentDetails e) {
		er.save(e);
		return er.findById(e.getEmp_id());
	}

	@Override
	public void deleteDoc(int id) {
		er.deleteById(id);
	}

	
}
