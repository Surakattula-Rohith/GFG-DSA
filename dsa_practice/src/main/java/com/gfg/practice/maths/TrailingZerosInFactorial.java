package com.gfg.practice.maths;

public class TrailingZerosInFactorial {
    public static int NumberOfTrailingZeros(int n){
        int ans = 0 ;
        while(n>0){
            ans += n/5 ;
            n /= 5 ;
        }
        return ans ;
    }
}
