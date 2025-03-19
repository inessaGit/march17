package com.startsteps.strings;

public class StringEquals {

    public static void main (String[]args){
        isSameString();
    }
    public static void isSameString(){
        String str1 = "hello";
        String str2 = new String("hello");
        if (str1 == str2) {
            // this condition is false, even though str1 and str2 have the same contents
            System.out.println("The result of ==");
        }
        if (str1.equals(str2)) {
            // this condition is true,
            System.out.println("The result of .equals");
        }
    }
}
