package com.spring.core.di;

public class MessageSender {

    private EmailService emailService;

    public MessageSender(EmailService emailService){
        this.emailService=emailService;
    }

    public void sendMessage(String message){
        this.emailService.sendMessage(message);
    }
}
