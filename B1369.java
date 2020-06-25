package com.company;

import com.sun.xml.internal.bind.v2.util.FatalAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B1369 {
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
        FastReader sc = new FastReader();
        long t=sc.nextLong();
        while(t-- >0){
            long n=sc.nextLong();
            String s=sc.next();
            int i,o=-1,z=-1;
            for(i=0;i<n;i++){
                if(o==-1 && s.charAt(i)=='1')
                    o=i;
                if(s.charAt(i)=='0')
                    z=i;
            }
            System.out.println(s);
            System.out.println("o = " + o +" and z = " + z);
            System.out.println(s.substring(z));
            if(o>-1 && z>-1 && z>o){
                s=s.substring(0,o)+s.substring(z);
            }
            //System.out.println(s);
        }

    }


    public static void main(String[] args) {
        solve();
    }
}
