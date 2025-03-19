package com.startsteps.numbers;

 class DataTypeExcercise {
     int age = 25; // Integer value
     double temperature = 36.6; // Decimal value
     char initial = 'J'; // Single character
     boolean isJavaFun = true; // True or False
     String name = "Alice"; // Text value

    public static void main(String[] args) {
        // write your code here
        test();
        DataTypeExcercise dte = new DataTypeExcercise();
        dte.print();
        dte.modifyValues();
    }

public    void print(){
    System.out.println("Age: " + age);
    System.out.println("Temperature: " + temperature);
    System.out.println("Initial: " + initial);
    System.out.println("Is Java Fun? " + isJavaFun);
    System.out.println("Name: " + name);
}

public void modifyValues(){
    age = 30;
    temperature = 40.5;
    initial = 'K';
    isJavaFun = false;
    name = "Bob";
    System.out.println("\nUpdated Values:");
    System.out.println("Age: " + age);
    System.out.println("Temperature: " + temperature);
    System.out.println("Initial: " + initial);
    System.out.println("Is Java Fun? " + isJavaFun);
    System.out.println("Name: " + name);
}
    public static void test() {
        int number = 10;
        double convertedDouble = number; // Implicit conversion
        double price = 99.99;
        int convertedInt = (int) price; // Explicit conversion
        System.out.println("\nType Casting:");
        System.out.println("Converted to double: " + convertedDouble);
        System.out.println("Converted to int: " + convertedInt);
    }
}
