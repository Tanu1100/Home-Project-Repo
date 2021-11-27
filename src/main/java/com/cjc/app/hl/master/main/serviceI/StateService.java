package com.cjc.app.hl.master.main.serviceI;

import java.util.List;

import com.cjc.app.hl.master.main.model.State;




public interface StateService {
	public State saveStateData(State s) ;
	public List<State> getAllStateData();
	 public List<State> deleteRecord(int id);
		public List<State> updateRecord(int id, State s);
}
