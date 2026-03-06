package com.sonusantu64.gmail.Module_01_Intro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void afterConstructBeforeUsage() {
        System.out.println("Connecting to Google-Pay Service....");
        System.out.println("✓ Successfully connected to Google-Pay Service.");
    }

    @PreDestroy
    public void afterUsageBeforeDestroy() {
        System.out.println("Disconnecting from Google-Pay Service....");
        System.out.println("✓ Successfully disconnected from Google-Pay Service.");
    }
}
