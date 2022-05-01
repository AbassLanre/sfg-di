package com.abassapp.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImplementation implements GreetingServiceInterface{
    @Override
    public String sayGreeting() {
        return "Hello Boys -- Constructor";
    }
}
