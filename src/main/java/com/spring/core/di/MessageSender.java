package com.spring.core.di;

public class MessageSender {

    //private EmailService emailService;
    private MessageService messageService;
    public MessageSender(MessageService messageService){
        this.messageService=messageService;
    }

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
    }
}
