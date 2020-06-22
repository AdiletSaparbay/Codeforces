package com.company;



import java.io.*;

public class A1146 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        char input[] = in.readLine().toCharArray();
        int a = 0;

        for (int i = 0; i < input.length; i++)
        {
            if (input[i] == 'a')
            {
                a++;
            }

        }
        System.out.println(a * 2 > input.length ? input.length : a * 2 - 1);


    }
}
