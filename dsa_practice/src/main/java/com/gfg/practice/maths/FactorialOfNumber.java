package com.gfg.practice.maths;

public class FactorialOfNumber {

    public static long FactorialByIterativeMethod(long num){
        long ans = 1 ;
        if(num < 2) return  ans ;
        for(int i = 2 ; i <= num ; i++){
            ans *= (long)i ;
        }
        return ans ;
    }

    public static long FactorialByRecursiveMethod(long num){
        if(num <= 1) return 1 ;
        return num*FactorialByRecursiveMethod(num-1) ;
    }


}
