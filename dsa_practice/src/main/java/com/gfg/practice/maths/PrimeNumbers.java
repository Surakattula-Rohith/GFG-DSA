package com.gfg.practice.maths;

public class PrimeNumbers {
    public static boolean isPrime(int n){
        if(n < 4) return true ;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0) return false;
        }
        return true ;
    }
}
