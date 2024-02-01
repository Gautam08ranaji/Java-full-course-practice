package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class PrintAndCountAllTheDigitsGreaterThanEqualsTo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input number");

        int x = sc.nextInt();
        int count =0;
        int rem = 0;
        while (x>0){

            rem = x%10;
            x /=10;


            if (rem>=6) {
                System.out.println(rem);
                count++;
            }}
        System.out.println("total count is : "+count);
    }
}
