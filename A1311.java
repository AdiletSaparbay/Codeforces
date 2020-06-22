package com.company;

import java.util.*;
public class A1311 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++){
            int a = in.nextInt(),b = in.nextInt();
            int remainder = a - b;
            if ( a == b){
                System.out.println(0);
            }
            else if ( Math.abs(a - b) % 2 == 0 && a - b > 0 || a - b < 0 && Math.abs(a-b) % 2 == 1)  {
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }

        }
    }
}
