package com.gfg.practice.maths;

public class GCD {
    public static int gcdOfTwoNumbers(int a, int b){
        if(b==0) return a ;
        return gcdOfTwoNumbers(b, a%b) ;
    }

    public static int lcmOfTwoNumbers(int a, int b){
        return (int)((long)a*(long)b)/gcdOfTwoNumbers(a,b) ;
    }
}
