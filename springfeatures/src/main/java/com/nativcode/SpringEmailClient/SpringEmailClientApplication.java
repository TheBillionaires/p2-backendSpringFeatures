package com.nativcode.SpringEmailClient;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailClientApplication {
	
	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailClientApplication.class, args);
	
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		String toEmail ="thebillionairesproject2@gmail.com";
		String body = "Your ticket is booked: April 5 at 9am";
		String subject = "Japan Flight";
		service.sendSimpleEmail(toEmail,
				 body,
				subject);
	}
}