package com.company;

import java.util.*;
public class B1207 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), m = in.nextInt();

        int b[][] = new int[n][m];

        int check = 0;
        int len = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = in.nextInt();
                if (b[i][j] != 0){
                    check = -1;
                }
            }
        }
        String answer = "";
        int array[][] = new int[n][m];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if(twoXtwoMatrix(b[i][j], b[i+1][j], b[i][j +1],b[i+1][j+1])){
                    array[i][j] = 1;
                    array[i+1][j] = 1;
                    array[i][j+1] = 1;
                    array[i+1][j+1] = 1;
                    answer += (i+1)+" "+(j+1) +"   ";
                }
            }
        }
        String answers[] = answer.split("   ");
        if (check == 0){
            System.out.println(check);
        }
        else if (Equal(b,array)){
            System.out.println(answers.length);
            for (int i = 0; i < answers.length; i++) {
                System.out.println(answers[i]);
            }
        }
        else{
            System.out.println(check);
        }

    }
    static boolean twoXtwoMatrix(int a, int b, int c, int d){
        if (a == 1 & b ==1 & c == 1 & d ==1) {
            return true;
        }
        return false;
    }
    static boolean  Equal(int a[][], int b[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]){
                    return false;
                }

            }

        }
        return true;
    }
}
