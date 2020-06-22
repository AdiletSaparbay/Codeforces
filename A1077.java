package com.company;

import java.util.*;
public class A1077 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            //int a = in.nextInt(), b =in.nextInt(), k =in.nextInt();
            long  a = in.nextLong(), b =in.nextLong() , k = in.nextLong();
            long s = k / 2;

            if (k % 2 == 0){
                System.out.println(s * a - b * s);
            }
            else {
                System.out.println(s * a - b * s  + a);
            }
        }
        //System.out.println();
    }
}
