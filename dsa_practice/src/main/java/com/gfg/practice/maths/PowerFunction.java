package com.gfg.practice.maths;

public class PowerFunction {
    public static long power(long a , long n){
        if(n==0)return 1 ;
        long x = power(a,n/2) ;
        if(n%2==0) return x*x ;
        else return x*x*a ;
    }
}
