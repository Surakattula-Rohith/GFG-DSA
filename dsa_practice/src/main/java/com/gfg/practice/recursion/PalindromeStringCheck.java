package com.gfg.practice.recursion;

public class PalindromeStringCheck {
    public static boolean isPalindrome(String str, int s , int e){
        if(s>=e ) return true ;
        return (str.charAt(s)==str.charAt(e) && isPalindrome(str,s+1,e-1)) ;
    }
}
