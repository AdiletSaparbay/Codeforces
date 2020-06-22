package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1294 {
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
    public static void solve(){
        FastReader in = new FastReader();
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), n = in.nextInt();
            int max[] = {a,b,c};
            Arrays.sort(max);
            //System.out.println(max[2]);
            int m1 = max[2] - max[0];
            int m2 = max[2] - max[1];
            n = n - m1 - m2;
            if (n >= 0 && n % 3 == 0){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }


    public static void main(String[] args) {
        solve();
    }
}
