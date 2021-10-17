package com.patricia.drivers.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patricia.drivers.models.Person;

@Repository

public interface driverRepository extends CrudRepository <Person, Long> {
	List<Person> findAll();
	
}
