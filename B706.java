package com.company;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.OutputStream;


public class B706
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public void solve(){
        FastReader in = new FastReader();
        int n = in.nextInt();
        int x[] = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();

        }
        Arrays.sort(x);
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int m = in.nextInt();
            int l = 0;
            int r = n - 1;
            while (l <= r){
                int mid = l + (r - l) / 2;
                if (m >= x[mid]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            //out.println(l);
            System.out.println(l);
        }
    }


    public static void main(String[] args)
    {
        B706 run = new B706();
        run.solve();

    }
}

