package com.patricia.routing.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class DojoController {
	
	@RequestMapping("/{name}")
		public String pathVar(@PathVariable String name) {
			return "The " + name + " is awesome";
	}
	
	@RequestMapping("/{name}/{location}")
		public String location(@PathVariable String name, @PathVariable String location) {
			
			if (location.equals ("burbank") && name.equals("dojo")) {
				return location +" "+ name +" is located in Southern California";
			}else if (location.equals("san-jose") && name.equals("dojo")){
				return "SJ dojo is headquarters";
				
			}
			return location + " not a valid location";
		
			
	}
	

}
