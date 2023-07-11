package com.spring.core.di;

public class Client {
    public static void main(String[] args) {

    String message="Hi Goodmorning";

    SMSService smsService=new SMSService();
    EmailService emailService=new EmailService();
//Tight Coupling without dependency Injection --> Message Sender depends
    MessageSender messageSender=new MessageSender(emailService);
    messageSender.sendMessage(message);
    }
}
