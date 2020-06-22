package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;

public class A451 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input[] = in.readLine().split(" ");

        int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);

        int answer = Math.min(n,m);

        System.out.println(answer % 2 ==0 ? "Malvika\n" : "Akshat\n");
    }
}
