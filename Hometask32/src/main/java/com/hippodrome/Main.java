package com.hippodrome;

import com.hippodrome.service.HippodromeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HippodromeService game = context.getBean(HippodromeService.class);

        game.displayHorses();
    }
}