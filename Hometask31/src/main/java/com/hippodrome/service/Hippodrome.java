package com.hippodrome.service;

import com.hippodrome.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Service
public class Hippodrome {

    @Autowired
    private List<String> horses;

    @Autowired
    private User user;

    public  void displayHorses() {

        Scanner scanner = new Scanner(System.in);

        while (user.getBalance() > 0) {

            List<String> horses = this.horses;
            System.out.println("Horses in the race:");
            for (String horse : horses) {
                System.out.println("* " + horse);
            }

            System.out.print("Enter the horse: ");
            String myHorse = scanner.next();
            if (!horses.contains(myHorse)) {
                System.out.println("Invalid horse!");
                continue;
            }

            System.out.print("Your bet: ");
            int bet = scanner.nextInt();

            if (bet > user.getBalance()) {
                System.out.println("Your bet exceeds your balance. Please try again.");
                continue;
            }

            String winningHorse = getWinHorse();
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

    private String getWinHorse() {
        Random random = new Random();
        int index = random.nextInt(horses.size());
        return horses.get(index);
    }
}
