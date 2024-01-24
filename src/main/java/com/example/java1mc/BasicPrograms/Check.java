package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter name");
        String name = sc.nextLine();

        System.out.println("enter age ");
        int age = sc.nextInt();


        System.out.println("enter rollno ");
        int rollNo = sc.nextInt();

        System.out.println("enter address");
        sc.nextLine();
        String address = sc.nextLine();

        System.out.println("Name is :"+name);
        System.out.println("age is :"+age);
        System.out.println("roll no is: "+rollNo);
        System.out.println("address is :"+address);

    }
}
