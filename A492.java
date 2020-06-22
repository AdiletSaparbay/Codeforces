package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A492 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        double high = 0;
        while (n >= 0){
            high++;
            n -= sum(high);
        }
        System.out.println((int)high - 1);
    }
    public static double sum(double n){
        double an =  (n+1)/ 2;
        double s = an * n;
        return  s;
    }

}
