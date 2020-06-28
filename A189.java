package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A189 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void sovle(){
        FastReader in = new FastReader();
        int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
       // int arr[] = {a,b,c};
        //Arrays.sort(arr);
        int max = 0;
        //int count = 0;
          //}
        //}
        //System.out.println(count);
        for(int x = 0;a*x <= n;x++)
        {
            for(int y = 0;a * x + b * y <= n; y++)
            {
                int z = ( n - a * x -b * y) / c;
                if(a*x+b*y+c*z==n)
                {
                    max=Math.max(max,x+y+z);
                }
            }

        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        sovle();
    }
}
