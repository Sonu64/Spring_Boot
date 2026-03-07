package com.sonusantu64.gmail.Module_01_Intro.impl;

import com.sonusantu64.gmail.Module_01_Intro.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SmsNotification")
@ConditionalOnProperty(name="notification.type", havingValue="sms")
public class SmsService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending notification " + message + " via Email...");
    }
}
