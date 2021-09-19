package com.patricia.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
			return "index.jsp";
	}
	@RequestMapping("/date")
		public String date(Model model) {
			Date date = new Date();
			model.addAttribute("date", date);
			
			return "date.jsp";
	}
	
	@RequestMapping("/time")
		public String time(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
			return "time.jsp";
	}
}
