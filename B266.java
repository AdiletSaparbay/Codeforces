package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B266 {
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
    static void solve(){
        FastReader in = new FastReader();
        int n = in.nextInt() , t = in.nextInt();
        String s = in.next();
        char ch[] = s.toCharArray();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (ch[j] == 'B' && ch[j+1] == 'G'){
                    ch[j] = 'G';
                    ch[j + 1] = 'B';
                    j++;
                }
                
            }
        }
        String answer = new String(ch);
        System.out.println(answer);
    }


    public static void main(String[] args) {
        solve();
    }
}
