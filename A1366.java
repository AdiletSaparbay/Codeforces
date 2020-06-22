package com.company;



import com.sun.corba.se.spi.ior.IdentifiableFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A1366
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
    public void solve(){
        FastReader in = new FastReader();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt(), b = in.nextInt();
            System.out.println(Math.min(a,Math.min(b,(a + b) / 3)));
        }
    }

    public static void main(String[] args)
    {
        A1366 out = new A1366();
        out.solve();
    }
}
