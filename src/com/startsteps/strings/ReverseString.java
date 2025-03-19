package com.startsteps.strings;

public class ReverseString {

  public static void main(String[] args) {
    // write your code here
    reverse();
  }
  public static void reverse(){
    String p = "was it a car or a cat i saw"; // The string to be reversed
    System.out.println("ORIGINAL string is: " + p);
    int lp = p.length(); // Calculating length of string p
    String q = ""; // empty string to store the reverse
    int i = lp - 1;

    while (i >= 0) // This loop will terminate when i is less than 0
    {
      q += p.charAt(i); // Appending the characters of p to q in a backward fashion
      i -= 1;
    }
    System.out.println("REVERSED string is: " + q);
}
}
