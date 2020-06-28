package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A58 {

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
    static void sovle(){
            FastReader in = new FastReader();
            String s = in.next();
            int h = s.indexOf('h');
            int e = s.indexOf('e');
            int l1 = s.indexOf('l');
            int l2 = s.indexOf('l',l1);
            int o = s.indexOf('o');
            if (h != - 1 && e != -1 && l1!= -1 && l2 != -1 && o!=-1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
    }

    public static void main(String[] args) {
        sovle();
    }
}
