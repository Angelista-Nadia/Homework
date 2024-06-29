package com.hippodrome.service;

import com.hippodrome.domain.Horse;
import com.hippodrome.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Service
public class Hippodrome {

    private final List<Horse> horses;
    private final User user;

    public Hippodrome(List<Horse> horses, User user) {
        this.horses = horses;
        this.user = user;
    }

    public void displayHorses() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hippodrome!");
        System.out.println("Your balance is: " + this.user.getBalance() + " RUB");

        while (user.getBalance() > 0) {

           // List<Horse> horses = this.horses;
            System.out.println("Horses in the race:");
            for (Horse horse : horses) {
                System.out.println("* " + horse.getName());
            }

            System.out.print("Enter the horse: ");
            String myHorse = scanner.next();
            boolean validHorse = false;
            for (Horse horse : horses) {
                if (horse.getName().equals(myHorse)) {
                    validHorse = true;
                    break;
                }
            }

            if (!validHorse) {
                System.out.println("Invalid horse name. Please try again.");
                continue;
            }

            System.out.print("Your bet: ");
            int bet = scanner.nextInt();

            if (bet > user.getBalance()) {
                System.out.println("Your bet exceeds your balance. Please try again.");
                continue;
            }

            String winningHorse = getWinHorse().getName();
            System.out.println("The winning horse is: " + winningHorse);

            if (myHorse.equals(winningHorse)) {
                System.out.println("You won!");
                user.winBet(bet);
            } else {
                System.out.println("You lost!");
                user.lostBet(bet);
            }

            System.out.println("Final balance: " + user.getBalance());

        }
        System.out.println("Game over.");
    }

    private Horse getWinHorse() {
        Random random = new Random();
        int index = random.nextInt(horses.size());
        return horses.get(index);
    }
}
