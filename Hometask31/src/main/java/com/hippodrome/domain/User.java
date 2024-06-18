package com.hippodrome.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class User {
    private int balance;

    public void lostBet(int bet) {
        balance -= bet;
    }

    public void winBet(int bet) {
        balance += bet;
    }
}
