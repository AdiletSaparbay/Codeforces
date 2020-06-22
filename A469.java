package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class A469 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();

        ArrayList<Integer> b = new ArrayList();
        for (int i = 0; i < p; i++) {
            int c = in.nextInt();
            if (!b.contains(c)){
                b.add(c);
            }
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int c = in.nextInt();
            if (!b.contains(c)){
                b.add(c);
            }
        }
        Collections.sort(b);
        String answer = "I become the guy.";
        if (b.size() == n){
            for (int i = 1; i <= n; i++) {
                if (b.get(i - 1) != i){
                    answer  = "Oh, my keyboard!";
                    break;
                }
            }
            System.out.println(answer);
        }
        else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
