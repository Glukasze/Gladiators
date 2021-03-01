package com.rozan.main;

import com.rozan.main.gladiators.Gladiator;

import java.util.Scanner;

public class Arena {

    private Gladiator gladiator1;
    private Gladiator gladiator2;

    private boolean playing = true;
    private int flip = 0;


    public Arena(Gladiator gladiator1, Gladiator gladiator2) {
        this.gladiator1 = gladiator1;
        this.gladiator2 = gladiator2;
    }


    public void play() {

        Scanner scanner = new Scanner(System.in);


        while (playing) {
            String input  = scanner.nextLine();
            if (flip == 0) {
                gladiator1.attack(gladiator2);
                flip = 1;
                if (gladiator2.isDead()) {
                    playing = false;
                    System.out.println(gladiator2.getName() + " is dead!");
                }
            } else if (flip == 1) {
                gladiator2.attack(gladiator1);
                flip = 0;
                if (gladiator1.isDead()) {
                    playing = false;
                    System.out.println(gladiator1.getName() + " is dead!");
                }
            }
            System.out.println(gladiator1.getName() + "'s hp: " + gladiator1.getCurrentHp());
            System.out.println(gladiator2.getName() + "'s hp: " + gladiator2.getCurrentHp());
        }
    }
}
