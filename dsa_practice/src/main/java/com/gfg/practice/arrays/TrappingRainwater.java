package com.gfg.practice.arrays;

import java.util.Stack;

public class TrappingRainwater {

    public  static int[] nglIndex(int[] A) {
        int n=A.length;
        int[] res= new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++) {
            while(stk.size() > 0 && A[stk.peek()] <= A[i]){
                stk.pop();
            }
            if(stk.size() >0){
                res[i]=stk.peek();
            }
            else{
                res[i]=-1;
            }
            stk.push(i);
        }
        return res;
    }
    public static  int[] ngrIndex(int[] A) {
        int n=A.length;
        int[] res= new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1 ;i>=0; i--) {
            while(stk.size() > 0 && A[stk.peek()] <= A[i]){
                stk.pop();
            }
            if(stk.size() >0){
                res[i]=stk.peek();
            }
            else{
                res[i]=n;
            }
            stk.push(i);
        }
        return res;
    }

    public static  int[] nslIndex(int[] A) {
        int n=A.length;
        int[] res= new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++) {
            while(stk.size() > 0 && A[stk.peek()] >= A[i]){
                stk.pop();
            }
            if(stk.size() >0){
                res[i]=stk.peek();
            }
            else{
                res[i]=-1;
            }
            stk.push(i);
        }
        return res;
    }
    public static int[] nsrIndex(int[] A) {
        int n=A.length;
        int[] res= new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1 ;i>=0; i--) {
            while(stk.size() > 0 && A[stk.peek()] >= A[i]){
                stk.pop();
            }
            if(stk.size() >0){
                res[i]=stk.peek();
            }
            else{
                res[i]=n;
            }
            stk.push(i);
        }
        return res;
    }
    public static int MaxWater(int[] A){
        int ans = 0 ;
        int[] ngl = nglIndex(A) ;
        int[] ngr = ngrIndex(A) ;
        int n = A.length ;
        for(int i = 1 ; i< n-1 ; i++){
            ans+= Math.min(A[ngl[i]],A[ngr[i]])-A[i] ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        int[] A = {7,4,6,2,1,4} ;
        System.out.println(MaxWater(A));
    }
}
