package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A584
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;


        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader in  = new FastReader();
        int n  =  in.nextInt(), t = in.nextInt();
        String answer = "";
        if (t == 10 && n == 1){
            System.out.println(-1);
        }
        else if (t ==  10 && n > 1){
            for (int i = 0; i < n - 1; i++) {
                answer += 1;
            }
            System.out.println(answer + 0);
        }
        else{
            for (int i = 0; i < n; i++) {
                answer +=t;
            }
            System.out.println(answer);
        }



    }

}