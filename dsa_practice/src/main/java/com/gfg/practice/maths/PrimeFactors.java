package com.gfg.practice.maths;

import java.util.ArrayList;

public class PrimeFactors {
    public static ArrayList<Integer> findPrimeFactors(int n){
        ArrayList<Integer> ans = new ArrayList<Integer>() ;
        if(n<=1) return ans ;
        for(int i = 2 ; i*i <= n ; i++){
            while(n%i == 0){
                ans.add(i) ;
                n /= i ;
            }
        }
        if(n>1) ans.add(n) ;
        return ans ;
    }
}
