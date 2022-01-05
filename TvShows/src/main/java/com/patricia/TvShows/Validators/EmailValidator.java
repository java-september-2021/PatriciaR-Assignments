package com.patricia.TvShows.Validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.patricia.TvShows.Models.User;
import com.patricia.TvShows.Services.UserService;
@Component
public class EmailValidator implements Validator {
	public UserService uService;
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if(uService.findByEmail(user.getEmail() )!= null) {
			errors.reject("emailExists", "Email already exists");
		
		}
		
		
	}

//	public EmailValidator(UserService uService) {
//		super();
//		this.uService = uService;
//	}

}
