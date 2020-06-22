package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class A520  {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        char[] arr = in.readLine().toCharArray();
        String str = "";
        for (int i = 0; i < n; i++) {
            arr[i] = Character.toLowerCase(arr[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (!str.contains(Character.toString(arr[i]))){
                str += arr[i];
            }
        }
        if (str.contains("abcdefghijklmnopqrstuvwxyz")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }

    }
}
