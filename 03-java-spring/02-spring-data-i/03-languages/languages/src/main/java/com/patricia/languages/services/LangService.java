package com.patricia.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patricia.languages.models.Lang;
import com.patricia.languages.repositories.LangRepository;

@Service

public class LangService {
	@Autowired
	private LangRepository aRepo;
	//public LangService(LangRepository repository) {
	//	this.aRepo = repository;
	//}
	
	//Get every single Lang from Database and return in ArrayLIst
	public List<Lang> getAllLang(){
		return this.aRepo.findall();
	}
	
	//get one lang
	public Lang getOneLang(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	
	//create one lang
	public Lang createLang (Lang lang) {
		return this.aRepo.save(lang);
	}
	
	//update
	public Lang editLang(Lang lang) {
		return this.aRepo.save(lang);
	}
	
	//delete
	public String deleteLang(Long id) {
		this.aRepo.deleteById(id);
		return "Language has been deleted";
	}
}
