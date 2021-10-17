package com.patricia.StudentRoster.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patricia.StudentRoster.models.Contact;
import com.patricia.StudentRoster.repositories.ContactRepository;

@Service
public class ContactService {
 private final ContactRepository contactRepo;
 
 	public ContactService(ContactRepository contactRepo) {
 		this.contactRepo = contactRepo;
 	}
 	
 	public List<Contact> allContacts(){
 		return contactRepo.findAll();
 	}
 	
 	public Contact createContact(Contact c) {
 		return contactRepo.save(c);
 	}
 	
 	
}
