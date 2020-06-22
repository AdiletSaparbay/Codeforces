package com.company;

import java.io.*;

public class A1281 {
    public static void main(String[] args)  throws  IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++)
        {
            String input = in.readLine();

            if (input.indexOf("po",input.length() - 2) == input.length() - 2){
                System.out.println("FILIPINO");
            }
            else if (input.indexOf("desu",input.length() - 4) == input.length() - 4){
                System.out.println("JAPANESE");
            }
            else if (input.indexOf("masu",input.length() - 4) == input.length() - 4){
                System.out.println("JAPANESE");
            }
            else if (input.indexOf("mnida",input.length() - 5) == input.length() - 5){
                System.out.println("KOREAN");
            }


        }
    }
}
