package com.startsteps.oop;

class Date {
    private int day;
    private int month;
    private int year;
    private String  weekday;

    // Default constructor #1
    public Date() {
        // We must define the default values for day, month, and year
        day = 0;
        month = 0;
        year = 0;
        weekday="not set yet";
    }

    // Parameterized constructor #2
    public Date(int d, int m, int y){
        // The arguments are used as values
        day = d;
        month = m;
        year = y;
    }
    //parametarized constructor #3
    public Date(int day,int month, int year,String weekday){
        //because args name is the same as class memeber variable name (weekday) we use this
        this(day,month,year); //calling thte constructor #2
        this.weekday=weekday;
    }

    // A simple print function
    public void printDate(){
        System.out.println("Date: " + day + "/" + month + "/" + year);
        System.out.println("Date: " +weekday);
    }
}

class Demo {

    public static void main(String args[]) {
        // Call the Date constructor to create its object;
        Date date = new Date(1, 8, 2018); // Object created with specified values! // Object created with default values!
        Date date2 = new  Date(3,19,2025,"Wednesday");
        date.printDate();
        date2.printDate();

    }

}