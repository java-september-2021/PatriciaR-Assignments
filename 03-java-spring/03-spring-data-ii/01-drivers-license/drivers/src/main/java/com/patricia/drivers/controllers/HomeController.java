package com.patricia.drivers.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.patricia.drivers.models.Person;
import com.patricia.drivers.models.lic;
import com.patricia.drivers.services.DriverService;
import com.patricia.drivers.services.LicService;

@Controller
public class HomeController {
	private final DriverService dService;
	private final LicService lService;
	
	public HomeController (DriverService dService, LicService lService) {
		this.dService = dService;
		this.lService = lService;
	}
	
	@GetMapping("/")
	 public String index(@ModelAttribute("Person") Person person,Model model) {
		List<Person> persons = dService.allPersons();
		model.addAttribute("person", persons);
		return "index.jsp";
	}
	
	@PostMapping("/create")
		public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
			if (result.hasErrors()) {
				return "index.jsp";
			}
			dService.createPerson(person);
			return "redirect:/";
	}
	
	@GetMapping("/newlic")
		public String newlic(@ModelAttribute("Lic")lic lic,Model model) {
		List<Person> persons = dService.allPersons();
		List<lic> lics = lService.allLic();
		model.addAttribute("persons", persons);	
		model.addAttribute("lics", lics);
		System.out.println("number of lics");
		System.out.println(lics.size());
			return "newlic.jsp";
	}
	
	@PostMapping("/createlic")
		public String createLic(@Valid @ModelAttribute("Lic") lic lic,BindingResult result) {
			if(result.hasErrors()) {
				List<ObjectError> errors = result.getAllErrors();
				for (ObjectError e : errors) {
					System.out.println(e);
				}
				return "redirect:/";
			}
			lService.createLic(lic);
				return "redirect:/newlic";
			
	}
}
