package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class C4 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        HashMap<String,Integer> db = new HashMap<>();
        db.put(in.readLine(),0);
        System.out.println("OK");
        while (n-->1){
            String input = in.readLine();
            if (db.get(input) != null){
                System.out.println(input + "" + (db.get(input) + 1));
                db.put(input,db.get(input) + 1);
            }
            else{
                System.out.println("OK");
                db.put(input,0);
            }
        }
    }
}
