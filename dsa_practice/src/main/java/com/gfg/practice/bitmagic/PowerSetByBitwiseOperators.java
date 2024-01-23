package com.gfg.practice.bitmagic;

public class PowerSetByBitwiseOperators {
    public void printPowerSet(String s){
        int n = s.length() ;
        int powerSetSize = (1<<n) ;
        for(int i = 0 ; i< powerSetSize ; i++){
            for(int j = 0 ; j <n ; j++){
                if((i & (1<<j)) != 0) System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
