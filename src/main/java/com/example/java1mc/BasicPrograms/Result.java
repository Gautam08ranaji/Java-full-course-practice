package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number for maths");
        int maths = sc.nextInt();

        System.out.println("enter the number for english");
        int eng = sc.nextInt();

        System.out.println("enter the number for science");
         int science = sc.nextInt();

         int total_marks = eng+maths+science;
         int percentage = total_marks/3;




        if (percentage<40 || maths<33 || eng<33 || science<33) {
            System.out.println("you are fail "+percentage+"%");
        } else {
            System.out.println("you are pass with "+percentage+"%");
        }

        }
    }

