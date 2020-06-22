package com.company;

import  java.util.*;
public class A703 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n ; i++) {
            int  mishka = in.nextInt(); int chris = in.nextInt();
            if (mishka > chris){
                sum1 ++;
            }
            else if(mishka < chris) {
                sum2++;
            }
        }
        if (sum1 > sum2){
            System.out.println("Mishka");
        }
        else  if( sum1 == sum2)
        {
            System.out.println("Friendship is magic!^^\n");
        }
        else {
            System.out.println("Chris");
        }
    }
}
