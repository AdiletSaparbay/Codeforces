package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A82 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int s = n;

        String names[] = {"Sheldon","Leonard","Penny","Rajesh","Howard"};
        int t = 0;
        int ans = 0;
        int answer = 0;
        while (n > 0) {
            answer = 5 * (int) Math.pow(2, t);
            n = n - answer;
            t++;
            if (n > 0) {
                ans = n;
            }
        }
        if (ans % (answer / 5) > 0){
            System.out.println(names[ans /(answer/5)]);
        }
        else if(s <= 5){
            System.out.println(names[s - 1]);
        }
        else {
            System.out.println(names[(ans /(answer/5) - 1)]);
        }

    }

}