package com.gfg.practice.recursion;

public class TowerOfHanoi {
    public static void TOH(int n , String src, String auxi, String dest){
        if(n == 0) return ;
        TOH(n-1 ,src, dest,auxi) ;
        System.out.println(n + "th disc move from "+src+" to "+dest);
        TOH(n-1, auxi,src,dest);
    }

    public static void main(String[] args) {
        TowerOfHanoi t = new TowerOfHanoi();
        t.TOH(3, "A","B","C") ;
    }
}
