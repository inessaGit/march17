package com.startsteps.strings;

public class Educative {
    public static void main(String[] args) {
        // write your code here
        // parseString();
       // concatStrings();
        shiftChars();
        reverseString();
    }

    public static void parseString(){
        String str = "educative";
        int lenght =str.length();
        for(int i=0;i<lenght; i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void concatStrings(){
        String str ="hello";
        int num =9;
        double num2=9.2;
        String result = str+num;
        System.out.println(result);//hello9
        System.out.println(str+num);//hello9
        System.out.println(num+str);//int+string = 9hello
        System.out.println(num2+str);//int+string = 9.2hell
    }

    public  static void test()
        {
            String str = "Educative";
            int length = str.length() ;
            //loop from the end
            for (int i=length-1;i>=0; i--){
                System.out.println(str.charAt(i));
            }
    }
    //Write a program that shifts the characters of a string to the left and replaces the last position with a dot.
    // Educative -> ducative.
    public static void shiftChars() {
        String str = "Educative";
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < length; i++) {
            char ch = str.charAt(i);
            sb.append(ch);
        }
        sb.append('.');
        System.out.println(sb);
    }

    //Write a program that stores the string into another string in reverse order.
    //Educative -> evitacudE
    public static void reverseString(){
        String str = "Educative";
        int length = str.length();
        StringBuilder sb = new StringBuilder();

        for(int i =length-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
        String str2 ="Inessa";
        System.out.println(new StringBuilder(str2).reverse());
    }
}
