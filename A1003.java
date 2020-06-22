package com.company;

import java.io.*;
public class A1003 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String a = in.readLine();
        String b[] = in.readLine().split(" ");

        int d = 0;
        for (int i = 0; i < b.length; i++) {
            int sum = 0;
            for (int j = i +1; j < b.length; j++) {
                if (Integer.parseInt(b[i]) == Integer.parseInt(b[j])){
                    sum++;
                }
            }
            if (sum > d){
                d = sum;
            }
        }
        System.out.println(d+1);


    }
}
