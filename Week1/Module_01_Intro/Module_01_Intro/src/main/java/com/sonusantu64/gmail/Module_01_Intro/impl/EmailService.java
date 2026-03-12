package com.sonusantu64.gmail.Module_01_Intro.impl;
import com.sonusantu64.gmail.Module_01_Intro.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("EmailNotification")
@ConditionalOnProperty(name="notification.type", havingValue="email")
public class EmailService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending notification " + message + " via Email...");
    }
}
