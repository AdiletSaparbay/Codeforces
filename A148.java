package com.company;

import java.util.Scanner;

public class A148 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int b = 0, l, n, m, d, k, i;
        k = s.nextInt();
        l = s.nextInt();
        m = s.nextInt();
        n = s.nextInt();
        d = s.nextInt();
        for (i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0)
                b++;
        }
        System.out.print(b);
    }
}
