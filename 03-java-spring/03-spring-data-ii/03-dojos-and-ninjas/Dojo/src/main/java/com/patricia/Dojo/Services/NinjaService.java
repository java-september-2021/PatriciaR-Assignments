package com.patricia.Dojo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patricia.Dojo.Models.Ninja;
import com.patricia.Dojo.Repositories.NinjaRepository;


@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;
	 
 	public NinjaService(NinjaRepository ninjaRepo) {
 		this.ninjaRepo = ninjaRepo;
 	}
 	
 	public List<Ninja> allNinjas(){
 		return ninjaRepo.findAll();
 	}
 	
 	public Ninja createNinja(Ninja n) {
 		return ninjaRepo.save(n);
 	}
 	
 	public Ninja getNinja(Long id) {
 		return this.ninjaRepo.findById(id).orElse(null);
 	}
 	
 	public List<Ninja> findByDojo(Long id) {
 		return this.ninjaRepo.findByDojo_id(id);
 	}
}
