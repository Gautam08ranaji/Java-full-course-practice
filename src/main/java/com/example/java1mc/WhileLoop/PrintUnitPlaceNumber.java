package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class PrintUnitPlaceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input number");

        int x = sc.nextInt();
        int temp = 0;
        while (x>0){

           temp = x%10;
           x /=10;


            System.out.println(temp);
        }
    }
}
