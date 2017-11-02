package com.company;

import java.util.Scanner;

import static com.company.Main.a;

class frontEnd {

    private Boolean shopping = true;
    private Scanner active = new Scanner(System.in); //active shopper or finished shopper
    private Scanner items = new Scanner(System.in); //gets item barcodes
    private Scanner bud = new Scanner(System.in); //budget setter
    void shop() {

        double budgetRemaining = backEnd.budget;
        System.out.println("your budget is " + backEnd.budget);
        while (shopping) {

            if (budgetRemaining <= 0) {

                System.out.println("you have reached your spending limit");
                System.out.println("would you like to finish(0) or change budget(1)");
                if (active.nextInt() == 0 ) {

                    //shopping = false;
                    break;

                }

                else if (active.nextInt() == 1) {

                    System.out.println("enter budget to set");
                    double budge = bud.nextDouble();
                    a.setBudget(budge);

                }
            }
            System.out.println("input next item barcode or press 0 to finish");
            long nextBar = items.nextLong();
            if (nextBar == 0) {

                shopping = false;

            }
            else {

                budgetRemaining -= a.priceCheck(nextBar);
                System.out.println("you have " + budgetRemaining + " dollars left");

            }
        }
    }
}
