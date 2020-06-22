package com.company;

import  java.io.*;
public class A734 {
    public static void main(String[] args) throws  IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        String  input[] = in.readLine().split("");
        int d = 0;
        int a = 0;


        for (int i = 0; i < n; i++) {
            if (input[i].equals("A"))
                a++;
            else
                d++;
        }
        System.out.println(a>d ? "Anton" : a == d ? "Friendship" : "Danik");

    }
}
