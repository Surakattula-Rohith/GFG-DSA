package com.gfg.practice.recursion;

public class Josephus {
    public static int leftPerson(int n , int k){
        if(n==1) return 0 ;
        else return (leftPerson(n-1,k)+k)%n ;
    }
}
