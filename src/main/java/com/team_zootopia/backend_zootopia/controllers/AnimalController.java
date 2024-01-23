package com.team_zootopia.backend_zootopia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team_zootopia.backend_zootopia.models.Animal;
import com.team_zootopia.backend_zootopia.services.IAnimalService;
@RestController
@RequestMapping(value = "/animals")
public class AnimalController {
    @Autowired
    private IAnimalService animalService;

    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals(){
        return ResponseEntity.ok(animalService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Animal> getAnimalsById(@PathVariable Long id){
        return animalService.findById(id)
                .map(animal -> ResponseEntity.ok().body(animal))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
