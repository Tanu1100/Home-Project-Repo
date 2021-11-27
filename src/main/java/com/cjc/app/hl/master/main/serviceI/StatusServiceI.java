package com.cjc.app.hl.master.main.serviceI;

import java.util.List;
import java.util.Optional;

import com.cjc.app.hl.master.main.model.Staus;


public interface StatusServiceI {

	public List<Staus> saveStaus(Staus s);
	public List<Staus> getStaus();
	public Optional<Staus> editStausdata(int id);
	public Staus updateStausdata(Staus s);
	public void deleteStausdata(int id);

	
}
