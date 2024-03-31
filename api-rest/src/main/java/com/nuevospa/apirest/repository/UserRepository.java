package com.nuevospa.apirest.repository;

import java.util.Optional;

import com.nuevospa.apirest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
	Optional<User> findByUsername(String username);
}
