package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    //private EmailService emailService;
    //Field based injection
    @Autowired
    @Qualifier("emailService")
    private MessageService messageService;
    @Autowired
    private MessageService smsService;
    /*Set DI
    @Autowired
    public void setSmsService(MessageService smsService) {
        this.smsService = smsService;
        System.out.println("Setter based injection for SMS service while Email service is present ");
    }

    @Autowired
    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
        System.out.println("Setter based Injection for Email Service");
    }*/

    /*private MessageService smsService;
        //@Autowired
        public MessageSender(@Qualifier("emailService") MessageService messageService){

            this.messageService=messageService;
            System.out.println("Constructor based dependency Injection");
        }
        @Autowired
        public MessageSender(@Qualifier("emailService") MessageService messageService,
                             MessageService smsService){

            this.messageService=messageService;
            this.smsService=smsService;
            System.out.println("Constructor based dependency Injection 2");
        }*/
    public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
