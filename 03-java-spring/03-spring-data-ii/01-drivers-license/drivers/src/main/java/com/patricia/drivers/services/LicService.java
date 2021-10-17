package com.patricia.drivers.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.patricia.drivers.models.lic;
import com.patricia.drivers.repositories.licRepository;

@Service
public class LicService {
	private final licRepository licRepo;
	
	public LicService(licRepository licRepo) {
		this.licRepo = licRepo;
	}
	
	public List<lic> allLic(){
    	return licRepo.findAll();
	}
	
	public lic createLic(lic l) {
		return licRepo.save(l);
	}
}
