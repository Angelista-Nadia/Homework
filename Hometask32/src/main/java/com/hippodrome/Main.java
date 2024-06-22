package com.hippodrome;

import com.hippodrome.service.Hippodrome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.setProperty("server.port", "4000");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Hippodrome game = context.getBean(Hippodrome.class);

        game.displayHorses();
    }
}