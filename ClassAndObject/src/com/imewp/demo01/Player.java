package com.imewp.demo01;

public class Player {
    int number = 0;   //要被猜的数字

    public Player() {
    }

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
