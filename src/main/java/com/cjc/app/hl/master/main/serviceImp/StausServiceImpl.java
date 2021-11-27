package com.cjc.app.hl.master.main.serviceImp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.hl.master.main.model.Staus;
import com.cjc.app.hl.master.main.repository.StatusRepository;
import com.cjc.app.hl.master.main.serviceI.StatusServiceI;

@Service
public class StausServiceImpl implements StatusServiceI {
	@Autowired
	StatusRepository sr;
	@Override
	public List<Staus> saveStaus(Staus s) {
		sr.save(s);
		return (List<Staus>) sr.findAll();
	}

	@Override
	public List<Staus> getStaus() {
		return (List<Staus>) sr.findAll();
	}

	@Override
	public Optional<Staus> editStausdata(int id) {
		return sr.findById(id);
	}

	@Override
	public Staus updateStausdata(Staus s) {
		sr.save(s);
		Staus s1=sr.save(s);
		return s1;
	}

	@Override
	public void deleteStausdata(int id) {
		sr.deleteById(id);	
	}

}