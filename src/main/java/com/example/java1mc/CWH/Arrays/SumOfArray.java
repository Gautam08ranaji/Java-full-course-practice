package com.example.java1mc.CWH.Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int sizeOfArray = sc.nextInt();
        float sum = 0f;

        float arr[] = new float[sizeOfArray];

        System.out.println("enter the values of array");
        for (int i = 0; i <sizeOfArray ; i++) {
            arr[i] = sc.nextFloat();
        }

        for (int i = 0; i <sizeOfArray ; i++) {
            sum+=arr[i];
        }

        System.out.println("the total sum of array is : "+sum);
    }
}
