package com.example.sdaspringbootdependencyinjection.primaryQualifier.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository {

    String sayGreeting();
}
