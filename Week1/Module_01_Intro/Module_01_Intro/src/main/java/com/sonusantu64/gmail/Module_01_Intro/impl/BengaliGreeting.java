package com.sonusantu64.gmail.Module_01_Intro.impl;

import com.sonusantu64.gmail.Module_01_Intro.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Qualifier("bengaliGreeting")
public class BengaliGreeting implements GreetingService {
    @Override
    public void sendGreeting() {
        System.out.println("Nomoshkar Dada :) ");
    }
}
