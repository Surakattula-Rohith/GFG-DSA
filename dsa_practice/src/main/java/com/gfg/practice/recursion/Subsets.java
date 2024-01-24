package com.gfg.practice.recursion;

import java.util.ArrayList;

public class Subsets {
    ArrayList<Integer> ans =new ArrayList<>();
    int idx = 0 ;
    int sum = 0 ;
    int current_sum = 0;
    public static void subsets(int[] A,ArrayList<Integer> ans,int idx){
        if(idx==A.length){
            System.out.println(ans);
            return ;
        }
        ans.add(A[idx]);
        subsets(A,ans,idx+1);

        ans.remove(ans.size()-1) ;
        subsets(A,ans,idx+1);

    }
    public static void subsetsWithGivenSum(int[] A,ArrayList<Integer> ans,int idx,int sum){
        if(idx==A.length){
            int cur_sum = 0 ;
            for(int i = 0 ; i<ans.size() ; i++){
                cur_sum+=ans.get(i);
            }
            if(cur_sum == sum)
                System.out.println(ans);
            return ;
        }
        ans.add(A[idx]);
        subsetsWithGivenSum(A,ans,idx+1,sum);

        ans.remove(ans.size()-1) ;
        subsetsWithGivenSum(A,ans,idx+1,sum);

    }

    // Function to print all subsets of a set
    static void printSubsets(char[] set, int index, String currentSubset) {
        int n = set.length;

        // Base case: If all elements are included in the subset
        if (index == n) {
            System.out.println(currentSubset);
            return;
        }

        // Recursive case 1: Include the current element in the subset
        printSubsets(set, index + 1, currentSubset + set[index]);

        // Recursive case 2: Exclude the current element from the subset
        printSubsets(set, index + 1, currentSubset);
    }

    public static void main(String[] args) {
        Subsets s = new Subsets();
        int[] arr = {1,2,3} ;
        ArrayList<Integer> ans =new ArrayList<>();
//        s.subsets(arr,ans ,0);

        int[] arr2 = {10,5,2,3,6};
        int sum = 8 ;
        ArrayList<Integer> ans2 =new ArrayList<>();
        s.subsetsWithGivenSum(arr2,ans2,0,sum);


    }
}
