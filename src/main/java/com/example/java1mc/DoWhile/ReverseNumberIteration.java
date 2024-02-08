package com.example.java1mc.DoWhile;

import java.util.Scanner;

public class ReverseNumberIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i =1;
        int rem;

        char repeat ;
        do {
            int rev = 0;
            System.out.println("enter the number");
            n = sc.nextInt();
          while (n>0){

              rem = n%10;
              rev= rev*10+rem;
              n=n/10;
              i++;
          }
            System.out.println(rev+ " : is the reverse  ");

            System.out.println("enter y to continue");
         repeat = sc.next().charAt(0);
        }while (repeat=='y'||repeat=='Y');
        System.out.println("\"THANK YOU\"");
    }
}
