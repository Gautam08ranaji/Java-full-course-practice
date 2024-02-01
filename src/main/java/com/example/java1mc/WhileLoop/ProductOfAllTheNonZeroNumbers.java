package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class ProductOfAllTheNonZeroNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input number");

        int x = sc.nextInt();
        int rem = 0;
        int product =1;
        while (x>0){

            rem = x%10;
            if (rem!=0){
                product *= rem;
            }
            x /=10;
        }
        System.out.println("product of all the unit place is : " + product);
    }
}
