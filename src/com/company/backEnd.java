package com.company;

import java.util.Map;
import java.util.HashMap;

class backEnd {

    Map<Long, Double> data = new HashMap<>(); //maps prices to barcodes
    static double budget; //the budget of the user
    //sets a new budget
    void setBudget(double budge) {

        budget = budge;
        System.out.println("budget set at $" + budget);

    }
    //adds a barcode with a price to the database
    void addBarcode(long barcode, double price) {

        data.put(barcode, price); //saves price to barcode
        System.out.println("successfully saved " + barcode + " as $" + price); //confirms with user

        //test bar UPC-A: 036000241457

    }
    //gets the price of an item
    double priceCheck(long barcode) {

        return data.get(barcode); //retrieves price value of barcode input

    }
}
