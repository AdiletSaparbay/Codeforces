package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A80  {
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
        int n = in.nextInt(), m = in.nextInt();
        String answer = "NO";
        for (int i = n + 1; i <= m; i++) {
            if(is_Prime(i)){
                if (i == m){
                    answer = "YES";

                }
                else{
                    break;
                }
            }

        }
        System.out.println(answer);

    }
    public static boolean is_Prime(int a){
        int i = 2;
        while ( i <= a/2){
            if (a % i == 0){
                return  false;
            }
            i++;
        }
        return true;

    }

    public static void main(String[] args) {
        solve();

    }
}
