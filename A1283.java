package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1283 {
    public static void main(String[] args)  throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            //int sag[] ={Integer.parseInt(in.readLine()),Integer.parseInt(in.readLine())};
            //int hh = sag[0], mm = sag[1];
            String[] sag= in.readLine().split(" ");

            int hh = Integer.parseInt(sag[0]);
            int mm = Integer.parseInt(sag[1]);
            System.out.println(24 * 60 - hh * 60 - mm);
        }
    }
}