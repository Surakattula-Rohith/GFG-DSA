package com.gfg.practice.bitmagic;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n == 0) return true ;
        if( (n & (n-1)) == 0) return true ;
        return false ;
    }
}
