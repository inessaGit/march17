package com.startsteps;

public class SwitchExample {

    public static void main(String[] args) {
        int day = 4; // Example day of the week
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        // Example with String
        String month = "July";
        switch (month) {
            case "January":
                System.out.println("1st month");
                break;
            case "February":
                System.out.println("2nd month");
                break;
            case "July":
                System.out.println("7th month");
                break;
            default:
                System.out.println("Unknown month");
                break;
        }

        //Example with multiple cases doing the same thing.
        int number = 1;
        switch (number){
            case 1:
            case 2:
            case 3:
                System.out.println("Number is 1, 2, or 3");
                break;
            default:
                System.out.println("Number is not 1, 2, or 3");
        }
    }
}