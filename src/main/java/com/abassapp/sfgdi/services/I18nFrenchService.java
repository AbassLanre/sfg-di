package com.abassapp.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("i18nService")
public class I18nFrenchService implements GreetingServiceInterface{
    @Override
    public String sayGreeting() {
        return "Bonjour Monde - FR";
    }
}
