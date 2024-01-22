package com.gfg.practice.bitmagic;

public class CountSetBits {
    public static int countSetBit(int n){
        int ans = 0 ;
        while(n>0){
            ans += (n&1);
            n /= 2 ;
        }
        return ans ;
    }

    public static int brainKerningamsAlgo(int n){
        int ans = 0 ;
        while(n>0){
            n = (n&(n-1)) ; // Unset the last set-bit in O(1) time.
            ans++ ;
        }
        return ans ;
    }

    public static int lookUpTable(int n){
        int[] table = new int[256] ;
        table[0] = 0 ;
        for(int i = 1 ; i<256 ; i++){
            table[i] = table[(i&(i-1))]+1 ;
        }
        return table[(n&255)]+table[((n>>8)&255)]+table[((n>>16)&255)]+table[(n>>24)] ;
    }

}
