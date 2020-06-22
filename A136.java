package com.company;

import  java.util.*;
public class A136 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> podarki =  new HashMap<>();

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            podarki.put(i, in.nextInt());
        }
        for (int i = 1 ; i <= n; i++ ){
            for  (Map.Entry<Integer,Integer> answer : podarki.entrySet())
            {
                if (i == answer.getValue()){
                    System.out.print(answer.getKey() + " ");
                }
            }
        }
    }
}
