package com.gfg.practice.maths;

public class CountDigits {
    public static int CountDigits(int num){
        if(num == 0) return 1 ;
        int ans = 0 ;
        while(num>0){
            ans++ ;
            num /= 10 ;
        }
        return ans ;
    }

    public static void main(String[] args) {
        int num = 2130 ;
        System.out.println(CountDigits(num));
    }
}
