package com.company;

class backEnd {

    public double prices[];
    public static double budget;
    void setBudget(double budge) {

        budget = budge;
        System.out.println("budget set at " + budget);

    }
    private boolean check3;
    void addBarcode(double barcode, double price) {
        
        //UPC-A barcodes are  12 digits long
        String check1 = Double.toString(barcode);
        int check2 = ((((check1.charAt(0) + check1.charAt(2) + check1.charAt(4) + check1.charAt(6) + check1.charAt(8) + check1.charAt(10))*3) + check1.charAt(1) + check1.charAt(3) + check1.charAt(5) + check1.charAt(7) + check1.charAt(9)) % 10);
        // ((((check1.charAt(0) + check1.charAt(2) + check1.charAt(4) + check1.charAt(6) + check1.charAt(8) + check1.charAt(10))*3) + check1.charAt(1) + check1.charAt(3) + check1.charAt(5) + check1.charAt(7) + check1.charAt(9)) % 10)
        //test bar UPC-A: 036000241457

        if (check2 == 0) {

            if (check1.charAt(11) == 0) {

               check3 = true;

            }
            else {

                System.out.println("invalid barcode");

            }
        }
        else if ((10 - check2) == check1.charAt(11)) {

            check3 = true;

        }
        else {

            System.out.println("invalid barcode");

        }
        if ((check1.length() == 12) && check3) {

            prices[(int)barcode] = price;
            System.out.println("successfully saved " + barcode + "as $" + price);

        }
    }
    double priceCheck(int barcode) {

        //System.out.println("price of " + barcode +" is " + prices[barcode]);
        double p = prices[barcode];
        return p;

    }
}
