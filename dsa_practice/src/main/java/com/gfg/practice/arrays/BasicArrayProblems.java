package com.gfg.practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;

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
    public static void rotateArray(int[] A, int k) {
        int n = A.length;
        // Adjust k to handle cases where k > n
        k = k % n;

        // Reverse the entire array
        reverseArray(A, 0, n - 1);
        // Reverse the first k elements
        reverseArray(A, 0, k - 1);
        // Reverse the remaining elements
        reverseArray(A, k, n - 1);
    }

    public static HashMap<Integer,Integer> freqOfArray(int[] A){
        HashMap<Integer,Integer> hashMap = new HashMap<>() ;
        int n = A.length ;
        for (int num : A) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        return hashMap;
    }

    public static void reverseArray(int[] A, int s, int e) {
        while (s < e) {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
    }




}
