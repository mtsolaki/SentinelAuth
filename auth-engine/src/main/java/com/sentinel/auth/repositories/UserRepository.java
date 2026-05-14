package com.sentinel.auth.repositories;

import com.sentinel.auth.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    //Query to find a user by his email
    Optional<User> findByEmail(String email);
    
}
