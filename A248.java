package com.company;

import com.sun.xml.internal.bind.v2.util.FatalAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A248  {
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
    static void solve() {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            left += in.nextInt();
            right += in.nextInt();
        }
        int ans = 0;
        ans += Math.min(left, n - left);
        ans += Math.min(right, n - right);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        solve();
    }
}
