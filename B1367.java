package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1367 {
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
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int arr[] = new int[n];
            int even = 0;
            int odd = 0;
            int pos_even[] = new int[1001];
            //int pos_odd[] = new int[1001];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (arr[i] % 2 == 0){
                    pos_even[even] = i;
                    even++;
                }
                else{
                    odd++;
                }
            }
            int count = 0;
            if (n % 2 == 0 && even == odd || n % 2 == 1 && even  - 1 == odd){
                for (int i = 0; i < even; i++) {
                    if (pos_even[i] % 2 == 1){
                        count++;
                    }
                }
                System.out.println(count);
            }
            else{
                System.out.println(-1);
            }

        }
    }

    public static void main(String[] args) {
        sovle();
    }
}
