package com.startsteps.educative;

/*
multi level inheritance
A Car IS A Vehicle
A Prius IS A Car
 */
class Vehicle1 {          //Base Vehicle class

    private int topSpeed;
    public void setTopSpeed(int speed) {
        this.topSpeed=speed;
        System.out.println("The top speed is set to: "+ topSpeed);
    }

}

class Car1 extends Vehicle1 { // Derived from Vehicle Base for Prius
    public void openTrunk() {
        System.out.println("The Car trunk is Open Now!");
    }

}

class Prius extends Car1 {// Derived from Prius & can be base to any further class

    public void turnOnHybrid() {
        System.out.println("The Hybrid mode is turned on!");
    }

}

class Main2 {

    public static void main(String[] args) {
        Prius priusPrime = new Prius();
        priusPrime.setTopSpeed(220);
        priusPrime.openTrunk();
        priusPrime.turnOnHybrid();
    }

}