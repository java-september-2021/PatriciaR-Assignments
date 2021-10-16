
 package com.patricia.lookify.services;
 
 import java.util.List;
 
 import org.springframework.stereotype.Service;
 
 import com.patricia.lookify.models.Look; import
 com.patricia.lookify.repositories.LookRepository;
@Service 
 public class LookService { private final LookRepository lookRepo;
 
 public LookService(LookRepository lookRepo) { this.lookRepo = lookRepo; }
 
 //returns all the looks 
 public List<Look> allLooks(){ 
	 return lookRepo.findAll(); 
	 }
  
 //creates a look 
 public Look createLook(Look look) {
  return lookRepo.save(look); 
 } 
 //update 
 public Look EditLook(Look look) { 
	 return this.lookRepo.save(look); 
	 }
  
  //delete 
 public String deleteLook(Long id) { 
	 this.lookRepo.deleteById(id);
  return "succesfully deleted"; 
  }
 
 //get one
 
 public Look getOne(Long id) { 
	 return this.lookRepo.findById(id).orElse(null);
 } 
 
  public List<Look> top(){
	  return lookRepo.findTop10ByOrderByRatingDesc();
  }
  
  public List <Look> searchByArtist(String search) {
	  return lookRepo.findByArtistContaining(search);
  }
 
 }
