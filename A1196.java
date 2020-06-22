package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class A1196 {
    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);

        int q = input.nextInt();

        for (int i = 0; i < q; i++) {

            //lon a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
            long a = input.nextLong(), b = input.nextLong() , c =input.nextLong();

            System.out.println((a + b + c) / 2);
        }
    }
}
