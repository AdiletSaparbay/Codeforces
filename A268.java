package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A268  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int t = 0;
        for (int i = 1; i < n; i++) {
            int b = arr[t][0], c = arr[t][1];
            for (int j = 0; j < 1; j++) {
                if (arr[i][j] == c){
                    sum++;
                }
                if (arr[i][j+1] == b){
                    sum++;
                }
            }
            if (i == n- 1){
                t++;
                i = t;
            }
        }
        System.out.println(sum);
    }
}
