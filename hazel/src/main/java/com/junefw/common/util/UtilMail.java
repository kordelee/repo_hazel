package com.junefw.common.util;


//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;

//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;


public class UtilMail {

//	private final JavaMailSender javaMailSender = null;
//	
//	
//	
//	
//	
//	public static void sendMail() {
//		
//		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
//		
//		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//		
//		simpleMailMessage.setFrom("adsrundev@adsrun.kr");
//		
//		simpleMailMessage.setTo("kordelee@naver.com");
////		simpleMailMessage.setTo("kordelee@naver.com","excitingmvr@gmail.com");
//		simpleMailMessage.setSubject("tetetest");
//		simpleMailMessage.setText("asdfasdfasdf");
//		
//		
//		javaMailSenderImpl.send(simpleMailMessage);
//		
//	}

	

//	public static void sendMail() {
//		
//		System.out.println("asdfasdf");
//		
//		final String username = "zestykboy@gmail.com";
//        final String password = "ayekttpcwuzqwhaq";
//
//        Properties prop = new Properties();
//		prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true");
//        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
//        
//        Session session = Session.getInstance(prop,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("zestykboy@gmail.com"));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse("excitingmvr@gmail.com, kordelee@naver.com")
//            );
//            message.setSubject("Testing Gmail TLS");
//            message.setText("Dear Mail Crawler,"
//                    + "\n\n Please do not spam my email!");
//
//            Transport.send(message);
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//	}
}
