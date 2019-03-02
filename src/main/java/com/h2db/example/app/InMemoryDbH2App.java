package com.h2db.example.app;
/**
 * @author anilkumar
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InMemoryDbH2App {

	public static void main(String[] args) {
		SpringApplication.run(InMemoryDbH2App.class, args);
	}
}
