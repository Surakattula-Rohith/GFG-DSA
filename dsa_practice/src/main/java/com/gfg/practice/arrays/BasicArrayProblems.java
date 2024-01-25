package com.gfg.practice.arrays;

import java.util.ArrayList;

public class BasicArrayProblems {
    public static int largestElemntInArray(ArrayList<Integer> arr){
        int n = arr.size();
        int ans=arr.get(0) ;
        for(int i = 0 ; i < n ; i++){
            ans = Math.max(ans, arr.get(i)) ;
        }
        return ans ;
    }
    public static int secondLargestElement(ArrayList<Integer> A){
        int n = A.size() ;
        int ans = Integer.MIN_VALUE ;
        BasicArrayProblems l = new BasicArrayProblems() ;
        int first_max = l.largestElemntInArray(A) ;
        for(int i = 0 ; i <n ; i++){
            if(A.get(i)<first_max && A.get(i)>=ans){
                ans = A.get(i);
            }
        }
        return ans ;
    }

    public static void removeDuplicates(ArrayList<Integer> A) {
        if (A.isEmpty()) {
            return;
        }
        int writeIndex = 1;
        for (int readIndex = 1; readIndex < A.size(); readIndex++) {
            if (!A.get(writeIndex - 1).equals(A.get(readIndex))) {
                A.set(writeIndex++, A.get(readIndex));
            }
        }
        while (writeIndex < A.size()) {
            A.set(writeIndex++, -1); // Fill remaining elements with -1
        }
    }

    public static void moveZerosToEnd(int[] A){
        if (A == null || A.length <= 1) {
            return;
        }
        int nonZeroIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                A[nonZeroIndex++] = A[i];
            }
        }
        while (nonZeroIndex < A.length) {
            A[nonZeroIndex++] = 0;
        }

    }
}
