package com.company;
import  java.util.*;

public class A263 {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5; j++) {
                int number = in.nextInt();
                if (number == 1){
                    System.out.println(Math.abs(3 - j) + Math.abs(3-i));
                    break;
                }
            }

        }
    }
}