package com.example.sdaspringbootdependencyinjection.primaryQualifier.service;

import com.example.sdaspringbootdependencyinjection.primaryQualifier.repository.GreetingRepository;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class ConstructorGreetingService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "wstrzyknięcie przez konstruktor";
    }
}
