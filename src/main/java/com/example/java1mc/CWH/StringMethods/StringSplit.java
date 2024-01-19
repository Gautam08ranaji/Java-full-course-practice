package com.example.java1mc.CWH.StringMethods;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {

        String s = "apple,banana,mango";

        String[] fruits = s.split(",");
        System.out.println(Arrays.toString(fruits));
    }
}
