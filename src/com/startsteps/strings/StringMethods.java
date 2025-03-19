package com.startsteps.strings;

public class StringMethods {

    public static  void createString(){
        String str1 = "Hello"; // String literal
        String str2 = new String("World"); // Using the constructor
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray); // From a char array

    }

    public static void main (String args[]){
        createString();
    }

}
