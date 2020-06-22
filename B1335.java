package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1335 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        for (int i = 0; i < t; i++) {
            String input[] = in.readLine().split(" ");

            int n = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[2]);

            for (int j = 0; j < n; j++) {
                System.out.print((char)('a' + j % b));
            }
            System.out.println();
        }
    }
}
