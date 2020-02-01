package com.Labcom.demo.resource;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


public class SendEmail{
	@Autowired
	public JavaMailSender javaMailSender;

	public void sendmail(String otpsent,String email) throws AddressException, MessagingException, IOException {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject("use the OTP below to reset your password");
		msg.setText(otpsent);
		javaMailSender.send(msg); 
	}
}
