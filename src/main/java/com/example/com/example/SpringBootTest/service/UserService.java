package com.example.com.example.SpringBootTest.service;

import com.example.com.example.SpringBootTest.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

  @Autowired
  private UserRepo userRepo;
  /*
  // Как надо делать
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
      this.userRepo = userRepo;
    }
  */
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return userRepo.findByUsername(username);
  }
}
