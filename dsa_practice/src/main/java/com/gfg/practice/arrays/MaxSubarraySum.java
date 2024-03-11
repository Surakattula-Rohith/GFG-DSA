package com.gfg.practice.arrays;

public class MaxSubarraySum {
    public static int KadanesAlgo(int[] A){

        int ans = 0 ;
        int n = A.length ;
        int temp_sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(temp_sum + A[i] > 0) {
                temp_sum += A[i] ;
                ans = Math.max(temp_sum, ans) ;
            }
            else temp_sum = 0 ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum subarray sum: " + KadanesAlgo(arr));
    }
}
