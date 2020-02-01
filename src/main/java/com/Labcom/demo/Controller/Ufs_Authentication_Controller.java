package com.Labcom.demo.Controller;

import java.io.IOException;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Labcom.demo.Model.Ufs_Authentication;
import com.Labcom.demo.Repository.Ufs_Authentication_Repository;
import com.Labcom.demo.resource.SendEmail;

@RestController
public class Ufs_Authentication_Controller {
	
	public String saveEmail = "" ;

	@Autowired
	private Ufs_Authentication_Repository repository;
	
	public Ufs_Authentication_Controller(Ufs_Authentication_Repository repository) {
		this.repository = repository;
	}
	
	@RequestMapping("/authentication/{username}")
	public Ufs_Authentication getEmail(@PathVariable(name = "username") String username) throws AddressException, MessagingException, IOException {
		Ufs_Authentication authentication = (Ufs_Authentication) repository.findByUsername(username);
		
		Random random = new Random();
		String id = String.format("%04d", random.nextInt(10000));

		
		SendEmail send = new SendEmail();
		send.sendmail("ki", "eddinsstivons@gmail.com");
		
		saveEmail = id;
		return authentication;
	}
	
	public String setEmail() {
		
		return saveEmail;
	}
	
}
