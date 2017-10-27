package com.company;

import java.util.Scanner;

public class UPC {

    public boolean UP = false;
    // main(): application entry point
    public void checker(long barcode) {
        final long MAX_POSSIBLE_UPC_CODE = 999999999999L;

        // set input stream and get number
        long input = barcode;
        long number = input;

        // determine whether number is a possible upc code
        if ((input < 0) || (input > MAX_POSSIBLE_UPC_CODE)) {
            // not a upc code
            System.out.println(input + " is an invalid UPC code");
        }
        else {
            // might be a upc code

            // determine individual digits
            int d12 = (int) (number % 10);
            number /= 10;
            int d11 = (int) (number % 10);
            number /= 10;
            int d10 = (int) (number % 10);
            number /= 10;
            int d9 = (int) (number % 10);
            number /= 10;
            int d8 = (int) (number % 10);
            number /= 10;
            int d7 = (int) (number % 10);
            number /= 10;
            int d6 = (int) (number % 10);
            number /= 10;
            int d5 = (int) (number % 10);
            number /= 10;
            int d4 = (int) (number % 10);
            number /= 10;
            int d3 = (int) (number % 10);
            number /= 10;
            int d2 = (int) (number % 10);
            number /= 10;
            int d1 = (int) (number % 10);
            number /= 10;

            // compute sums of first 5 even digits and the odd digits
            int m = d2 + d4 + d6 + d8 + d10;
            int n = d1 + d3 + d5 + d7 + d9 + d11;

            // use UPC formula to determine required value for d12
            int r = 10 - ((m + 3*n) % 10);

            // based on r, can test whether number is a UPC code
            if (r == d12) {
                // is a upc code
                UP = true;
            }
            else {
                // not a upc code
                UP = false;
            }
        }
    }

}
//https://www.cs.virginia.edu/javaprogramdesign/code/1.5/ch05/UPC.java