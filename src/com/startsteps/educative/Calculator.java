package com.startsteps.educative;
/*
Calculator with
private fields:
num1 and num2 (double type)
And methods:
add(), a method which returns the addition of two numbers
subtract(), a method which returns the subtraction of num1 from num2
multiply(), a method which returns the multiplication of numbers
divide(), a method which returns the division of num2 by num1
Define a parameterized constructor which takes two parameters
num1 and num2 and assigns these variables to the respective fields in the class.
 */
 class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add(){
        double result1=this.num1+this.num2;
        int result=(int)result1;
        System.out.println("Addition result:"+result);
        return result;
    }
    public double multiply(){
        double result1=this.num1*this.num2;
        int result = (int)result1;
        System.out.println("Multiplication result:"+result);
        return result;
    }
    public double subtract(){
        double result1=this.num2-this.num1;

        int result=(int)result1;
        System.out.println("Subtraction result:"+result);
        return result;
    }
    public double divide(){
        double result;
        if(this.num2==0.0)
            throw new IllegalArgumentException("cannot divide by 0");
        else{
             result=this.num2/this.num1;
            System.out.println("Division result:"+result);
        }
        return result;
    }

}
/*
Exp:
104
84
940
9.4
 */
class TestCalculator{
     public static void main (String args[]){
         Calculator obj = new Calculator(10, 94);
         obj.add();
         obj.subtract();
         obj.multiply();
         obj.divide();


         double data = 3452.345;
         int value = (int)data; //type casting
         System.out.println("Type  casting double to int "+value);

         int value2 = new Double(data).intValue(); // Double.intValue();
         System.out.println("Type  casting double to int "+value2);

     }
}