package com.sonusantu64.gmail.Module_01_Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module01IntroApplication implements CommandLineRunner {

	// Dependency Injection
	// Using @Autowired directly is Field-Level DI, not preferred for Production apps.
    //@Autowired is optional here to Choose the primary Bean ( @Component from the App Context)
	// See below comment for details !
    private final NotificationService notificationService; //--> the Primary component would be used, from all the beans
	// (@Components !)

	Module01IntroApplication(NotificationService notificationService) {
		this.notificationService = notificationService;
		//--> So we can also make it final now, so it is totally safe against Any sort of changing the service,
		// willingly, or unwillingly !
		//-- Constructor level DI, best for Production Apps.
	}
	//---the dependency on a notification service is injected to the app.

	public static void main(String[] args) {
		SpringApplication.run(Module01IntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		notificationService.sendNotification("TEST NOTIFICATION");
	}
}

/// A Singleton means there is only one "instance"
/// (the data/state of the class). It does not mean the methods can only be called once.

//1. How Spring "Chooses" Without @Autowired
//When Spring sees your constructor Module01IntroApplication(NotificationService
// notificationService), it does a "Look-up" in the Sack of Beans:
//The Request: "I need a bean of type NotificationService to build this App."
//The Search: It finds all classes marked with @Component (or @Service) that implement
// NotificationService.
//The Conflict: If it finds two (e.g., EmailService and SmsService), it pauses.
//The Resolution: It looks for the @Primary annotation on one of those classes.
// If EmailService has @Primary, or chosen via Qualifer or ConditionalOnProperty(name=notification.type)
// Spring says, "Okay, this is the 'Chosen One'," and injects it into your constructor automatically.
//The Rule: If you have only one constructor, @Autowired is implicit. Spring assumes,
// "If he wrote a constructor with these parameters, he obviously wants me to inject them."
