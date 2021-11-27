package com.cjc.app.hl.master.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.hl.master.main.model.Staus;

@Repository
public interface StatusRepository extends CrudRepository<Staus, Integer>
{

}
