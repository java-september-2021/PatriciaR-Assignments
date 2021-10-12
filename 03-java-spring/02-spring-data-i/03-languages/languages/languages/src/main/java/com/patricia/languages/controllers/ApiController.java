package com.patricia.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.patricia.languages.models.Languages;
import com.patricia.languages.services.LanguageService;

public class ApiController {
	private final LanguageService aService;
    public ApiController(LanguageService aService){
        this.aService = aService;
    }
    @GetMapping("")
	public List<Languages> index(){
		return this.aService.allLanguages();
	}
	
	@GetMapping("/{id}")
	public Languages getOne(@PathVariable("id") Long id) {
		return this.aService.getOne(id);
	}
	
	@PostMapping("/create")
	public Languages create(Languages lang) {
		return this.aService.createLanguage(lang);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		return this.aService.deleteLanguages(id);
	}
}
