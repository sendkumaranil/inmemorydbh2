package com.h2db.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.h2db.example.app.entities.Person;
import com.h2db.example.app.exception.RecordNotFoundException;
import com.h2db.example.app.service.PersonService;

/**
 * 
 * @author anilkumar
 *
 */
@RestController
public class PersonResource {

	@Autowired
    PersonService personService;

    @GetMapping("/persons")
    private ResponseEntity<List<Person>> getAllPersons() {
    	List<Person> persons=personService.getAllPersons();
    		if(persons.size() < 1) {
    			throw new RecordNotFoundException("Record Not Found");
    		}
        return ResponseEntity.ok(persons);
    }

    @GetMapping("/persons/{id}")
    private Person getPerson(@PathVariable("id") int id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/persons/{id}")
    private void deletePerson(@PathVariable("id") int id) {
        personService.delete(id);
    }

    @PostMapping("/persons")
    private int savePerson(@RequestBody Person person) {
        personService.saveOrUpdate(person);
        return person.getId();
    }
}
