package com.patricia.TvShows.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.patricia.TvShows.Models.Show;
import com.patricia.TvShows.Models.User;
import com.patricia.TvShows.Services.ShowService;
import com.patricia.TvShows.Services.UserService;
import com.patricia.TvShows.Validators.EmailValidator;

@Controller
public class HomeController {
	private final UserService userService;
	private final ShowService showService;
    private final EmailValidator emailValid;
    
    public HomeController(UserService userService, ShowService showService, EmailValidator email) {
        this.userService = userService;
        this.showService = showService;
        this.emailValid= email;
        email.uService = userService;
    }
    
    @GetMapping("/")
    	public String index(@ModelAttribute("user")User user, Model model) {
    		return "index.jsp";
    }
    
    @PostMapping("/registration")
    	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    		emailValid.validate(user, result);
    		if(result.hasErrors()) {
    			return"index.jsp";
    		}
    		User u = userService.registerUser(user);
	        session.setAttribute("userId", u.getId());
	        return "redirect:/shows";
    }
    
    @PostMapping("/login")
    	public String loginUser(@ModelAttribute("user")User user,@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    	 String error ="Invalid"; 
    	boolean isAuthenticated = userService.authenticateUser(email, password);
	        if(isAuthenticated) {
	        	User u = userService.findByEmail(email);
	        	session.setAttribute("userId", u.getId());
	        	return "redirect:/shows";
	        } else {
	        	model.addAttribute("error", error);
	        	return "index.jsp";
	        }
    }
	        
	   @GetMapping("/shows")
	   		public String showsPage(@ModelAttribute("shows") Show show,HttpSession session, Model model) {
		   
		   Long userId =(Long) session.getAttribute("userId");
	    	User u = userService.findUserById(userId);
	    	model.addAttribute("user", u);
	    	List<Show> shows = this.showService.getAllShows();
	    	model.addAttribute("shows", shows);
	    	return "shows.jsp";
	   }
	   
	   @GetMapping("/logout")
	   		public String logout(HttpSession session) {
		   session.invalidate();
		   return "redirect:/";
	   }
	   
	   @GetMapping("/shows/new")
	   		public String newShow(@ModelAttribute("show") Show show) {
		   		return "addShow.jsp";
	   }
	   
	   @PostMapping("/addShow")
	   		public String createShow(@Valid @ModelAttribute("show")Show show, BindingResult result,HttpSession session) {
		   		
		   		if (result.hasErrors()) {
		   			
		   			return "addShow.jsp";
		   			
		   		}
		   		Long userId =(Long) session.getAttribute("userId");
		   		User u = userService.findUserById(userId);
		   		this.showService.createShow(show);
		   		this.showService.addUserToShow(u, show);
		   		return "redirect:/shows";
	   }
	   @GetMapping("/show/{id}")
		   public String showDetail(@PathVariable("id") Long id, Model model) {
		   	 
			   model.addAttribute("show", this.showService.getOneShow(id));
			  
			   return "thisshow.jsp";
		   }
	   
	   @GetMapping("/edit/{id}")
	   		public String showEdit(@PathVariable("id")Long id, @ModelAttribute("show") Show show, Model model) {
		   		model.addAttribute("show", this.showService.getOneShow(id));
		   		return "edit.jsp";
	   }
	   
	   @PostMapping("/edit/{id}")
	   		public String edit(@Valid @ModelAttribute("show") Show show,BindingResult result,@PathVariable("id")Long id,Model model) {
		   		if (result.hasErrors()) {
		   			model.addAttribute("show", this.showService.getOneShow(id));
		   			return "edit.jsp";
		   		}
		   		this.showService.editShow(show);
		   		return "redirect:/shows";
	   }
	   
	   @GetMapping("/delete/{id}")
	   		public String delete(@PathVariable("id") Long id, Model model) {
		   		this.showService.deleteShow(id);
		   		return"redirect:/shows";
	   }
    	
}
