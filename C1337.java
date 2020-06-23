package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class C1337 {
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
                catch (IOException e)
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
    static  class Graph{
        private int V;

        private LinkedList<Integer> adj[];

        Graph(int v){
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList<>();


            }
        }
        void addEdge(int v, int w){
            adj[v].add(w);
        }
        void DFSutil(int v, boolean visited[]){
            visited[v] = true;
            System.out.println(v+ " ");

            Iterator<Integer>  i = adj[v].listIterator();

            while (i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    DFSutil(n,visited);
                }
            }
        }
        void DFS(int v){
            boolean visited[] = new boolean[V];
            DFSutil(v, visited);

        }
    }
    static  void solve(){
        FastReader in = new FastReader();
        
    }
}
