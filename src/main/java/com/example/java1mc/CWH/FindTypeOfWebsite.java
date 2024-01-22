package com.example.java1mc.CWH;

import java.util.Scanner;

public class FindTypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the url of website");
        String website = sc.nextLine();

        if (website.endsWith(".org")){
            System.out.println(website+": is an organization website");
        } else if (website.endsWith(".in")) {
            System.out.println(website+": is an indian website");
        } else if (website.endsWith(".com")) {
            System.out.println(website+": is an commercial website");
        }else {
            System.out.println("another type");
        }
    }
}
