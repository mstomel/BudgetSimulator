package com.company;

class UPC {

    Boolean UP = false;
    // main(): application entry point
    void checker(long barcode) {
        final long MAX_POSSIBLE_UPC_CODE = 999999999999L;

        // set input stream and get number
        long input = barcode;

        // determine whether number is a possible upc code
        if ((input < 0) || (input > MAX_POSSIBLE_UPC_CODE)) {
            // not a upc code
            System.out.println(input + " is an invalid UPC code");
        }
        else {
            // might be a upc code

            // determine individual digits
            int d12 = (int) (input % 10);
            input /= 10;
            int d11 = (int) (input % 10);
            input /= 10;
            int d10 = (int) (input % 10);
            input /= 10;
            int d9 = (int) (input % 10);
            input /= 10;
            int d8 = (int) (input % 10);
            input /= 10;
            int d7 = (int) (input % 10);
            input /= 10;
            int d6 = (int) (input % 10);
            input /= 10;
            int d5 = (int) (input % 10);
            input /= 10;
            int d4 = (int) (input % 10);
            input /= 10;
            int d3 = (int) (input % 10);
            input /= 10;
            int d2 = (int) (input % 10);
            input /= 10;
            int d1 = (int) (input % 10);
            //input /= 10;

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
        }
    }

}
//https://www.cs.virginia.edu/javaprogramdesign/code/1.5/ch05/UPC.java