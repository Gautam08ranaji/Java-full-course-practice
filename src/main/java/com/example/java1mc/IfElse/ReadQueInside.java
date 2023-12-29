//Write a Java program that reads a floating-point number and prints "zero" if the number
// is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value 
// of the number is less than 1, or "large" if it exceeds 1,000,000.


package com.example.java1mc.IfElse;

import java.util.Scanner;

public class ReadQueInside {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("enter any number ");
        double a = sc.nextDouble();

        if (a > 0) {
            if (a < 1){
                System.out.println("positive  small number "+a);
            } else if (a > 1000000) {
                System.out.println("positive large number "+a);
            }
            else System.out.println("positive number "+a);
        }
        else if (a < 0) {
            if ( Math.abs(a) < 1){
                System.out.println("small negative number "+a);
            } else if (Math.abs(a) > 1000000) {
                System.out.println("large negative number "+ a);
            }
            else System.out.println("Negative number "+ a);
        }
        else System.out.println("zero "+ a);
    }
}
