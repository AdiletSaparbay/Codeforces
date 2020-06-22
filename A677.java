package com.company;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import  java.io.*;
public class A677 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input[] = in.readLine().split(" ");
        int h = Integer.parseInt(input[1]);
        String friend[] = in.readLine().split(" ");
        int total = 0;
        for (int i = 0; i < friend.length ; i++) {
            total += h >= Integer.parseInt(friend[i]) ? 1 : 2;
        }
        System.out.println(total);
    }
}
