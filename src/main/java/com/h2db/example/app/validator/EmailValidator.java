package com.h2db.example.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class EmailValidator implements ConstraintValidator<Email, String> {

	@Override
	public boolean isValid(String email, ConstraintValidatorContext validator) {
		
		if(!email.contains("@")) {
			return false;
		}
		return true;
	}

}
