package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class BiggestDigitOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int x = sc.nextInt();
        int temp = 0;
        int bigges_number =0;
        int rem =0;

        while (x>0){

            rem = x%10;
            temp = rem;


            if (rem>bigges_number){
                bigges_number = rem;
            }else {
                bigges_number = temp;
            }
            x/=10;

        }
        System.out.println(bigges_number);
    }
}
