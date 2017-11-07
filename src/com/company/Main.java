package com.company;

import java.util.Scanner;

public class Main {

    static backEnd a = new backEnd();
    private static frontEnd b = new frontEnd();
    public static void main(String[] args) {


        // Scanner in  = new Scanner(System.in);


        new tester1();






        int mode = 1;  //decides mode, I guess
        Scanner mo = new Scanner(System.in); //decides mode
        Scanner bud = new Scanner(System.in); //sets budget
        Scanner bar = new Scanner(System.in); // to input barcode and price

        while (mode!=0) {
            System.out.println("What would you like to do next?");
            System.out.println("0 to exit, 1 to add a new barcode, 2 to check price, 3 to set budget, and 4 to start shopping");
            mode = mo.nextInt();
            if (mode == 0) {

                System.out.println("goodbye");

            }
            else if (mode == 1) {

                //UI UNDERGOING MAINTENANCE
                // VVV IS THE FIRST SECTION TO GET WORKABLE UI VVV
                System.out.println("input barcode");
                long barcode = bar.nextLong();
                System.out.println("input price");
                double price = bar.nextDouble();
                a.addBarcode(barcode, price);

            }
            else if (mode == 2) {

                System.out.println("input barcode");
                long barcode = bar.nextLong();
                System.out.println("price is $" + a.priceCheck(barcode));

            }
            else if (mode == 3) {

                System.out.println("enter budget to set");
                double budge = bud.nextDouble();
                a.setBudget(budge);

            }
            else if (mode == 4) {

                b.shop();

            }
        }
    }
}
