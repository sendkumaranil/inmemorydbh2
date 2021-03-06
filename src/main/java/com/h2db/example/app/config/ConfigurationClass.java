package com.h2db.example.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.validation.Validator;

import com.h2db.example.app.validator.DataSourceValidator;

@Configuration
public class ConfigurationClass {

    
	@Bean
	public static Validator configurationPropertiesValidator(Environment env) {
		return new DataSourceValidator(env);
	}
	
}
