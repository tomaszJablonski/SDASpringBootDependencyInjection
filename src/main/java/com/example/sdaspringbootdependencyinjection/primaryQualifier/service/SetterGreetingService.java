package com.example.sdaspringbootdependencyinjection.primaryQualifier.service;

import com.example.sdaspringbootdependencyinjection.primaryQualifier.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Wstrzyknięcie przez setter";
    }
}
