package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A1095 {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        String input[] = in.readLine().split("");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
            if (sum  > n -1) {
                break;
            }
            System.out.print(input[sum]);

        }

    }


}
