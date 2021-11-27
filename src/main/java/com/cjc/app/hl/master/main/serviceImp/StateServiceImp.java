package com.cjc.app.hl.master.main.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.hl.master.main.model.State;
import com.cjc.app.hl.master.main.repository.StateRepository;
import com.cjc.app.hl.master.main.serviceI.StateService;


@Service
public class StateServiceImp implements StateService {
	@Autowired
	StateRepository sr;
	@Override
	public State saveStateData(State s) {
		 return sr.save(s);
	}
	@Override
	public List<State> getAllStateData() {
		return (List<State>) sr.findAll() ;
	}
	@Override
	public List<State> deleteRecord(int id) {
		sr.deleteById(id);
		return (List<State>) sr.findAll() ;
	}
	@Override
	public List<State> updateRecord(int id, State s) {
		// TODO Auto-generated method stub
		return null;
	}


}
