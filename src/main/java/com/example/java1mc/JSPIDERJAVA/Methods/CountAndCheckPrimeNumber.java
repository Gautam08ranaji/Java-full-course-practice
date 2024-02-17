package com.example.java1mc.JSPIDERJAVA.Methods;

import java.util.Scanner;

public class CountAndCheckPrimeNumber {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");

//        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <=100 ; i++) {
            if (checkPrime(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\ntotal count is "+count);
    }

    public  static boolean checkPrime(int n){

        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
