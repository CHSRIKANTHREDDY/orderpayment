package com.example.orderplace.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.orderplace.entity.Order1;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailsender;// interface for SMTP

	@Value("${spring.mail.username}")
	private String sender;
	


	public void sendEmail(String toEmail, String subject, String body,Order1 ss) {
		
		System.out.println("orderdata ----"+ss);
		SimpleMailMessage message = new SimpleMailMessage();
		
		
		body="ORDERPLACED"
		+'\n'+
		 +'\n'+
		 +'\n'+
		 +'\n'+		
		"Product details"+
		"______________________________________________________________________________"+'\n'+
				"AccountId is "+ ss.getAccId()+'\n'+
				"AMOUNT is"+ss.getAmount()+'\n'+
			"BANKNAME"+ss.getBankName()+'\n'+
				"STATUS is"+ss.getStatus()
				 +'\n'+
				  +'\n'+
				   +'\n'+
		"                                            THANKS    ";
		      
		message.setFrom(sender);
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		mailsender.send(message);

		System.out.println("mail sended successfully ...");
	}
}
