package com.javatechie.registrationservice.repository;

import com.javatechie.registrationservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByEmail(String email);
}
