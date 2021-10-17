package com.patricia.StudentRoster.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patricia.StudentRoster.models.Student;
import com.patricia.StudentRoster.repositories.StudentRepository;

@Service
public class StudentServices {
	private final StudentRepository studentRepo;
	
	public StudentServices(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	public List<Student> allStudents(){
		return studentRepo.findAll();
	}
	
	public Student createStudent(Student s) {
		return studentRepo.save(s);
	}
}
