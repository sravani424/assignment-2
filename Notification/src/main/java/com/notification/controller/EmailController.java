package com.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.notification.entity.Email;
import com.notification.service.EmailSenderService;

@RestController
public class EmailController {
	
	@Autowired
	private EmailSenderService emailSenderService;

	@PostMapping("/sendEmail")
	public void sendEmail(@RequestBody Email email) {
		emailSenderService.sendSimpleEmail(email);
	}
	
}
