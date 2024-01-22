package com.gfg.practice.bitmagic;

public class BitwiseOperators {
    public static void main(String[] args) {
        int x = 13 ;
        int y = 4 ;
        System.out.println(x+" & "+ y + " is " + (x&y));
        System.out.println(x+" | "+ y + " is " + (x|y));
        System.out.println(x+" ^ "+ y + " is " + (x^y));
        System.out.println("NOT of "+ x + " is " + (~x));
        System.out.println(x+" << "+ y + " is " + (x<<y));
        System.out.println(x+" >> "+ y + " is " + (x>>y));

    }
}
