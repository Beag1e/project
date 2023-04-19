package com.csci6366.project.repository;

import com.csci6366.project.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}

