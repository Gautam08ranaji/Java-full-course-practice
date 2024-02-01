package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input number");

        int x = sc.nextInt();
        int count =0;
        int rem = 0;
        while (x>0){

            if (x>0) {

                count++;
            }
            x/=10;
        }
        System.out.println("total count is : "+count);
    }
}
