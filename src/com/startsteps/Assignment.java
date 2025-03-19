package com.startsteps;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1️⃣ Print Hello World and Personal Info
        System.out.println("Hello, GitHub Classroom!");
        // Declare variables for name, age, and GPA (Replace with your values)
        String name = "Inessa"; // TODO: Replace with your name
        int age = 31; // TODO: Replace with your age
        double gpa = 4.0; // TODO: Replace with your estimated GPA

        // Print the variables
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My estimated GPA is " + gpa + ".");

        // 2️⃣ Number System Conversion: User Input
        System.out.print("\nEnter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        // Convert and display in different bases
        System.out.println("Binary: " + decimalToBinary(decimalNumber));
        System.out.println("Octal: " + decimalToOctal(decimalNumber));
        System.out.println("Hexadecimal: " + decimalToHexadecimal(decimalNumber));

        // 3️⃣ Bonus: Convert Binary to Decimal
        System.out.print("\nEnter a binary number: ");
        String binaryInput = scanner.next();
        // Convert binary to decimal
        System.out.println("Decimal equivalent: " + binaryToDecimal(binaryInput));
        // 4️⃣ Challenge: Build a simple Number System Converter
        runNumberSystemConverter();
        scanner.close();
    }

    // ✅ Task 1: Convert Decimal to Binary (Without Built-in Methods)
    public static String decimalToBinary(int decimal) {
        // TODO: Implement manual conversion (Repeated Division by 2)
       //  String binaryString = Integer.toBinaryString(decimal);
        if (decimal == 0) {
            return "0";
        }
        //mutable
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;//use modulo operator
            sb.insert(0, remainder); // Prepend the remainder
            decimal = decimal/2; // Updates the decimal number by integer division by 2, preparing for the next iteration.
        }
        return sb.toString();
    }

    // ✅ Task 2: Convert Binary to Decimal (Without parseInt)
    public static int binaryToDecimal(String binary) {
        // TODO: Implement manual conversion using Positional Value method
        if (binary == null || binary.isEmpty()) {
            return 0; // Or throw an IllegalArgumentException for invalid input
        }
        int decimalValue = 0;
        int power = 0;
        // Iterate through the binary string from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit != '0' && bit != '1') {
                throw new IllegalArgumentException("Invalid binary string: contains non-binary characters.");
            }
            if (bit == '1') {
                decimalValue += Math.pow(2, power);
            }
            power++;
        }
        return decimalValue;
    }

    // ✅ Task 3: Convert Decimal to Octal (Without Built-in Methods). Don't do it yet March 18
    public static String  decimalToOctal (int decimal){
        if (decimal == 0) {
            return "0";
        }
        int  originalDecimal = decimal;
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder); // Prepend the remainder
            decimal = decimal / 8;
        }
        String result =octal.toString();
    //    System.out.println(("Conversion from decimal to octal: "+originalDecimal+"--> "+result));
        return result;
    }

    // ✅ Task 4: Convert Decimal to Hexadecimal (Without Built-in Methods)
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

    // ✅ Bonus: Interactive Number System Converter
    public static void runNumberSystemConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect a conversion:");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Decimal to Octal");
        System.out.println("4. Decimal to Hexadecimal");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter a decimal number: ");
                int dec = scanner.nextInt();
                System.out.println("Binary: " + decimalToBinary(dec));
                break;
            case 2:
                System.out.print("Enter a binary number: ");
                String bin = scanner.next();
                System.out.println("Decimal: " + binaryToDecimal(bin));
                break;
            case 3:
                System.out.print("Enter a decimal number: ");
                int decOct = scanner.nextInt();
                System.out.println("Octal: " + decimalToOctal(decOct));
                break;
            case 4:
                System.out.print("Enter a decimal number: ");
                int decHex = scanner.nextInt();
                System.out.println("Hexadecimal: " + decimalToHexadecimal(decHex));
                break;
            default:
                System.out.println("Invalid choice! Please select 1-4.");
        }
    }
}
