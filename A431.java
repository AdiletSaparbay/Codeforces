package com.company;

import java.io.*;
public class A431 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input[] = in.readLine().split(" ");
        String input2[] = in.readLine().split("");
        int sum = 0;
        for (String enter : input2){
            sum += Integer.parseInt(input[Integer.parseInt(enter) - 1]);
        }
        System.out.println(sum);

    }
}
