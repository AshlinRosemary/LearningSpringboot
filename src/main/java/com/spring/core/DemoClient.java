package com.spring.core;

import com.spring.core.DemoController.DemoController;
import com.spring.core.DemoRepository.DemoRepository;
import com.spring.core.DemoService.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext (AppConfig.class);

        DemoController demoController=applicationContext.getBean(DemoController.class);
        System.out.println(demoController.hello());

        DemoService demoService=applicationContext.getBean(DemoService.class);
        System.out.println(demoService.hello());

        DemoRepository demoRepository=applicationContext.getBean(DemoRepository.class);
        System.out.println(demoRepository.hello());
    }
}
