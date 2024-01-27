package com.gfg.practice.arrays;

public class BuyAndSellStock {
    public static int maximumProfit(int[] A){
        int ans = 0 ;
        for(int i = 1 ; i < A.length ; i++){
            if(A[i] > A[i-1]){
                ans += (A[i] - A[i-1]) ;
            }
        }
        return ans ;
    }
}
