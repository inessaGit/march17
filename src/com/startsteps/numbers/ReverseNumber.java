package com.startsteps.numbers;

public class ReverseNumber {

    public int reverseNumberWithStringBuffer(int number) {
        StringBuffer sb = new StringBuffer(String.valueOf(number));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
    public int reverseNumberUsingForLoop(int number) {
        String numberStr = Integer.toString(number);
        String reversedStr = "";
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversedStr += numberStr.charAt(i);
        }
        return Integer.parseInt(reversedStr);
    }

    public int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }
}
