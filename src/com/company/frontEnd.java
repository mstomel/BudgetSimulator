package com.company;

import java.util.Scanner;

import static com.company.Main.a;

public class frontEnd {

    public double budgetRemaining = backEnd.budget;
    public void shop() {

        System.out.println("your budget is " + backEnd.budget);
        System.out.println("type 0 at any time to stop shopping");
        Scanner active = new Scanner(System.in); //active shopper or finished shopper
        Scanner items = new Scanner(System.in); //gets item barcodes
        Scanner bud = new Scanner(System.in); //budget setter
        boolean shopping = true;
        while (shopping) {

            if (active.nextInt() == 0) {

                shopping = false;

            }
            else if (budgetRemaining <= 0) {

                System.out.println("you have reached your spending limit");
                System.out.println("would you like to finish(0) or change budget(1)");
                if (active.nextInt() == 0 ) {

                    shopping = false;

                }
                else if (active.nextInt() == 1) {

                    System.out.println("enter budget to set");
                    double budge = bud.nextDouble();
                    a.setBudget(budge);

                }
            }
            else {

                System.out.println("input next item barcode");
                int nextBar = items.nextInt();
                budgetRemaining -= a.priceCheck(nextBar);
                System.out.println("you have " + budgetRemaining + " dollars left");

            }
        }
    }
}
