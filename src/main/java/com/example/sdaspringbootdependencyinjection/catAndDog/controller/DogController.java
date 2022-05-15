package com.example.sdaspringbootdependencyinjection.catAndDog.controller;

import com.example.sdaspringbootdependencyinjection.catAndDog.service.DogPetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile({"dog", "dev"})
public class DogController {

    private final DogPetService dogPetService;

    public DogController(@Qualifier("dogPetService") DogPetService dogPetService) {
        this.dogPetService = dogPetService;
    }

    public String getDog() {
        return dogPetService.checkPet();
    }
}
