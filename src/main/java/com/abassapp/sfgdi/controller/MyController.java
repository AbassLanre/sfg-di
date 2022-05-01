package com.abassapp.sfgdi.controller;

import com.abassapp.sfgdi.services.GreetingServiceInterface;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingServiceInterface greetingServiceInterface;

    public MyController(GreetingServiceInterface greetingServiceInterface) {
        this.greetingServiceInterface = greetingServiceInterface;
    }

    public String sayHello(){
        return greetingServiceInterface.sayGreeting() + " hiii";
    }

}
