//
//3. Write a Java program that takes three numbers from the user and prints the greatest number.
//
//        Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output :
//        The greatest: 87

package com.example.java1mc.IfElse;

import java.util.Scanner;

public class FindGreatestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 number ");
        int a = sc.nextInt();

        System.out.println("Enter 2 number ");
        int b = sc.nextInt();

        System.out.println("Enter 3 number ");
        int c = sc.nextInt();


        if (a > b && a > c){
            System.out.println("The Greatest Number is : "+a);
        } else if (b > a && b > c) {
            System.out.println("The Greatest Number is : "+b);

        }else
            System.out.println("The Greatest Number is : "+c);


    }
}
