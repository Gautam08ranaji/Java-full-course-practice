package com.example.java1mc.DoWhile;

import java.util.Scanner;

public class PerfectNumberIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        char repeat;



       do{
           System.out.println("enter the number");
           int n= sc.nextInt();
           int i=1;
           int sum=0;
           while (i<=n/2){
               if (n% i==0) {
                   sum+=i;
               }
               i++;
           }
           if (sum == n) {
               System.out.println("the number is perfect number");
           }else {
               System.out.println("it is not perfect number");
           }

           System.out.println("enter y to repeat else any other key to exit");
           repeat=sc.next().charAt(0);
       }while (repeat=='y'||repeat=='Y');

        System.out.println("\"THANK YOU\"");
    }
}
