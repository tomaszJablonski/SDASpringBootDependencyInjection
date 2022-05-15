package com.example.sdaspringbootdependencyinjection.catAndDog.controller;

import com.example.sdaspringbootdependencyinjection.catAndDog.service.CatPetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("cat")
public class CatController {

    private final CatPetService catPetService;

    public CatController(@Qualifier("catPetService") CatPetService catPetService) {
        this.catPetService = catPetService;
    }

    public String getCat() {
        return catPetService.checkPet();
    }
}
