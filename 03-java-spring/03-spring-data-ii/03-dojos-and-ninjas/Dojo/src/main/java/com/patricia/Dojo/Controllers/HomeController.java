package com.patricia.Dojo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.patricia.Dojo.Models.Dojo;
import com.patricia.Dojo.Models.Ninja;
import com.patricia.Dojo.Services.DojoService;
import com.patricia.Dojo.Services.NinjaService;

@Controller
public class HomeController {
	private final DojoService dService;
	private final NinjaService nService;
	
	public HomeController(DojoService dService,NinjaService nService) {
		this.dService = dService;
		this.nService = nService;
	}
	
	@GetMapping("/")
	public String index(@ModelAttribute("Dojo") Dojo dojo,Model model) {
		List<Dojo> dojos = dService.allDojos();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	
	@PostMapping("/newdojo")
	public String createDojo(@Valid @ModelAttribute("Dojo") Dojo dojo,BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/";
		}
		dService.createDojo(dojo);
			return "redirect:/";
	}
	
	@GetMapping("/addNinja")
		public String addNinja(@ModelAttribute("Ninja")Ninja ninja,Model model) {
			List<Dojo> dojos = dService.allDojos();
			List<Ninja> ninjas = nService.allNinjas();
			model.addAttribute("dojos", dojos);
			model.addAttribute("ninjas", ninjas);
			System.out.println("number of");
			System.out.println(dojos.size());
			return "ninja.jsp";
			
	}
	
	@PostMapping("/createNinja")
		public String createNinja(@Valid @ModelAttribute("Ninja") Ninja ninja,BindingResult result) {
			if(result.hasErrors()) {
				return "ninja.jsp";
			}
			nService.createNinja(ninja);
			return "redirect:/addNinja";
		
	}
	
	@GetMapping("/show/{dojoid}")
	 public String show(@PathVariable("dojoid")Long id,Model model) {
		model.addAttribute("dojo", this.dService.getDojo(id));
		model.addAttribute("ninja", this.nService.findByDojo(id));
		return "show.jsp";
	}
}