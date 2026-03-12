package com.sonusantu64.gmail.Module_01_Intro.impl;

import com.sonusantu64.gmail.Module_01_Intro.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Primary
@Service
@Component
@Qualifier("englishGreeting")
public class EnglishGreeting implements GreetingService {
    @Override
    public void sendGreeting() {
        System.out.println("Welcome Mate !!");
    }
}
