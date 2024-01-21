package com.gfg.practice.maths;

public class PalindromeNumber {
    public static boolean isPalindrome(int num){
        int reverseNum = 0 ;
        int tempNum = num ;
        while(tempNum >0){
            reverseNum *= 10 ;
            reverseNum += tempNum%10 ;
            tempNum = tempNum/10 ;
        }
        if(num == reverseNum) return true ;
        return false ;
    }

    public static void main(String[] args) {
        int num = 1010 ;
        if(isPalindrome(num)){
            System.out.println(num + " is a Palindrome Number.");
        }else{
            System.out.println(num + " is NOT a Palindrome Number.");
        }
    }
}
