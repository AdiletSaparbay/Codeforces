package com.company;

import java.util.*;
public class A1207 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int b = in.nextInt(), p = in.nextInt(), f = in.nextInt();
            int h = in.nextInt(), c = in.nextInt();
            int sum = 0;
            int buloshka = b / 2;
            if (c > h) {
                sum += Math.min(f, buloshka) * c;
                buloshka -= Math.min(f, buloshka);
                sum += Math.min(p, buloshka) * h;
                System.out.println(sum);
            }
            else {
                sum += Math.min(p, buloshka) * h;
                buloshka -= Math.min(p, buloshka);
                sum += Math.min(f, buloshka) * c;
                System.out.println(sum);

            }
        }
    }
}
