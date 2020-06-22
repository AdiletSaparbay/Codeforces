package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1335 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(in.readLine());

            if (n % 2 == 0){
                System.out.println(n / 2 - 1);
            }
            else
                System.out.println(n / 2);
        }

    }
}
