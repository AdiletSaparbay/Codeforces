package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class A443 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Character>  answer = new HashSet<>();
        String input = in.nextLine();

        for (int i = 1; i < input.length() - 1; i++) {

            if (input.charAt(i) !=' ' && input.charAt(i) !=','){
                answer.add(input.charAt(i));
            }

        }
        //System.out.println(answer.toString());
        System.out.println(answer.size());
    }
}
