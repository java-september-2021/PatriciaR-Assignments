package com.patricia.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class SurveyController {
	@RequestMapping("/")
		public String index() {
			return "index.jsp";
	}
	
	@RequestMapping(path ="/showdata", method = RequestMethod.POST)
		public String showData(Model Model, HttpSession session, @RequestParam(value ="your_name") String your_name, @RequestParam(value ="location") String location, @RequestParam(value = "lang") String lang, @RequestParam(value = "comments") String comments) {
		Model.addAttribute("your_name", your_name);
		Model.addAttribute("location", location);
		Model.addAttribute("lang", lang);
		Model.addAttribute("comments", comments);
		if (lang.equals("Java")){
			return "java.jsp";
		}
		return "success.jsp";
	}
}
