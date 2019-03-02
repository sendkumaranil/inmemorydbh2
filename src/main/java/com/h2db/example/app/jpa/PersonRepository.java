package com.h2db.example.app.jpa;

import org.springframework.data.repository.CrudRepository;

import com.h2db.example.app.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
