package com.example.sdaspringbootdependencyinjection.catAndDog.service;

import com.example.sdaspringbootdependencyinjection.catAndDog.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class DogPetService implements PetRepository {


    @Override
    public String checkPet() {
        return "dog";
    }
}
