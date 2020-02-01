package com.Labcom.demo.Controller;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Labcom.demo.Model.Ufs_Authentication;
import com.Labcom.demo.Model.Ufs_Otp;
import com.Labcom.demo.Repository.Ufs_Authentication_Repository;
import com.Labcom.demo.Repository.Ufs_Otp_Repository;
import com.Labcom.demo.resource.SendEmail;


@RestController
public class Ufs_Otp_Controller {

	@Autowired
	private Ufs_Otp_Repository repository;

	@Autowired
	private Ufs_Authentication_Repository repo;

	public Ufs_Otp_Controller(Ufs_Otp_Repository repository) {
		this.repository = repository;
	}

	@RequestMapping(value="/get/otp", method = RequestMethod.POST)
	public Ufs_Otp getOtp(@RequestBody Ufs_Otp otp) throws AddressException, MessagingException, IOException{

		Random random = new Random();
		String id = String.format("%04d", random.nextInt(10000));

		otp.setOtp(id);

		sendEmail();

//		Ufs_Authentication_Controller controller = new Ufs_Authentication_Controller(repo);	
//		String Email = controller.setEmail();
		

		otp.setCreation_date(new Date());
		return repository.save(otp);
	}
	
	public String sendEmail() throws AddressException, MessagingException, IOException {
		SendEmail send = new SendEmail();
		send.sendmail("meza", "eddinsstivons@gmail.com");
		return "Email sent successfully";   
	}


}
