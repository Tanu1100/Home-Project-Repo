package com.cjc.app.hl.master.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.hl.master.main.model.Country;



@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}
