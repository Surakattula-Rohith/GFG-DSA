package com.gfg.practice.recursion;

public class ReverseNumber {
    public static int reverse(int n){
        if(n <= 9) return n ;
        else{
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            int reversed = reverse(remainingDigits);
            // Append the last digit to the reversed number
            return Integer.parseInt(Integer.toString(lastDigit) + Integer.toString(reversed));
        }
    }
}
