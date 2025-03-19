package com.startsteps.oop;

class Foo {
    int size;
    String name;
    Foo(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Foo() {

    }
}

class TestFoo{

    public static void main(String[] args) {
        // write your code here
        Foo foo = new Foo();
    }
}
