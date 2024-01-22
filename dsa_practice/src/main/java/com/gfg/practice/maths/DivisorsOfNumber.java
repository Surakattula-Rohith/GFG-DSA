package com.gfg.practice.maths;

import java.util.ArrayList;

public class DivisorsOfNumber {
    public static ArrayList<Integer> findDivisors(int n){
        ArrayList<Integer> ans = new ArrayList<>() ;

        for(int i = 1 ; i<= Math.sqrt(n) ; i++){
            if(n%i == 0) {
                ans.add(i);
                if(i != n/i) ans.add(n/i) ;
            }

        }

        return ans ;
    }
}
