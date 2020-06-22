package com.company;
import  java.io.*;
import java.util.Scanner;

public class B200 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {

            int input = in.nextInt();

            sum += input;

        }
        System.out.println((double )sum/n);
    }
}
