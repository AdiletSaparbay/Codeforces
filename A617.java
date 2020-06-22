package com.company;

import java.io.*;
public class A617 {
    public static void main(String[] args)  throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int step = 0;
        for (int i = 5; i >=1; i--) {

            step += n / i;
            n -= (n/i) * i;
        }
        System.out.println(step);

    }
}
