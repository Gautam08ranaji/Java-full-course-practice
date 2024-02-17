package com.example.java1mc.JSPIDERJAVA.Methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();
        if (checkPrime(n)==true) {
            System.out.println("the number is prime number");
        }else {
            System.out.println("it is not prime number");
        }

    }
    public static boolean checkPrime(int n){


        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i ==0) {

                return false;
            }

        }
        return true;
    }
}
