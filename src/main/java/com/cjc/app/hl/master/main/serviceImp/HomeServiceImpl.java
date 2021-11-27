package com.cjc.app.hl.master.main.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.hl.master.main.model.Designation;
import com.cjc.app.hl.master.main.model.Tenure;
import com.cjc.app.hl.master.main.repository.DesignationRepository;
import com.cjc.app.hl.master.main.repository.TenureRepository;
import com.cjc.app.hl.master.main.serviceI.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	
	
	@Autowired
	DesignationRepository dr;
	
	@Autowired
	TenureRepository tr;
	
	
	@Override
	public List<Designation> getAlldesignation() {
		
		return (List<Designation>) dr.findAll();
	}
	@Override
	public Designation savedata(Designation d) {
		
		return dr.save(d) ;
	}
	@Override
	public List<Designation> deleterecord(int designationId) {
		dr.deleteById(designationId);
		return (List<Designation>) dr.findAll();
	}
	@Override
	public Designation editdata(int designationId) {
		
		return dr.findById(designationId).get();
	}
	@Override
	public List<Designation> updatedata(Designation d) {
		dr.save(d);
		return (List<Designation>) dr.findAll();
	}
	
	
	@Override
	public List<Tenure> getAlltenure() {
		
	 return (List<Tenure>) tr.findAll();
	}
	@Override
	public Tenure saveData(Tenure t) {
		return tr.save(t) ;
	}
	@Override
	public List<Tenure> deleteRecord(int tenureId) {
		tr.deleteById(tenureId);
		return (List<Tenure>) tr.findAll();
	}
	@Override
	public Tenure editData(int tenureId) {
		return tr.findById(tenureId).get();
	}
	@Override
	public List<Tenure> updateData(Tenure t) {
		tr.save(t);
		return (List<Tenure>) tr.findAll();
	}

	
	
}
