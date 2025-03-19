package com.startsteps.arrays;

import java.util.*;

public class ArraySortBuiltIn {

    public static void main(String[] args) {
        // write your code here
        sortBuiltin();
    }
    public static void sortBuiltin(){
        // SORT METHOD
        int[] nums = {1, 1, 30, 40, 0, 4, 40, 5};
        System.out.print("Original array of numbers: ");
        for (int i = 0 ; i < nums.length ; i++)
            System.out.print(nums[i]+" ");
        Arrays.sort(nums);
        System.out.print("\nSorted list of numbers: ");
        for (int i = 0 ; i < nums.length ; i++)
            System.out.print(nums[i]+" ");

        String alphs = "zigZAGavpqOIA";
        System.out.print("\nOriginal string: "+ alphs);
        char[] alphs_ch = alphs.toCharArray();
        Arrays.sort(alphs_ch);
        System.out.print("\nSorted array of alphabets: ");
        System.out.print(alphs_ch);
    }

}
