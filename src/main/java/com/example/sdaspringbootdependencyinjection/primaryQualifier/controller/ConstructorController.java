package com.example.sdaspringbootdependencyinjection.primaryQualifier.controller;

import com.example.sdaspringbootdependencyinjection.primaryQualifier.repository.GreetingRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@Getter
public class ConstructorController {

    private final GreetingRepository greetingRepository;

    public ConstructorController(@Qualifier("constructorGreetingService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGretting() {
        return greetingRepository.sayGreeting();
    }

}
