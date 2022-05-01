package com.abassapp.sfgdi.controller;

import com.abassapp.sfgdi.services.GreetingServiceInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingServiceInterface greetingServiceInterface;

    public I18nController(@Qualifier("i18nService") GreetingServiceInterface greetingServiceInterface) {
        this.greetingServiceInterface = greetingServiceInterface;
    }
    public String getGreeting(){
        System.out.println(greetingServiceInterface.sayGreeting());
        return greetingServiceInterface.sayGreeting();
    }

}
