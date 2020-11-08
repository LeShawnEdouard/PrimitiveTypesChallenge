package com.company;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

        byte byteValue = 120;
        short shortValue = 32750;
        int intValue = 500;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal); // No casting needed because Java assumes the above variables are int

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);
    }
}
