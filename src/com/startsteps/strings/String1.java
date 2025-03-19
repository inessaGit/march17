package com.startsteps.strings;

class String1 {

    public static void main(String[] args) {
        String special_char = "Line one\n" + "Line two\n";
        System.out.println(special_char);
        trim();
        substringExample();
    }

    public static void trim(){
        String text = "       Cut string";
        // The trim function is meant to eliminate leading & trailing spaces
        text.trim();
        // Without assigning the text variable to the trimmed string
        System.out.println(text); //not trimmed because Strings immutable

        // Assigning trimmed string to the variable
        text = text.trim();
        System.out.println(text);
    }
    public static void substringExample(){
        String choice = "CoffeeOrTea";
        //First: Only one argument
        System.out.println(choice.substring(8));

        //Second: Two arguments
        System.out.println(choice.substring(0, 6));
    }
}