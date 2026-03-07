package com.sonusantu64.gmail.Module_01_Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module01IntroApplication implements CommandLineRunner {
	@Autowired
	PaymentService paymentServiceObj;

	@Autowired
	PaymentService paymentServiceObj2;

	public static void main(String[] args) {
		SpringApplication.run(Module01IntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(paymentServiceObj.hashCode());
		System.out.println(paymentServiceObj2.hashCode());
		//  Both have Same HashCode -> Pointing to same object in memory -> Singleton Scoped Beans are most common
		// and used for >99% of applications. Other scopes are considered 'Anti-Design' Pattern and not recommended
		// to use.
		paymentServiceObj.pay();
		paymentServiceObj2.pay();
	}
}