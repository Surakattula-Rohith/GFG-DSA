package com.gfg.practice.recursion;

public class BasicRecursionProblems {
    public static void binary(int n){
        if(n==0) return;
        binary(n/2) ;
        System.out.print(n%2);
    }

    public static void printNto1(int n){
        //Tail Recursion - faster
        if(n==0) return ;
        System.out.print(n);
        printNto1(n-1);
    }

    public static void print1toN(int n){
        //Head Recursion - slow
        if(n==0) return ;
        print1toN(n-1);
        System.out.print(n);
    }

    public static int fibonaciSequence(int n){
        if(n == 0) return 0 ;
        if(n == 1) return 1 ;
        return fibonaciSequence(n-1) + fibonaciSequence(n-2) ;
    }

    public static int naturalNumbersSum(int n){
        if(n == 1 ) return 1 ;
        return n+naturalNumbersSum(n-1) ;
    }

    public static int sumOfDigits(int n){
        if(n <= 9) return n ;
        return (n%10)+sumOfDigits(n/10) ;
    }

}
