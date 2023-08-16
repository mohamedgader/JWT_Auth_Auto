package com.jwt.security.repository;

import com.jwt.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
}
