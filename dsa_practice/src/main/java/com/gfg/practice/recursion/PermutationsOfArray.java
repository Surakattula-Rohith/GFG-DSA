package com.gfg.practice.recursion;

import java.util.ArrayList;

public class PermutationsOfArray {
    public static void printPermutations(String s, boolean[]visited ,StringBuilder ans,int n){
        if(ans.length() == n){
            System.out.println(ans);
            return ;
        }
        for(int i = 0 ; i < n ; i++){
            if(visited[i] == false){
                ans.append(s.charAt(i)) ;
                visited[i] =true ;
                printPermutations(s,visited,ans,n);
                ans.deleteCharAt(ans.length()-1) ;
                visited[i] = false ;
            }
        }
    }

    public static void main(String[] args) {
        String s = "12" ;
        int n = s.length() ;
        boolean[] visited = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            visited[i] = false ;
        }
        StringBuilder ans = new StringBuilder() ;
        PermutationsOfArray p = new PermutationsOfArray();
        p.printPermutations(s,visited,ans,n) ;
    }
}
