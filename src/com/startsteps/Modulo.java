package com.startsteps;
/*
Examples:

7 % 3 returns 1 (because 7 divided by 3 is 2 with a remainder of 1).
10 % 5 returns 0 (because 10 divided by 5 is 2 with a remainder of 0).
15 % 4 returns 3 (because 15 divided by 4 is 3 with a remainder of 3).
 */
public class Modulo {
    public static void main(String[] args) {
        int num = 17;
        num %= 3;  // Equivalent to num = num % 3;
        System.out.println("num: " + num);
        ownCode();
    }

    public static  void ownCode(){
        int a = 100;
        a+= 10 ;
        a  -= 20 ;
        a *= 2;
        a/= 5 ;
        a%= 3 ;
    }
}