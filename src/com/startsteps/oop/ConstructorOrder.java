package com.startsteps.oop;

class A {
    A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    B() {
       // super(); // Implicitly called if not present.
        System.out.println("Constructor B");
    }
}

class C extends B {
    C() {
        super(); // Implicitly called if not present.
        System.out.println("Constructor C");
    }
}

public class ConstructorOrder {
    public static void main(String[] args) {
        C c = new C();
    }
}
