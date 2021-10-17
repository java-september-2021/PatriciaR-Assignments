package com.patricia.drivers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patricia.drivers.models.Person;
import com.patricia.drivers.repositories.driverRepository;

@Service
public class DriverService {
    private final driverRepository driverRepo;
    
    public DriverService(driverRepository driverRepo) {
    	this.driverRepo = driverRepo;
    }
    
    public List<Person> allPersons(){
    	return driverRepo.findAll();
    }
    
    public Person createPerson(Person p) {
    	return driverRepo.save(p);
    }
    
    
}
