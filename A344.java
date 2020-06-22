package com.company;
import  java.io.*;
import java.util.Scanner;

public class A344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        int answer = 1;
        for (int i = 0; i < n-1; i++) {
            if ((arr[i].equals("10") && arr[i+1].equals("01")) || (arr[i].equals("01") && arr[i+1].equals("10"))){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
