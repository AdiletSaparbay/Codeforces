package com.company;

import com.sun.imageio.plugins.jpeg.JPEGStreamMetadataFormat;

import java.io.*;

public class A581 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String sockets[] = in.readLine().split(" ");

        int a = Integer.parseInt(sockets[0]);
        int b = Integer.parseInt(sockets[1]);

        if (a > b){
            System.out.println(b +" " +((a - b )/ 2));
        }
        else
            System.out.println(a +" " + (b - a) / 2);
    }

}