package com.example.com.example.SpringBootTest.repos;

import com.example.com.example.SpringBootTest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
  User findByUsername(String username);
}
