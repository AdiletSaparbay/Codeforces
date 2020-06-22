package com.company;

import com.sun.javafx.collections.MapAdapterChange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import java.util.*;
public class A230{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n= in.nextInt();
        int index = 0;
        int x[]= new int[n];
        int y[]= new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=in.nextInt();
            y[i]=in.nextInt();
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if(x[i]!=0)
                {
                    if(s>x[i])
                    {
                        s=s+y[i];
                        x[i]=0;
                        index++;
                        break;
                    }
                }
            }
        }
        if(index == n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}