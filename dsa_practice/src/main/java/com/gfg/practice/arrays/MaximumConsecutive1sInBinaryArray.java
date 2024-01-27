package com.gfg.practice.arrays;

public class MaximumConsecutive1sInBinaryArray {
    public static int maximumOnes(int[] A){
        int ans = 0 ;
        int cnt = 0 ;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == 0){
                cnt = 0 ;
            }else{
                cnt++ ;
                ans = Math.max(ans,cnt) ;
            }
        }
        return ans;
    }
}
