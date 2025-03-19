package com.startsteps.educative;
/*
This class will have the following member variables:

numberOfItems: This variable will be equal to current grocery items inside the list.
items: It will also contain an array of strings that holds the names of items.
 You can assume that it can hold 20 items at maximum.
 */
class GroceryList {
    //Declare member variables here
private int arrSize=20;
private String []items=new String [arrSize];
private int numberOfItems;
private static int counter;

    public GroceryList() {
        //Add necessary initializations here
        numberOfItems=0;
    }

    public void insertItem(String item){
        //Add function logic
        int length = items.length;
        if(counter<arrSize){
            items[counter]=item;
        }
        counter++;
    }
    public void printList(){
        //Add function logic
        for(String item:items){
            if(item!=null)
            System.out.println(item);
        }
    }
}
class TestGroceryList{
    public static void main (String args[]){
        GroceryList gc = new GroceryList();
        gc.insertItem("Onion");
        gc.insertItem("Garlic");
        gc.insertItem("Bread");
        gc.printList();
    }
}