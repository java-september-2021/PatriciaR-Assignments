package com.patricia.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class CounterController {
	
	
	@RequestMapping("/")
		public String index(HttpSession session) {
			
			return "index.jsp";
	}
	
	@RequestMapping("/count")
	    public String count(HttpSession session, Model model) {
	       	Integer count;
	        if (session.getAttribute("count")== null) {
	        	count = 0;
	        } else {
	        	count = (Integer) session.getAttribute("count");
	        	count++;
	        }
	            session.setAttribute("count", count);
	            model.addAttribute("count", count);
	            return "count.jsp";
	            
	        }
	
	@RequestMapping("/flush")
		public String flush(HttpSession session, Model model) {
		session.invalidate();
		
		return "logout.jsp";
		
	}
	
	        
	        
	       
	    


		
		
	}

