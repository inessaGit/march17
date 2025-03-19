package com.startsteps;

public class DecimalToHexadecimal {

    public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexDigit;
            if (remainder < 10) {
                hexDigit = (char) ('0' + remainder);
            } else {
                hexDigit = (char) ('A' + (remainder - 10));
            }
            hexadecimal.insert(0, hexDigit); // Prepend the hexadecimal digit
            decimal = decimal / 16;
        }
        return hexadecimal.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 255;
        String hexadecimalNumber = decimalToHexadecimal(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Hexadecimal: " + hexadecimalNumber); // Output: Hexadecimal: FF

        decimalNumber = 42;
        hexadecimalNumber = decimalToHexadecimal(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Hexadecimal: " + hexadecimalNumber); // Output: Hexadecimal: 2A

        decimalNumber = 10;
        hexadecimalNumber = decimalToHexadecimal(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Hexadecimal: " + hexadecimalNumber); // Output: Hexadecimal: A

        decimalNumber = 0;
        hexadecimalNumber = decimalToHexadecimal(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Hexadecimal: " + hexadecimalNumber); // Output: Hexadecimal: 0
    }
}