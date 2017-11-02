package com.company;

import java.util.Map;
import java.util.HashMap;

class backEnd {

    private Map<Long, Double> data = new HashMap<>();
    static double budget;
    void setBudget(double budge) {

        budget = budge;
        System.out.println("budget set at $" + budget);

    }
    void addBarcode(long barcode, double price) {

        data.put(barcode, price);
        System.out.println("successfully saved " + barcode + " as $" + price);

        //test bar UPC-A: 036000241457

    }
    double priceCheck(long barcode) {

        return data.get(barcode);

    }
}
