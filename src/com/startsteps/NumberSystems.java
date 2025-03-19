package com.startsteps;
import java.util.Scanner;

public class NumberSystems {
    public static void main(String[] args) {
      // convert ();
        decimalToBinary(17);
        decimalToBinary(42);
        //decimalToBinary(93);
       // decimalToBinary(125);
       // decimalToBinary(256);
       // decimalToBinary(512);
       // binaryToDecimal("1011"); //11
        binaryToDecimal("1010"); //10
        binaryToDecimal("11001"); //25
        decimalToOctal(19); //23
        decimalToOctal(57); //71


    }
/*
1. Convert 17₁₀ to binary. | 17 =  1001
2. Convert 42₁₀ to binary. | 42₁₀ = 101010₂
3. Convert 93₁₀ to binary. | 93₁₀ = 1011101₂
4. Convert 125₁₀ to binary. | 125₁₀ = 1111101₂
5. Convert 256₁₀ to binary. | 256₁₀ = 100000000₂
6. Convert 512₁₀ to binary. | 512₁₀ = 1000000000₂
7. Convert 999₁₀ to binary. | 999₁₀ = 1111100111₂
8. Convert 2048₁₀ to binary.| 2048₁₀ = 10000000000₂
9. Convert 350₁₀ to binary. | 350₁₀ = 101011110₂
10. Convert 786₁₀ to binary. | 786₁₀ = 1100010010₂
 */
    public static String decimalToBinary(int decimal) {
        int originalDecimal =decimal;
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary; // Get remainder and add to front
            decimal /= 2;
        }
        System.out.println(("Conversion from decimal to binary: "+originalDecimal+" "+binary));
        return binary;
    }
/*
31. Convert 1011₂ to decimal. | 11
32. Convert 11001₂ to decimal. | 25
33. Convert 111010₂ to decimal. | 234
34. Convert 1001101₂ to decimal.| 77
35. Convert 10101010₂ to decimal | 170
36. Convert 11001100₂ to decimal. | 204
37. Convert 11111111₂ to decimal. | 255
38. Convert 100000000₂ to decimal.| 256
39. Convert 1011011011₂ to decimal.| 731
40. Convert 1101001100₂ to decimal.| 844


 */
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
        System.out.println(("Conversion from binary to decimal: "+originalBinary+" "+decimal));
        return decimal;
    }
    /* Convert Decimal to Octal (5 Points)
    Convert 19 to octal. | 23
    Convert 57 to octal | 71
*/
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
        System.out.println(("Conversion from decimal to octal: "+originalDecimal+"--> "+result));
        return result;
    }
    public static void convert(){
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        // Convert to other numeral systems
        String binary = Integer.toBinaryString(decimalNumber);
        String octal = Integer.toOctalString(decimalNumber);
        String hexadecimal = Integer.toHexString(decimalNumber);

        // Print the results
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        //Step 2: Modify the program to also accept a Binary number and convert it to Decimal
        System.out.print("Enter a binary number: ");
        int binaryNum = scanner.nextInt();
        String str = String.valueOf(binaryNum);//convert int to String
        System.out.println("Decimal: " + Integer.parseInt(str,2));
        //        String binaryNumber = "101101 exp 45
    }
}