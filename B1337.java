package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1337 {
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
                catch (IOException e)
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
    public  static void solve(){
        FastReader in = new FastReader();
        int t = in.nextInt();
        while (t-->0){
            int x = in.nextInt(), n = in.nextInt(), m = in.nextInt();
            String answer = "NO";
            for (int i = 0; i <= n; i++) {
                if ((x - (10 * m ))<= 0){
                    answer = "YES";
                    break;
                }
                else {
                    x = x / 2 + 10;
                }
               // System.out.println(x);
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
