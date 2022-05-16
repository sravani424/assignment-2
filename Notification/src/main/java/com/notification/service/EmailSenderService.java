package com.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.notification.entity.Email;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailSender;
	
	public void sendSimpleEmail(Email email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("sravanipolamada@gmail.com");
		message.setTo(email.getToMail());
		message.setSubject(email.getSubject());
		message.setText(email.getBody());
		
		
		mailSender.send(message);
		System.out.println("mail send......");
	}
}
