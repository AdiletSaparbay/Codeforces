package com.company;

import java.util.Scanner;

public class A1369 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
        System.out.println(in.nextInt() % 4 == 0 ? "YES" : "NO");
        }
    }
}
