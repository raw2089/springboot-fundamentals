package com.demo;

import com.demo.service.PlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        PlayerService playerService = context.getBean("playerService", PlayerService.class);
        System.out.println(playerService);

        PlayerService playerService2 = context.getBean("playerService", PlayerService.class);
        System.out.println(playerService2);

        System.out.println(playerService.getPlayerName().get(0).getPlayerName());
    }
}
