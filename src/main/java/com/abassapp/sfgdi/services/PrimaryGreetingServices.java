package com.abassapp.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServices implements GreetingServiceInterface {
    @Override
    public String sayGreeting() {
        return "Hello from Primary";
    }
}
