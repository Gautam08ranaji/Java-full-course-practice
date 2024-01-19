package com.example.java1mc.CWH;

import java.util.Scanner;

public class BoardPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("        BOARD RESULT        ");
        System.out.println("----------------------------");

        System.out.println("Enter The Marks Got in Maths");
        int maths_num = sc.nextInt();

        System.out.println("Enter The Marks Got in English");
        int english_num = sc.nextInt();

        System.out.println("Enter The Marks Got in Science");
        int science_num = sc.nextInt();

        System.out.println("Enter The Marks Got in Hindi");
        int hindi_num = sc.nextInt();

        System.out.println("Enter The Marks Got in Computer");
        int computer_num = sc.nextInt();

        int total_marks = (maths_num + english_num + science_num + hindi_num + computer_num);

        double percentage = total_marks/5;

        System.out.println(percentage);
    }
}
