package com.company;

import java.util.Scanner;

public class A25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int odd = 0;
        int even = 0;
        int answer_odd = 0;
        int answer_even = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            if (input % 2 == 0){
                even++;
                answer_even = i;
            }
            else{
                odd++;
                answer_odd = i;
            }
        }
        System.out.println(even >= odd  ? answer_odd  + 1  : answer_even + 1);
    }
}
