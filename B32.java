package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B32 {
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

    public static void solve() {
        FastReader in = new FastReader();
        char s[] = in.nextLine().toCharArray();
        for (int i = 0; i < s.length; i++) {
            //System.out.println(i);
            if (s[i] == '-' && s[i + 1] == '-') {
                System.out.print(2);
                i++;

            } else if (s[i] == '-' && s[i + 1] == '.') {
                System.out.print(1);
                i++;

            } else {
                System.out.print(0);
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}