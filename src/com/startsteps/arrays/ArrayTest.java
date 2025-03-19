package com.startsteps.arrays;

public class ArrayTest {

    public static void main(String args[]) {
      //  testArray();
        int []nums ={10, 20, 30, 40, 50};
        sumElements(nums);
    }

    public static void sumElements(int[]nums){
        //Write a program that shows the sum of elements in an array.
    int length = nums.length;
    int sum=0;

    for(int el:nums){
        sum+=el;
    }
     System.out.println(sum);
    }
    public static void testArray(){
        int[] int_array = {1, 2, 3};
        System.out.println("Integer Array: ");
        System.out.println(int_array[0] + " " + int_array[1] + " " + int_array[2]);
        double[] double_array = {1.5, 2.3, 3.8};
        System.out.println("Double Array: ");
        System.out.println(double_array[0] + " " + double_array[1] + " " + double_array[2]);

        String[] string_array = {"Java", "11.5e", "2023"};
        System.out.println("String Array: ");
        System.out.println(string_array[0] + " " + string_array[1] + " " + string_array[2]);

    }
}
