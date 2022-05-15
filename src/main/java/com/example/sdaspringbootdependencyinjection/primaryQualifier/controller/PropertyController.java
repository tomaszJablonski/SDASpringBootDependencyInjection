package com.example.sdaspringbootdependencyinjection.primaryQualifier.controller;

import com.example.sdaspringbootdependencyinjection.primaryQualifier.repository.GreetingRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@Getter

public class PropertyController {
    private final GreetingRepository greetingRepository;

    public PropertyController(@Qualifier("propertyGreetingService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }


    public String getGretting() {
        return greetingRepository.sayGreeting();
    }
}
