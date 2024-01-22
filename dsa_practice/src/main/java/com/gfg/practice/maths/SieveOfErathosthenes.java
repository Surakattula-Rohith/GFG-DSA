package com.gfg.practice.maths;

import java.util.ArrayList;

public class SieveOfErathosthenes {
    public static ArrayList<Integer> findPrimes(int n){
        ArrayList<Integer> ans = new ArrayList<>() ;
        boolean[] checkPrime = new boolean[n+1] ;
        for(int i = 0 ; i <=n ;i++){
            checkPrime[i] = true ;
        }
        checkPrime[0] = false ;
        checkPrime[1] = false ;

        for(int i = 2 ; i<= Math.sqrt(n) ; i++){
            if(checkPrime[i] == true){
                for(int j = i*i ; j<=n ; j+=i){
                    checkPrime[j] = false ;
                }
            }
        }
        for(int i = 2 ; i <=  n ; i++){
            if(checkPrime[i]) ans.add((i)) ;
        }

        return ans ;
    }
}
