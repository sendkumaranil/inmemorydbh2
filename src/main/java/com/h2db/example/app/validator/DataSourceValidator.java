package com.h2db.example.app.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.h2db.example.app.config.DataSourceProperties;


public class DataSourceValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz == DataSourceProperties.class;
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "host", "host.empty");
		DataSourceProperties dp=(DataSourceProperties)target;
		if(StringUtils.isEmpty(dp.getPassword())) {
			errors.rejectValue("password","password can not be null");
		}
		
	}

}
