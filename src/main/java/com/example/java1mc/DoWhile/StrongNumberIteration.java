package com.example.java1mc.DoWhile;

import java.util.Scanner;

public class StrongNumberIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repeat;
        do {

            int i =1;
            int fact=1;
            int sum =0;
            System.out.println("enter the number");
            int n= sc.nextInt();
            int temp=n;
            int rem = n%10;
            while (i<=rem){


                fact=fact*i;
                rem = n%10;
                sum+=fact;
                i++;
                n/=10;
            }
            if (sum == temp) {
                System.out.println("it is strong number "+temp);
            }else {
                System.out.println("it is not strong number");
            }


            System.out.println("ENTER Y TO CONINUE");
            repeat = sc.next().charAt(0);
        }while (repeat=='y'||repeat=='Y');

    }
}
