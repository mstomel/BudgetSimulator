package com.company;

import java.util.Scanner;

import static com.company.Main.a;

class frontEnd {

    private Boolean shopping = true;
    private Scanner active = new Scanner(System.in); //active shopper or finished shopper
    private Scanner items = new Scanner(System.in); //gets item barcodes
    private Scanner bud = new Scanner(System.in); //budget setter
    private double total = 0;
    void shop() {

        double budgetRemaining = backEnd.budget;
        System.out.println("your budget is " + backEnd.budget);
        while (shopping) {

            if (budgetRemaining <= 0) {

                System.out.println("you have reached your spending limit");  //add phone vibration or sound or similar here
                System.out.println("would you like to finish(0) or raise budget(1)"); //ends if 0 continues with new budget if 1
                if (active.nextInt() == 0 ) {

                    break;

                }

                else if (active.nextInt() == 1) {

                    System.out.println("enter amount to add to budget");
                    double pre = backEnd.budget;//budget before change
                    double add = bud.nextDouble();//amount to add to budget
                    a.setBudget(pre + add);//new budget
                    budgetRemaining = backEnd.budget - total;//new budget remaining

                }
            }
            System.out.println("input next item barcode or press 0 to finish");
            long nextBar = items.nextLong(); //next purchase
            if (nextBar == 0) {

                shopping = false; //stops shopping

            }
            else {

                budgetRemaining -= a.priceCheck(nextBar); //gets price of item and subtracts it from budget
                total += a.priceCheck(nextBar); //keeps track of total money spent
                System.out.println("you have $" + budgetRemaining + " left"); // tells user their remaining buying power

            }
        }
    }
}
