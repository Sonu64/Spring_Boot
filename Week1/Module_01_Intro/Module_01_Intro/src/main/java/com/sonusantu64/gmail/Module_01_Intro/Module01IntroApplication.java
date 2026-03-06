package com.sonusantu64.gmail.Module_01_Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module01IntroApplication implements CommandLineRunner {
	@Autowired
	PaymentService paymentServiceObj;

	public static void main(String[] args) {
		SpringApplication.run(Module01IntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		paymentServiceObj.pay();
	}
}