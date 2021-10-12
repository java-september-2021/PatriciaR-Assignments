package com.patricia.languages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.patricia.languages.services.LangService;

@Controller

public class HomeController {
	@Autowired
	private LangService aService;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("allLang", this.aService.getAllLang());
		return "index.jsp";
	}
	
}
