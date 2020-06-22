package com.company;

import  java.util.*;
public class A509 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr [][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {

                arr[0][j] = 1;
                arr[i][0] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n ; j++) {

                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        System.out.println(arr[n-1][n-1]);
    }
}
