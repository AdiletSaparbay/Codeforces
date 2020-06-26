package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1365 {
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
    public static  void solve (){
        FastReader in = new FastReader();
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            boolean zero = false,one = false, issorted = true;
            a[0] = in.nextInt();
            for (int i = 1; i < n; i++) {
                a[i] = in.nextInt();
                if(a[i - 1] > a[i]){
                    issorted = false;
                }
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                if (b[i] == 0){
                    zero = true;
                }
                if (b[i]==1){
                    one = true;
                }
            }
            System.out.println(one && zero || issorted ? "yes" : "no");

        }
    }

    public static void main(String[] args) {
        solve();
    }
}
