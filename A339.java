package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A339 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        while(true){
            n++;
            String a = "" + n;
            String answer = "";
            for (int i = 0; i < a.length(); i++) {
                if (!answer.contains(String.valueOf(a.charAt(i)))){
                    answer += a.charAt(i);
                }
            }
            if (answer.equals(a)){
                System.out.println(n);
                break;
            }
            //System.out.println(n);
        }
    }
}

