package com.hippodrome;


import com.hippodrome.domain.User;
import com.hippodrome.service.Hippodrome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        Hippodrome game = context.getBean(Hippodrome.class);

        System.out.println("Welcome to Hippodrome!");
        System.out.println("Your balance is: " + user.getBalance() + " RUB");

        game.displayHorses();
    }
}