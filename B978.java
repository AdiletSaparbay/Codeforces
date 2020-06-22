package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B978 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        String input[] = in.readLine().split("");

        int number = 0;
        int ctn = 0;

        for (int i = 0; i < n; i++) {

            if (input[i].equals("x")){
                number ++;
                if (number > 2){
                    ctn++;
                }
            }
            else
                number = 0;

        }
        System.out.println(ctn);
    }
}
