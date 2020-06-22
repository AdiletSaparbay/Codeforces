package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class A144 {
    public static void main(String[] args)  throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        int arr[] = new int[n];

        String input[] = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int array[] = Find(arr);
        int max = array[0];
        int min = array[1];
        //System.out.println(max + " " + min);


        if (array[0] > array[1] ){
            System.out.println(array[0] - 1  + n - array[1] - 1);
        }
        else {
            System.out.println(array[0] - 1 + n - array[1]);
        }


    }
    static int[] Find(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_index = 0;
        int min_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
                max_index = i + 1;
            }
            if (min >= arr[i]){
                min = arr[i];
                min_index = i + 1;
            }
        }
        int arrray[] = {max_index,min_index};
        return arrray;
    }
}
