package com.company;

import java.io.*;

public class A867 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String n = in.readLine();
        char input[] = in.readLine().toCharArray();
        System.out.println((input[0] == 'S' && input[input.length-1] == 'F')  ? "YES" : "NO");
    }
}
