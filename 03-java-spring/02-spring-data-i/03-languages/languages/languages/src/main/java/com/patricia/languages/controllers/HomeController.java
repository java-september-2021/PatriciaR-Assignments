package com.patricia.languages.controllers;

import java.util.List;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.patricia.languages.models.Languages;
import com.patricia.languages.services.LanguageService;

@Controller

public class HomeController {

	private final LanguageService aService;
	
	public HomeController(LanguageService aService) {
		this.aService = aService;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		List<Languages> lang = aService.allLanguages();
		model.addAttribute("languages2", lang);
		model.addAttribute("languages", new Languages());
		
		return "index.jsp";
	}
	

	
	@PostMapping("/")
	public String addLanguage(@Valid @ModelAttribute("languages") Languages lang, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		this.aService.createLanguage(lang);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id,Model model) {
		Languages langs = this.aService.getOne(id);
		model.addAttribute("languages", langs);
		return "edit.jsp";
	}
	
	//(@Valid @ModelAttribute("album") Album album, BindingResult result, @PathVariable("id") Long id, Model viewModel)
	
	@PostMapping("/update/{id}")
	 public String update(@Valid @ModelAttribute("languages") Languages lang, BindingResult result,@PathVariable("id")Long id,Model viewModel) {
		if (result.hasErrors()) {
            return "/edit.jsp";
        } else {
            this.aService.EditLanguage(lang);
            return "redirect:/";
        }
	}
	
	@GetMapping("/delete/{id}")
		public String delete(@PathVariable("id") Long id) {
			this.aService.deleteLanguages(id);
			return "redirect:/";
	}
	
	@GetMapping("/details/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("languages", this.aService.getOne(id));
		return "show.jsp";
}
}