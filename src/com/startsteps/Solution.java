package com.startsteps;

// Given an array of integers, arr, remove all the even integers from the array.
/*
Explanation:
removeEvenIntegers(int[] arr) Function:
Takes an integer array arr as input.
Handles null or empty input arrays by returning an empty integer array.
Creates an ArrayList<Integer> called oddList to store the odd numbers.
Iterating and Filtering:

Uses an enhanced for loop (for-each loop) to iterate through each element num in the input array arr.
Checks if num is odd using the condition num % 2 != 0.
If num is odd, it's added to the oddList.
Converting to int[]:

Creates a new integer array result with the size of oddList.
Iterates through the oddList and copies each element to the result array.
Returning the Result:

Returns the result array, which now contains only the odd numbers from the input array.
main Method (Example Usage):

Creates an instance of the Solution class.
Defines an example input array arr.
Calls the removeEvenIntegers method to get the result.
Prints the result array to the console.
Handles edge cases where the input is null or empty.
*/



import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] removeEvenIntegers(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; // Return an empty array for null or empty input
        }
//Creates an ArrayList<Integer> called oddList to store the odd numbers.
        List<Integer> oddList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) {
                oddList.add(num);
            }
        }
//Creates a new integer array result with the size of oddList.
        int[] result = new int[oddList.size()];
        for (int i = 0; i < oddList.size(); i++) {
            result[i] = oddList.get(i);
        }

        return result;
    }

    // Example usage (for testing):
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = solution.removeEvenIntegers(arr);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}