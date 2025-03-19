package com.startsteps.educative;

/*
Add two fields i.e. length and width and modify the default and parametrized
constructors which assign parameters to the length and width fields of the Rectangle class.
In the end, Implement the getArea() method which returns the area of the rectangle.
 */
class Rectangle {
    // Write Fields Here
private  int length;
private  int width;

    public Rectangle() {
        this.length = 0;//initiate to defautl values
        this.width = 0;
    }
    public Rectangle(int length, int width) {
    this.length=length;
    this.width=width;
    }

    public int getArea() {
          int result = this.length*this.width;
        // Write your code here
        System.out.println(result);
        return result;
    }
}

class TestRectangle {
    public  static void main (String args[]){
        Rectangle obj = new Rectangle(2, 2);
        obj.getArea();
    }
}