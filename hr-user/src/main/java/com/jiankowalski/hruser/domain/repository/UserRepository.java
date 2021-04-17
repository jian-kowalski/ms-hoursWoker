package com.jiankowalski.hruser.domain.repository;

import java.util.Optional;

import com.jiankowalski.hruser.domain.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByEmail(String email);

}
