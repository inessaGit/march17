package com.startsteps.educative;

class Vehicle { //Base class vehicle
    int fuelCap = 90; //fuelCap field inside SuperClass
    public void display() { //display method inside SubClass
        System.out.println("I am from the Vehicle Class");
    }
}


class Car extends Vehicle { // sub class Car extending from Vehicle
    int fuelCap = 50; //fuelCap field inside SubClass

    public void display() { //display method inside SubClass
        System.out.println("I am from the Car Class");
    }
    public void print() {
        //accessing the field of parent class using super*/
        System.out.println("Fuel Capacity from the Vehicle class: super.fuelCap " + super.fuelCap);
        //without using super the field of current class shadows the field of parant class*/
        System.out.println("Fuel Capacity from the Car class: " + fuelCap);
        super.display();
        display();
    }

}
class Main {
    public static void main(String[] args) {
        Car corolla = new Car();
        corolla.print();
    }
}