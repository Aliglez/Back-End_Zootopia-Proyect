package com.team_zootopia.backend_zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.team_zootopia.backend_zootopia.models.User;
import com.team_zootopia.backend_zootopia.repositories.UserRepository;

@Service
public class UserService {
    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll(){
        List<User> users = repository.findAll();
        return users;
    }
    
}
