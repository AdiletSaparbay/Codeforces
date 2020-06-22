package com.company;

import java.util.Scanner;

public class A112 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();
        int c=0;
        for(int i=0;i<n;i++) {
            String q = num.next();
            if (q.equals("X++")) {
                c++;
            } else if (q.equals("++X")) {
                ++c;
            } else if (q.equals("--X")) {
                --c;
            } else if (q.equals("X--")) {
                c--;
            }

        }
        System.out.print(c);


    }
}
