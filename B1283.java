package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1283  {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        for (int i = 0; i < t; i++) {
            String input[] = in.readLine().split(" ");

            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);

            int  kaldik = n % k;
            int b = n / k;

            int min = Math.min(k/2,k/2 + k % 2);
            int max = Math.max(k / 2, k/2 + k % 2) * b;


            min = kaldik >= min ? min * b + min : min * b + kaldik;
            System.out.println(min + max);
        }
    }
}
