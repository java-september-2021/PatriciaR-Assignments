package com.patricia.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.patricia.languages.models.Languages;
import com.patricia.languages.repositories.LanguageRepository;

@Service

public class LanguageService {
	private final LanguageRepository aRepo;
	
	public LanguageService(LanguageRepository aRepo) {
		this.aRepo = aRepo;
	}
	
	//returns all the languages
	public List<Languages> allLanguages(){
		return aRepo.findAll();
	}
	
	//creates a book
	public Languages createLanguage(Languages lang) {
		return aRepo.save(lang);
	}
	//update
	public Languages EditLanguage(Languages lang) {
		return this.aRepo.save(lang);
	}
	
	//delete
	public String deleteLanguages(Long id) {
		this.aRepo.deleteById(id);
		return "succesfully deleted";
	}
	
	//get one
	
	public Languages getOne(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
}



