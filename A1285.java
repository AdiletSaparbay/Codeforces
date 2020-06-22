package com.company;

import java.io.*;
public class A1285 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        String input[] = in.readLine().split(" ");

        int sum = input.length + 1;
        System.out.println(sum);
    }
}
