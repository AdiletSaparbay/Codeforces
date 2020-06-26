package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A1365 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            Set<Integer> row = new HashSet<Integer>(), col = new HashSet<Integer>();
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] matrix = new int[n + 1][m + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                    if (matrix[i][j] == 1) {
                        row.add(i);
                        col.add(j);
                    }
                }
            }
            int min = Math.min(n - row.size(), m - col.size());
            if (min % 2 == 1) System.out.println("Ashish");
            else System.out.println("Vivek");
        }
        sc.close();
    }
}