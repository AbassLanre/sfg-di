package com.abassapp.sfgdi.controller;

import com.abassapp.sfgdi.services.GreetingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingServiceInterface greetingServiceInterface;

    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImplementation") GreetingServiceInterface greetingServiceInterface) {
        this.greetingServiceInterface = greetingServiceInterface;
    }

    public String getGreeting(){
        System.out.println(greetingServiceInterface.sayGreeting());
        return greetingServiceInterface.sayGreeting();
    }
}
