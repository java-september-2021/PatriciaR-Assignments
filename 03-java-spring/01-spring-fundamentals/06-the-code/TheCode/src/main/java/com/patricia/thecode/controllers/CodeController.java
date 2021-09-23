package com.patricia.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
		public String index(Model model,@ModelAttribute("errors") String errors) {
			model.addAttribute("errors", errors);
			return "index.jsp";
			
	}
	
	@RequestMapping(path ="/secret", method = RequestMethod.POST)
		public String errors(RedirectAttributes redirectAttributes, @RequestParam(value="code") String code) {
			if (code.equals("bushido")) {
				return "secret.jsp";
			}else {
				redirectAttributes.addFlashAttribute("errors", "You must train harder");
				return "redirect:/";
			
			}
	}
}
