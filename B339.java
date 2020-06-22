package com.company;

import java.util.Scanner;

public class B339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[] = new int[m+1];
        a[0]=1;
        long ans=0;
        for(int i=1;i<=m;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<m;i++)
        {
            if(a[i] > a[i+1])
            {
                ans += (n-a[i]+a[i+1]);
            }
            else
            {
                ans += (a[i+1]-a[i]);
            }
        }
        System.out.println(ans);
    }

}
