package com.gfg.practice.bitmagic;

public class UniqueOccurance {
    public static int OneSingleOccuranceInEvenNumberOfOccurace(int[] A){
        int n = A.length ;
        int xor = A[0] ;
        for(int i = 1 ; i < n ; i++){
            xor = xor^A[i] ;
        }
        return xor ;
    }
    public static int[] TwoSingleOccuranceInEvenNumberOfOccurace(int[] A){
        int n = A.length ;
        int xor = A[0] ;
        for(int i = 1 ; i < n ; i++){
            xor = xor^A[i] ;
        }
        int idx = -1 ;
        for(int i = 0 ;i < 32 ; i++){
            if((xor & (1<<i))== 1){
                idx = i ;
                break;
            }
        }
        int set = 0 , unset = 0 ;
        for(int i = 0 ; i < n ; i++){
            if((A[i] & (1 << idx)) >= 1 ){
                set = set^A[i] ;
            }else{
                unset = unset^A[i] ;
            }
        }
        int ans[] = new int[2] ;
        ans[0] = unset ;
        ans[1] = set ;
        return ans ;

    }
}
