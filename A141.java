package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A141 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        String input2 = in.readLine();
        String g[] = (input + input2).split("");
        String words[] = in.readLine().split("");
        Arrays.sort(g);
        Arrays.sort(words);

        String a = "";
        String p = "";
        for (int i = 0; i < g.length; i++) {
            a += g[i];
        }
        for (int i = 0; i < words.length; i++) {
            p += words[i];
        }
        if (a.equals(p)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
