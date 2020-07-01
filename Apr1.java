package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*** Created by Adilet Saparbay  01.07.2020
 *
 */
public class Apr1 {
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
        while(t-->0){
            String s = in.nextLine();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < s.length(); i++) {
                if(palindrome(s.substring(0,i + 1))){
                    if(s.substring(0,i+1).length() > max){
                        max = s.substring(0,i+1).length();
                    }
                }
            }
            System.out.println(max);
        }
    }
    static boolean palindrome(String s){
        StringBuilder in = new StringBuilder(s);
        if (s.equals(in.reverse().toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        solve();
    }
}
