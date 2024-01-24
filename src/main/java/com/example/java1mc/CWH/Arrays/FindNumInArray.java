package com.example.java1mc.CWH.Arrays;

import java.util.Scanner;

public class FindNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find");
        int num = sc.nextInt();

        int flag=0;

        int arr[]  = { 1,2,3,4,5,6,10};

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==num) {
                System.out.println(num+": is found at index "+i);
                flag=1;
            }
        }
        if (flag==0){
            System.out.println(num+": is not present in the array");
        }


    }
}
