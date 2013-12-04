package com.eventplanner.common;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	
	public SendMail(String sendTo, String subject, String body) throws UnsupportedEncodingException {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
 
		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("event.planner.plan","sharpcoders");
				}
			});
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("event.planner.plan@gmail.com", "Event planner"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(sendTo));
					message.setSubject(subject);
				message.setText(body);
			
			
			
 
			Transport.send(message);
 
			System.out.println("Email Sent");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}
