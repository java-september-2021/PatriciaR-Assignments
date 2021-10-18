package com.patricia.Dojo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patricia.Dojo.Models.Dojo;
import com.patricia.Dojo.Repositories.DojoRepository;



@Service
public class DojoService {
	private final DojoRepository dojoRepo;
	 
 	public DojoService(DojoRepository dojoRepo) {
 		this.dojoRepo = dojoRepo;
 	}
 	
 	public List<Dojo> allDojos(){
 		return dojoRepo.findAll();
 	}
 	
 	public Dojo createDojo(Dojo d) {
 		return dojoRepo.save(d);
 	}
 	
 	public Dojo getDojo(Long id) {
 		return this.dojoRepo.findById(id).orElse(null);
 	}
}
