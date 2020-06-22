package com.company;

import java.io.*;
public class A749 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        System.out.println(n / 2);

        for (int i = 0; i < n/2 -1; i++){
            System.out.print(2 + " ");
        }
        System.out.println(n % 2 == 0 ? 2 : 3);
    }
}
