package com.csci6366.project.controller;

import com.csci6366.project.model.Person;
import com.csci6366.project.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/person")
    Person newPerson(@RequestBody Person newPerson){
        return personRepository.save(newPerson);
    }
}
