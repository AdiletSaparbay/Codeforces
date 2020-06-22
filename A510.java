package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A510 {
    public static void main(String[] args)  throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input[] = in.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++) {
            if( i % 4 == 1){
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.println();
            }
            else if(i % 4 == 3){
                System.out.print("#");
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.println();
            }
            else if( i % 2 == 0){
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
