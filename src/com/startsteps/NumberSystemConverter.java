package com.startsteps;

/*
he program should ask the user to choose a conversion:
1. Decimal to Binary
2. Binary to Decimal
3. Decimal to Octal
4. Decimal to Hexadecimal
Based on the user’s choice, call the appropriate method.
Enter your choice: 1
Enter decimal number: 45
Binary: 101101
 */
public class NumberSystemConverter {

    public static void main(String[] args) {
        // write your code here
    }
    public static String decimalToBinary(int decimal) {
        int originalDecimal =decimal;
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary; // Get remainder and add to front
            decimal /= 2;
        }
       // System.out.println(("Conversion from decimal to binary: "+originalDecimal+" "+binary));
        return binary;
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        String originalBinary = binary;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
       // System.out.println(("Conversion from binary to decimal: "+originalBinary+" "+decimal));
        return decimal;
    }

    public static int decimalToOctal (int decimal){
        if (decimal == 0) {
            return 0;
        }
        int  originalDecimal = decimal;
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder); // Prepend the remainder
            decimal = decimal / 8;
        }
        int result =Integer.valueOf(octal.toString()); //convert StringBuilder to int
     //   System.out.println(("Conversion from decimal to octal: "+originalDecimal+"--> "+result));
        return result;
    }

}
