package com.company;

import javax.management.remote.rmi.RMIIIOPServerImpl;
import java.util.*;
import java.io.*;
public class A1303 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            String input = in.readLine();
            int sum = 0;

            for (int j = input.indexOf("1"); j < input.lastIndexOf("1"); j++) {
                if(input.charAt(j) =='0'){
                    sum++;

                }
            }
            System.out.println(sum);

        }
    }
}
