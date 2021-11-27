package com.cjc.app.hl.master.main.serviceI;

import java.util.List;

import com.cjc.app.hl.master.main.model.Designation;
import com.cjc.app.hl.master.main.model.Tenure;

public interface HomeService {
	
	public List<Designation> getAlldesignation();
	
	public Designation savedata(Designation d);


	public List<Designation> deleterecord(int designationId);

	public Designation editdata(int designationId);
	
	public List<Designation> updatedata(Designation d);

	
	
	public List<Tenure> getAlltenure();
	
	public Tenure saveData(Tenure t);
	
	public List<Tenure> deleteRecord(int tenureId);
	
	public Tenure editData(int tenureId);

	public List<Tenure> updateData(Tenure t);
	
	
	
	
	
	
}
