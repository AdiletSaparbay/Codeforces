package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A155 {
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
    static void solve(){
        FastReader in = new FastReader();
        int n = in.nextInt();
        int fist = in.nextInt();
        int count = 0;
        int max = fist;
        int min = fist;
        for (int i = 0; i < n - 1; i++) {
            int input = in.nextInt();
            if (max < input){
                max = input;
                count++;
            }
            if (min > input){
                min = input;
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        solve();
    }
}
