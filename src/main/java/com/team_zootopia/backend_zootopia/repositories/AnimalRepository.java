package com.team_zootopia.backend_zootopia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.team_zootopia.backend_zootopia.models.Animal;


@Repository
public interface AnimalRepository extends CrudRepository<Animal,Long> {

    
        Animal findByName(String animal);
    
        
    }