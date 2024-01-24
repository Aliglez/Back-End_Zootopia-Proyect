package com.team_zootopia.backend_zootopia.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team_zootopia.backend_zootopia.models.User;
import com.team_zootopia.backend_zootopia.services.UserService;

@RestController
@RequestMapping(path = "${api-endpoint}/users")
public class UserController {

    UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping (path = "")
    public List<User> index() {
        return service.getAll();
    }
    
}
