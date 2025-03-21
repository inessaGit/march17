package com.startsteps.collectionsapi;

import java.util.*;
import java.util.function.*;

public class ArrayListTest {


    public static void randomNum(){
        double randomNumber = Math.random();
        System.out.println(randomNumber); // Output: a double value between 0.0 and 1.0
//To generate random integers within a specific range, you need to scale and shift the output of Math.random().

        int randomInt = (int) (Math.random() * 10) + 1; // Shift the range by adding 1
        System.out.println(randomInt);
    }
    public static void test(){
        List list1 = new ArrayList();
        List list2 = new ArrayList(12);
        List list3 = new ArrayList(list2);

        list1.add(1);
        System.out.println(list1);

        List<String> list = new ArrayList<>();
        int length  =list.size();
        System.out.println(length);//by default created with size 0
        //Only when the first element is inserted does the array size change to ten. This is called lazy initialization, and it saves a lot of memory.
    }
public  static void updateElement(){
    //To update an element in ArrayList, the set(int index, E e) method can be used.
    // This method takes the index, which needs to be updated and a new value.
    List list = new ArrayList();
    list.add(1);
    list.add(30);
    list.add(30);
    System.out.println("list before updating elements "+list);

    list.set(0,100);
    System.out.println("list after updating elements "+list);


}
    public static void removeElement(){
        List list = new ArrayList();
        list.add(1);
        list.add(30);
        list.add(30);

        for (int i=0;i<5;i++){
            int j = (int)(Math.random()*10)+1;// shift the range by 1
            list.add(j);
        }
      System.out.println("list before removing elements "+list);
        list.remove(4);  // This will remove the element at index 1 i.e 20.
        System.out.println(list);

        list.remove(new Integer(30)); // removes Object This will remove 30 from the list
        System.out.println(list);
    }

    public static void replaceAll(){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        System.out.println("Before replace all:" +list);
        list.replaceAll((el) -> el.toUpperCase());

        System.out.println(list);

        Runnable r = () -> System.out.println("Hello from a lambda!");
        r.run();
    }

    public static void sortingUsingLambda(){
        String[] strings = {"apple", "banana", "cherry"};
        Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length()); // Sort by length
        System.out.println(Arrays.toString(strings));

        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello");

        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }
    public static void main(String[] args) {
        // write your code here
       // test();
       // randomNum();
        //removeElement();
        //replaceAll();
        updateElement();
    }
}
