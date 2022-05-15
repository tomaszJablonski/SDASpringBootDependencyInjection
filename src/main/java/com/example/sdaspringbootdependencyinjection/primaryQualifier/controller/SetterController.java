package com.example.sdaspringbootdependencyinjection.primaryQualifier.controller;

import com.example.sdaspringbootdependencyinjection.primaryQualifier.repository.GreetingRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@Getter

public class SetterController {
    private final GreetingRepository greetingRepository;

    public SetterController(@Qualifier("setterGreetingService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }


    public String getGretting() {
        return greetingRepository.sayGreeting();
    }
}
