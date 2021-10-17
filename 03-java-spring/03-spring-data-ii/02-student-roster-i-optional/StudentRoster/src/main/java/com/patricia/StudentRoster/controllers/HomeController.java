package com.patricia.StudentRoster.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.patricia.StudentRoster.models.Contact;
import com.patricia.StudentRoster.models.Student;
import com.patricia.StudentRoster.services.ContactService;
import com.patricia.StudentRoster.services.StudentServices;

@Controller
public class HomeController {
	private final StudentServices sService;
	private final ContactService cService;
	
	public HomeController(StudentServices sService, ContactService cService) {
		this.cService = cService;
		this.sService = sService;
	}
	
	@GetMapping("/")
	public String index(@ModelAttribute("Student") Student student, Model model) {
		List<Student> students = sService.allStudents();
		model.addAttribute("students", students);
		return "index.jsp";
	}
	
	@PostMapping("/create")
	public String createStudent(@Valid @ModelAttribute("Student")Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		sService.createStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/addContact")
	 public String contactPage(@ModelAttribute("Contact") Contact contact,Model model) {
		List<Student> students = sService.allStudents();
		List<Contact> contacts = cService.allContacts();
		model.addAttribute("students", students);
		model.addAttribute("contacts", contacts);
		return "contact.jsp";
	}
	
	@PostMapping("/createContact")
		public String createContact(@Valid @ModelAttribute("Contact") Contact contact, BindingResult result) {
			if (result.hasErrors()) {
				return "redirect:/";
			}
			cService.createContact(contact);
			return "redirect:/addContact";
	}
}
