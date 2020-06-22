package com.company;

import javafx.scene.shape.SVGPath;

import java.util.Scanner;

public class A1328 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int  a = in.nextInt(), b = in.nextInt();
            if (a % b ==0){
                System.out.println(0);
            }
            else{
            System.out.println(b - (a % b));
        }}
    }
}
