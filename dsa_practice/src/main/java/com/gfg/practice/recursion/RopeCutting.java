package com.gfg.practice.recursion;

public class RopeCutting {
    public static int maxPieces(int n , int a , int b , int c){
        if(n == 0) return  0 ;
        if(n<0) return -1 ;
        int ans = Math.max(maxPieces(n-a ,a ,b ,c) ,maxPieces(n-b ,a ,b ,c)) ;
        ans = Math.max(ans,maxPieces(n-c ,a ,b ,c)) ;
        if(ans == -1) return -1 ;
        return ans ;
    }
}
