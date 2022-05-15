package com.example.sdaspringbootdependencyinjection.catAndDog.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository {

    String checkPet();
}
