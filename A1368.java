package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1368 {
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
    public static void solve(){
        FastReader in = new FastReader();
        int t = in.nextInt();
        while (t-->0){
            int a = in.nextInt(),b = in.nextInt(), n = in.nextInt();
            int count = 0;
            while (a <= n && b <= n){
                if (a  > b){
                    b += a;
                }
                else{
                    a += b;
                }
                 count++;
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
