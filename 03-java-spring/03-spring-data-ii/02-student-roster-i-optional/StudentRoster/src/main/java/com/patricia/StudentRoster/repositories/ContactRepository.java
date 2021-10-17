package com.patricia.StudentRoster.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.patricia.StudentRoster.models.Contact;

public interface ContactRepository extends CrudRepository <Contact, Long> {
	List<Contact> findAll();

}
