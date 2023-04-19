package com.csci6366.project.repository;

import com.csci6366.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

