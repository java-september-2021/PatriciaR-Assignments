package com.patricia.ninjagold.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Gold {
	@GetMapping("/")
		public String index(Model viewModel, HttpSession session) {
			if (session.getAttribute("total") == null) {
				session.setAttribute("total", 0);
			}
			viewModel.addAttribute("total", session.getAttribute("total"));
			return "index.jsp";
	}
	
	@PostMapping("/findgold")
		public String findGold(@RequestParam("building") String build, HttpSession session) {
			int total = (int) session.getAttribute("total");
		   Random rand = new Random();
		   int t = 0;
		   if (build.equals("farm")) {//earns 10 - 20 gold
			 t = rand.nextInt(20 - 10) + 10;
		   }else if(build.equals("cave")){// earns 5-10 gold
			    t = rand.nextInt(10-5) + 5;
		   }else if(build.equals("house")) {//earns 2-5 gold
			   t = rand.nextInt(5-2) + 2;
		   }else if(build.equals("casino")) {
			   t = rand.nextInt(20-10)+ 10;//earns 10-20gold
		   }
		   
		  total = total + t;
		  session.setAttribute("total", total);
		  
		  return ("redirect:/");
		   
		   
	}
	
}
