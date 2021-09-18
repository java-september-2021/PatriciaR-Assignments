package com.patricia.human.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

		@RequestMapping("/")
		public String human() {
			return "Hello Human" + System.lineSeparator() + "Welcome to SpringBoot!";
		}
		
		@RequestMapping("/{name}")
		public String humanName(@PathVariable String name) {
			return "Hello " + name + System.lineSeparator() + "Welcome to SpringBoot!"; 
			
		}
}
