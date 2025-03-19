package com.startsteps;

import java.util.*;

public class HW3 {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int num){
        boolean isEven=false;
        if(num%2==0) isEven=true;
        System.out.println("Is even =" + isEven);
        return isEven;
    }

}
class TestHW3{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (HW3.isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        HW3.isEven(num);
        scanner.close();
    }

}
