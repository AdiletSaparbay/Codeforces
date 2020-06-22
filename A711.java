package com.company;

import java.io.*;

public class A711 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        String string[] = new String[n];
        String answer = "NO";
        for (int i = 0; i < n; i++)
        {
            string[i] = in.readLine();
            if (string[i].contains("OO")){
                answer = "YES";
            }

        }
        System.out.println(answer);
        if (answer.equals("NO")){

        }
        else{
            int t = 0;
            for (int i = 0; i < n; i++) {
                String input[] = string[i].split("\\|");
                if (input[0].equals("OO")) {
                    System.out.println("++" + "|" + input[1]);
                    t = i + 1;
                    break;
                }
                else if (input[1].equals("OO")) {
                    System.out.println(input[0] + "|" + "++");
                    t = i + 1;
                    break;
                }
                System.out.println(string[i]);
            }
            for (int i = t ; i < n; i++) {
                System.out.println(string[i]);

            }
        }
    }

}
