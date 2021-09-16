package com.patricia.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@SpringBootApplication

@RestController 
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
		
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello";
	}
	
	@RequestMapping("/random")
	public String helloTwo(){
		return "Spring boot is great";
	}
	

}
