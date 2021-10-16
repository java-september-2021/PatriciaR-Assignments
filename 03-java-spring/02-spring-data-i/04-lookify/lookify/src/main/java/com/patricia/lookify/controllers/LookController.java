
  package com.patricia.lookify.controllers;
  
  import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.patricia.lookify.models.*;
  import com.patricia.lookify.services.LookService;
  
  @Controller
  
  public class LookController {
  
  private final LookService lookService;
  
  public LookController(LookService lookService) { 
	  this.lookService = lookService; 
  }
  
  //localhost:8080
  @GetMapping("/") 
  public String index() { 
	  return "index.jsp"; 
  }
  //dashboard displays nav and songs in database and search form
  @GetMapping("/dashboard")
  	public String dashBoard(Model model) {
	  List<Look> look = lookService.allLooks();
	  model.addAttribute("look", look);
	  model.addAttribute("searchInput", new Look());
	  
 	  return "dashboard.jsp";
  }
  
  //get for new.jsp to add new songs
  @GetMapping("/new")
  	public String create(Model model) {
	  model.addAttribute("look", new Look());
	  return "new.jsp";
  }
  
  //adds new songs 
  @PostMapping("/add")
  	public String addLook(@Valid @ModelAttribute("look") Look look, BindingResult result) {
	  	if (result.hasErrors()) {
	  		return "new.jsp";
	  	}
	  	this.lookService.createLook(look);
	  	return "redirect:/new";
  }
  
  //deletes songs 
  @GetMapping("/delete/{id}")
  	public String delete(@PathVariable("id")Long id) {
	  this.lookService.deleteLook(id);
	  return "redirect:/dashboard";
	  
  }
  
  //shows details of a particular song
  @GetMapping("/details/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("look", this.lookService.getOne(id));
		return "view.jsp";
}
  //top tens songs
  @GetMapping("/top")
  	public String topTen(Model model) {
	  List<Look> look = lookService.top();
	  model.addAttribute("look", look);
	  	return "topten.jsp";
}
  	
  @PostMapping("/search")
  	public String search(@Valid @ModelAttribute("searchInput") Look searchInput, BindingResult result,Model model) {
	  List<Look> searchResult = lookService.searchByArtist(searchInput.getArtist());
	  model.addAttribute("searchResult", searchResult);
	  return "result.jsp";
  }
   
  }