package com.gfg.practice.bitmagic;

public class KthBit {
    public static boolean checkIfSet(int n, int k){
        if((n & (1<<k)) == 0){
            return false;
        }return true ;
    }
    public static int setKthBit(int n, int k){
        int ans = (n | (1<<k)) ;
        return ans ;
    }

    public static int toggleKthBit(int n, int k){
        int ans = (n ^ (1<<k)) ;
        return ans ;
    }

}
